package org.example;

import java.time.LocalDate;

public class DateHolidayRule implements HolidayRule {

    private final LocalDate aDate;

    public DateHolidayRule(LocalDate aDate) {
        this.aDate = aDate;
    }

    @Override
    public boolean isHoliday(LocalDate aDate) {
        return this.aDate.equals(aDate);
    }
}
