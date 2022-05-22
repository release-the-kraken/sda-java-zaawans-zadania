package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise1Test {
    private final static List<String> UNSORTED = List.of("a", "c", "d", "l", "z");
    private final static List<String> SORTED = List.of("z", "l", "d", "c", "a");
    @Test
    void shouldReturnSortedInReverseWithAnonymousClass(){
        //when
        List<String> result = Exercise1.sortUsingAnonymousClass(UNSORTED);
        //then
        Assertions.assertEquals(SORTED, result);
    }
    @Test
    void shouldReturnSortedInReverseWithOwnComparator(){
        //when
        List<String> result = Exercise1.sortedUsingOwnComparator(UNSORTED);
        //then
        Assertions.assertEquals(SORTED, result);

    }
    @Test
    void shouldReturnSortedInReverseWithStream(){
        //when
        List<String> result = Exercise1.sortedUsingOwnStream(UNSORTED);
        //then
        Assertions.assertEquals(SORTED, result);

    }


}