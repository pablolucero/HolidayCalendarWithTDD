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
    @DisplayName("a day of week can be holiday")
    void aDayOfWeekCanBeHoliday() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DayOfWeekHolidayRule(DayOfWeek.SATURDAY));
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
        holidayCalendar.addHolidayRule(new DayOfWeekHolidayRule(DayOfWeek.SATURDAY));
        holidayCalendar.addHolidayRule(new DayOfWeekHolidayRule(DayOfWeek.SUNDAY));
        assertTrue(holidayCalendar.isHoliday(aSaturday));
        assertTrue(holidayCalendar.isHoliday(aSunday));
    }

    @Test
    @DisplayName("a day of month can be holiday")
    void aDayOfMonthCanBeHoliday() {
        LocalDate aJanuaryFirst = LocalDate.of(2014, 1, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DayOfMonthHolidayRule(1, 1));
        assertTrue(holidayCalendar.isHoliday(aJanuaryFirst));
    }

    @Test
    @DisplayName("a day of month can not be holiday")
    void aDayOfMonthCanNotBeHoliday() {
        LocalDate aChristmas = LocalDate.of(2014, 12, 25);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DayOfMonthHolidayRule(1, 1));
        assertFalse(holidayCalendar.isHoliday(aChristmas));
    }

    @Test
    @DisplayName("more than one day of month can be holiday")
    void moreThanOneDayOfMonthCanBeHoliday() {
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DayOfMonthHolidayRule(1, 1));
        holidayCalendar.addHolidayRule(new DayOfMonthHolidayRule(12, 25));

        LocalDate aJanuaryFirst = LocalDate.of(2014, 1, 1);
        LocalDate aChristmas = LocalDate.of(2014, 12, 25);

        assertTrue(holidayCalendar.isHoliday(aJanuaryFirst));
        assertTrue(holidayCalendar.isHoliday(aChristmas));
    }

    @Test
    @DisplayName("a day can be holiday")
    void aDayCanBeHoliday() {
        LocalDate aJanuaryFirst = LocalDate.of(2014, 1, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DateHolidayRule(LocalDate.of(2014, 1, 1)));
        assertTrue(holidayCalendar.isHoliday(aJanuaryFirst));
    }

    @Test
    @DisplayName("a day can not be holiday")
    void aDayCanNotBeHoliday() {
        LocalDate aJanuaryFirst = LocalDate.of(2014, 1, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertFalse(holidayCalendar.isHoliday(aJanuaryFirst));
    }

    @Test
    @DisplayName("more than one day can be holiday")
    void moreThanOneDayCanBeHoliday() {
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new DateHolidayRule(LocalDate.of(2014, 1, 1)));
        holidayCalendar.addHolidayRule(new DateHolidayRule(LocalDate.of(2014, 12, 25)));

        LocalDate aJanuaryFirst = LocalDate.of(2014, 1, 1);
        LocalDate aChristmas = LocalDate.of(2014, 12, 25);

        assertTrue(holidayCalendar.isHoliday(aJanuaryFirst));
        assertTrue(holidayCalendar.isHoliday(aChristmas));
    }

    @Test
    @DisplayName("a day of the week can be a holiday in a range of dates")
    void aDayOfTheWeekCanBeAHolidayInARangeOfDates() {
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        holidayCalendar.addHolidayRule(new CompoundRangeHolidayRule(LocalDate.of(1990, 1, 1),
                LocalDate.of(1999, 12, 31), new DayOfWeekHolidayRule(DayOfWeek.MONDAY)));
        assertTrue(holidayCalendar.isHoliday(LocalDate.of(1998, 3, 2)));
        assertTrue(holidayCalendar.isHoliday(LocalDate.of(1990, 1, 1)));
    }
}