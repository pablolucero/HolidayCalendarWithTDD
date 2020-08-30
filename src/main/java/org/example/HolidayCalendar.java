package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {

    private final List<DayOfWeek> daysOfWeekHolidays = new ArrayList<>();

    public boolean isHoliday(LocalDate aDate) {
        return daysOfWeekHolidays.contains(aDate.getDayOfWeek());
    }

    public void makeDateOfWeekHoliday(DayOfWeek dayOfWeek) {
        daysOfWeekHolidays.add(dayOfWeek);
    }
}
