package org.example;

import java.time.LocalDate;

public interface HolidayRule {
    boolean isHoliday(LocalDate aDate);
}
