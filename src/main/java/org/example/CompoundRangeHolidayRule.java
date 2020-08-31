package org.example;

import java.time.LocalDate;

public class CompoundRangeHolidayRule implements HolidayRule {

    private final LocalDate from;
    private final LocalDate to;
    private final HolidayRule holidayRule;

    public CompoundRangeHolidayRule(LocalDate from, LocalDate to, HolidayRule holidayRule) {
        this.from = from;
        this.to = to;
        this.holidayRule = holidayRule;
    }

    @Override
    public boolean isHoliday(LocalDate aDate) {
        return (aDate.isAfter(from) || aDate.equals(from))
                && (aDate.isBefore(to) || aDate.equals(to))
                && holidayRule.isHoliday(aDate);
    }
}
