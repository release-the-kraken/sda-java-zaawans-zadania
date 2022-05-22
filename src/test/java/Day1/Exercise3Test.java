package Day1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {
    @Test
    void shouldReturnStringFromMap(){
        //given
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Java", 9);
        myMap.put("Python", 4);
        myMap.put("Ruby", 8);
        //when
        String result = Exercise3.getStringFromMap(myMap);
        //then
        assertTrue(result instanceof String);
    }

}