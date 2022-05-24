package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Exercise5Test {
    private Exercise5 myHashSet;
    @BeforeEach
    void init(){
        myHashSet = new Exercise5();
    }
    @Test
    void shouldNotAddRepeatingItems(){
        //when
        myHashSet.add("Jerry");
        myHashSet.add("George");
        myHashSet.add("Jerry");
        //then
        assertThat(myHashSet.getMyHashSet()).containsExactly("Jerry", "George");
    }
    @Test
    void shouldRemoveGivenItem(){
        //when
        myHashSet.add("Jerry");
        myHashSet.add("George");
        myHashSet.remove("Jerry");
        //then
        assertThat(myHashSet.getMyHashSet()).containsExactly("George");
    }
    @Test
    void shouldReturnTrueForSizeTwoIfTwoItemsAreAdded(){
        //given
        int expectedSize = 2;
        //when
        myHashSet.add("Jerry");
        myHashSet.add("George");
        //then
        Assertions.assertEquals(expectedSize, myHashSet.size());
    }
    @Test
    void shouldReturnTrueIfSetContainsGivenItem(){
        //when
        myHashSet.add("Jerry");
        myHashSet.add("George");

        //then
        assertThat(myHashSet.getMyHashSet()).contains("George");
    }
    @Test
    void sizeShouldEqualZeroIfSetIsCleared(){
        //given
        int expectedSize = 0;
        //when
        myHashSet.add("Jerry");
        myHashSet.add("George");
        myHashSet.add("Kramer");
        myHashSet.clear();
        //then
        Assertions.assertEquals(expectedSize, myHashSet.size());
    }


}