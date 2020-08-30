package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {

    private final List<DayOfWeek> dayOfWeekHoliday = new ArrayList<>();

    public boolean isHoliday(LocalDate aDate) {
        return dayOfWeekHoliday.contains(aDate.getDayOfWeek());
    }

    public void makeDateOfWeekHoliday(DayOfWeek dayOfWeek) {
        dayOfWeekHoliday.add(dayOfWeek);
    }
}
