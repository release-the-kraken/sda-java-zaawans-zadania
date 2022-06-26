package website_homework.classes_and_interfaces.Exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private static final String VALID_EMAIL = "valid@email.com";
    private static final String INVALID_EMAIL = "@invalidemail.com";
    private static final String INVALID_STRING = "unknown";
    UserValidator userValidator = new UserValidator();
    @Test
    void shouldReturnTrueForBothValidEmails(){
        //when
            String[] result = userValidator.validateEmails(VALID_EMAIL, VALID_EMAIL);
        //then
        Assertions.assertEquals(VALID_EMAIL, result[0]);
        Assertions.assertEquals(VALID_EMAIL, result[1]);
    }
    @Test
    void shouldReturnTrueForBothInvalidEmails(){
        //when
            String[] result = userValidator.validateEmails(INVALID_EMAIL, INVALID_EMAIL);
        //then
        Assertions.assertEquals(INVALID_STRING, result[0]);
        Assertions.assertEquals(INVALID_STRING, result[1]);
    }
    @Test
    void shouldReturnTrueForValidMainEmailAndFalseForInvalidAlternativeEmail(){
        //when
            String[] result = userValidator.validateEmails(VALID_EMAIL, INVALID_EMAIL);
        //then
        Assertions.assertEquals(VALID_EMAIL, result[0]);
        Assertions.assertNotEquals(VALID_EMAIL, result[1]);
    }
    @Test
    void shouldReturnFalseForInvlidMainEmailAndTrueForValidAlternativeEmail(){
        //when
            String[] result = userValidator.validateEmails(INVALID_EMAIL, VALID_EMAIL);
        //then
        Assertions.assertNotEquals(VALID_EMAIL, result[0]);
        Assertions.assertEquals(VALID_EMAIL, result[1]);
    }

}