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
        return isDayOfWeekHoliday(aDate) ||
                isDayOfMonthHoliday(aDate) ||
                isDateHoliday(aDate);
    }

    private boolean isDateHoliday(LocalDate aDate) {
        return daysHoliday.contains(aDate);
    }

    private boolean isDayOfMonthHoliday(LocalDate aDate) {
        return daysOfMonthHoliday.contains(MonthDay.from(aDate));
    }

    private boolean isDayOfWeekHoliday(LocalDate aDate) {
        return daysOfWeekHolidays.contains(aDate.getDayOfWeek());
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

    public void makeDateAsHoliday(LocalDate from, LocalDate to, DayOfWeek aDayOfWeek) {

    }
}
