package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {

    private final List<DayOfWeek> daysOfWeekHolidays = new ArrayList<>();
    private final List<MonthDay> daysOfMonthHoliday = new ArrayList<>();
    private final List<LocalDate> daysHoliday = new ArrayList<>();

    public boolean isHoliday(LocalDate aDate) {
        return daysOfWeekHolidays.contains(aDate.getDayOfWeek()) ||
                daysOfMonthHoliday.contains(MonthDay.from(aDate)) ||
                daysHoliday.contains(aDate);
    }

    public void makeDateOfWeekHoliday(DayOfWeek dayOfWeek) {
        daysOfWeekHolidays.add(dayOfWeek);
    }

    public void makeDateOfMonthHoliday(int aMonthNumber, int aDayNumber) {
        daysOfMonthHoliday.add(MonthDay.of(aMonthNumber, aDayNumber));
    }

    public void makeDateAsHoliday(LocalDate aDate) {
        daysHoliday.add(aDate);
    }
}
