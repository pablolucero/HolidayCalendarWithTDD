package org.example;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HolidayCalendarTest {

    @Test
    void test01() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SATURDAY);
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
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SUNDAY);
        assertTrue(holidayCalendar.isHoliday(aSunday));
    }

    @Test
    void test04() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        LocalDate aSunday = LocalDate.of(2014, 3, 2);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SATURDAY);
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SUNDAY);
        assertTrue(holidayCalendar.isHoliday(aSaturday));
        assertTrue(holidayCalendar.isHoliday(aSunday));
    }
}