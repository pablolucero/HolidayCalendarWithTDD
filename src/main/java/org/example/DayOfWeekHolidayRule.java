package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekHolidayRule implements HolidayRule {

    private final DayOfWeek dayOfWeek;

    public DayOfWeekHolidayRule(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean isHoliday(LocalDate aDate) {
        return aDate.getDayOfWeek().equals(dayOfWeek);
    }
}
