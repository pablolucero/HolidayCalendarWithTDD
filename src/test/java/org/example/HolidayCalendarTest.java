package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class HolidayCalendarTest {

    @Test
    void test01() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertTrue(holidayCalendar.isHoliday(aSaturday));
    }

    @Test
    void test02() {
        LocalDate aMonday = LocalDate.of(2014, 3, 3);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertFalse(holidayCalendar.isHoliday(aMonday));
    }

    @Test
    void test03() {
        LocalDate aSunday = LocalDate.of(2014, 3, 2);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertTrue(holidayCalendar.isHoliday(aSunday));
    }
}