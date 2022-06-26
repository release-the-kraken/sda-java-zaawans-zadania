package website_homework.classes_and_interfaces.Exercise2;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String genre;
    private String publisher;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class MovieCreator{
        private String title = "N/A";
        private String director = "N/A";
        private int year;
        private String genre = "N/A";
        private String publisher = "N/A";

        MovieCreator title(String title){
            this.title = title;
            return this;
        }
        MovieCreator director(String director){
            this.director = director;
            return this;
        }
        MovieCreator year(int year){
            this.year = year;
            return this;
        }
        MovieCreator genre(String genre){
            this.genre = genre;
            return this;
        }
        MovieCreator publisher(String publisher){
            this.publisher = publisher;
            return this;
        }
        Movie create(){
            Movie movie = new Movie();
            movie.setTitle(this.title);
            movie.setDirector(this.director);
            movie.setYear(this.year);
            movie.setGenre(this.genre);
            movie.setPublisher(this.publisher);
            return movie;
        }
    }
}
