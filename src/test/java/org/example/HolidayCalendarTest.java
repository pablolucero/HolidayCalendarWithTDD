package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
class HolidayCalendarTest {

    @Test
    @DisplayName("a day can be holiday")
    void aDayCanBeHoliday() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SATURDAY);
        assertTrue(holidayCalendar.isHoliday(aSaturday));
    }

    @Test
    @DisplayName("a day of week can not be holiday")
    void aDayOfWeekCanNotBeHoliday() {
        LocalDate aMonday = LocalDate.of(2014, 3, 3);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertFalse(holidayCalendar.isHoliday(aMonday));
    }

    @Test
    @DisplayName("more than one day of week can be holiday")
    void moreThanOneDayOfWeekCanBeHoliday() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        LocalDate aSunday = LocalDate.of(2014, 3, 2);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SATURDAY);
        holidayCalendar.makeDateOfWeekHoliday(DayOfWeek.SUNDAY);
        assertTrue(holidayCalendar.isHoliday(aSaturday));
        assertTrue(holidayCalendar.isHoliday(aSunday));
    }
}