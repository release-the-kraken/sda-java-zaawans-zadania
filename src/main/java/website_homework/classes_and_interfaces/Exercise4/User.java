package website_homework.classes_and_interfaces.Exercise4;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public void setFirstName(String firstName, Validator<String> validator) {
        if (validator.validate(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName, Validator<String> validator) {
        if (validator.validate(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
