package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HolidayCalendar {

    private DayOfWeek dayOfWeekHoliday;

    public boolean isHoliday(LocalDate aDate) {
        return aDate.getDayOfWeek().equals(dayOfWeekHoliday);
    }

    public void makeDateOfWeekHoliday(DayOfWeek dayOfWeek) {
        dayOfWeekHoliday = dayOfWeek;
    }
}
