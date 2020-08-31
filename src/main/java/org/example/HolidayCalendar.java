package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {

    private final List<HolidayRule> holidayRules = new ArrayList<>();

    public boolean isHoliday(LocalDate aDate) {
        return dateMatchAnyHolidayRule(aDate);
    }

    private boolean dateMatchAnyHolidayRule(LocalDate aDate) {
        return holidayRules
                .stream()
                .anyMatch(aHolidayRule -> aHolidayRule.isHoliday(aDate));
    }

    public void addHolidayRule(HolidayRule holidayRule) {
        holidayRules.add(holidayRule);
    }

    public void addHolidayRule(LocalDate from, LocalDate to, DayOfWeek aDayOfWeek) {

    }
}
