package website_homework.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SDAArrayListTest {
    private static SDAArrayList SDAList;
    @BeforeEach
    void init(){
        SDAList = new SDAArrayList<>();
    }
    @Test
    void sizeShouldEqualTwoAfterAddingTwoElements(){
        //given
        int expectedResult = 2;
        //when
        SDAList.add("one");
        SDAList.add("two");
        //then
        Assertions.assertEquals(expectedResult, SDAList.getSDAArrayList().size());
    }
    @Test
    void sizeShouldEqualOneAfterAddingTwoElementsAndRemovingOne(){
        //given
        int expectedResult = 1;
        //when
        SDAList.add("one");
        SDAList.add("two");
        SDAList.remove("one");
        //then
        Assertions.assertEquals(expectedResult, SDAList.getSDAArrayList().size());
    }
    @Test
    void shouldReturnGivenItemFromList(){
        //when
        SDAList.add("one");
        SDAList.add("two");
        String result = (String) SDAList.get(0);
        //then
        Assertions.assertEquals("one", result);
    }

}