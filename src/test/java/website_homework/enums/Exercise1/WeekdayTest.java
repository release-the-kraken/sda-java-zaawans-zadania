package website_homework.enums.Exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static website_homework.enums.Exercise1.Weekday.*;

class WeekdayTest {
    @Test
    void shouldReturnTrueForCallingIsWeekDayOnWednesday(){
        //when
        boolean result = WEDNESDAY.isWeekDay();
        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    void shouldReturnFalseForCallingIsWeekDayOnWednesday(){
        //when
        boolean result = WEDNESDAY.isHoliday();
        //then
        Assertions.assertNotEquals(true, result);
    }
    @Test
    void shouldReturnTrueForCallingIsHolidayOnSaturday(){
        //when
        boolean result = SATURDAY.isHoliday();
        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    void shouldReturnTrueForComparingThursdayWithTuesday(){
        //when
        boolean result = THURSDAY.whichIsGreater(TUESDAY);
        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    void shouldReturnFalseForComparingThursdayWithSunday(){
        //when
        boolean result = THURSDAY.whichIsGreater(SUNDAY);
        //then
        Assertions.assertNotEquals(true, result);
    }

}