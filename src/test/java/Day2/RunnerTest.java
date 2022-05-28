package Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {
    @Test
    void shouldReturnIntermediateForGivenTimeOf200(){
        //when
        Runner result = Runner.getFitnessLevel(200);
        //then
        Assertions.assertEquals(Runner.INTERMEDIATE, result);
    }
    @Test
    void shouldThrowExceptionForTimeOutOfLimit(){
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Runner.getFitnessLevel(1000));
    }
}