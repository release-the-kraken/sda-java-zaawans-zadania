package website_homework.classes_and_interfaces.Exercise2;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie.MovieCreator()
                .title("Dances with Hobgoblins")
                .director("Pedro Piccolino")
                .create();
        Movie movie2 = new Movie.MovieCreator()
                .title("Lord of the Earrings")
                .director("Peter Pan")
                .year(2000)
                .genre("Romance")
                .publisher("Agent Orange")
                .create();
        System.out.println(movie1);
        System.out.println(movie2);
    }
}
