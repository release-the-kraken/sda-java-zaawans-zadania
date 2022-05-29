package Day3.Exercise27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JoinerTest {
    @Test
    void shouldReturnCorrectStringFormatFromStrings(){
        //given
        Joiner<String> joiner = new Joiner("+");
        String expectedResult = "a+b+c";
        //when
        String result = joiner.join("a", "b", "c");
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    void shouldReturnCorrectStringFormatFromIntegers(){
        //given
        Joiner<Integer> joiner = new Joiner(" | ");
        String expectedResult = "2 | 5 | 7 | 9";
        //when
        String result = joiner.join(2, 5, 7, 9);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}