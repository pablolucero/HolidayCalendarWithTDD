package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class XXXTest {

    @Test
    void test01() {
        LocalDate aSaturday = LocalDate.of(2014, 3, 1);
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        assertTrue(holidayCalendar.isHoliday(aSaturday));
    }

}