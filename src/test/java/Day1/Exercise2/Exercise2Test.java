package Day1.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Exercise2Test {
    private final static List<String> UNSORTED = List.of("a", "C", "d", "L", "z");
    private final static List<String> SORTED = List.of("z", "L", "d", "C", "a");
    @Test
    void shouldReturnSortedInReverseIgnoringCase(){
        //when
        List<String> result = Exercise2.sortIgnoringCase(UNSORTED);
        //then
        Assertions.assertEquals(SORTED, result);
       // assertThat(result).isEqualTo(SORTED);
    }

}