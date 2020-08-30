package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HolidayCalendar {

    public boolean isHoliday(LocalDate aDate) {
        return aDate.getDayOfWeek().equals(DayOfWeek.SATURDAY);
    }
}
