package org.example;

import java.time.LocalDate;
import java.time.MonthDay;

public class DayOfMonthHolidayRule implements HolidayRule {

    private final MonthDay monthDay;

    public DayOfMonthHolidayRule(int aMonthNumber, int aDayNumber) {
        this.monthDay = MonthDay.of(aMonthNumber, aDayNumber);
    }

    @Override
    public boolean isHoliday(LocalDate aDate) {
        return monthDay.equals(MonthDay.from(aDate));
    }
}
