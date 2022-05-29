package Day3.Exercise28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MyArrayListTest {
    private static final MyArrayList<Integer> exampleList = new MyArrayList<>();

    {
        exampleList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
    @Test
    void shouldReturnResultListWithSpecificElements(){
        //given
        MyArrayList<Integer> expectedResult = new MyArrayList<>();
        expectedResult.add(2);
        expectedResult.add(5);
        expectedResult.add(8);
        //when
        List<Integer> result = exampleList.getEveryNthElement(1, 2);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}