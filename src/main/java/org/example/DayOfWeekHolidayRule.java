package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekHolidayRule {

    private final DayOfWeek dayOfWeek;

    public DayOfWeekHolidayRule(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public boolean isHoliday(LocalDate aDate) {
        return aDate.getDayOfWeek().equals(dayOfWeek);
    }
}
