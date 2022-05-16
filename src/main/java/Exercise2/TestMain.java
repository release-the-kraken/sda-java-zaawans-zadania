package Exercise2;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("Kosmo Kramer", "New York");
        Person student = new Student("Computer Science", 2, 5000);
        student.setName("Don Pedro");
        student.setAddress("Kraina Deszczowców");
        Person staffer = new Staff("Janitor", 1500);
        staffer.setName("Janitor");
        staffer.setAddress("Sacred Heart");
        Person[] personArray = {person, student, staffer};
        Arrays.asList(personArray)
                .stream()
                .forEach(System.out::println);
    }
}
