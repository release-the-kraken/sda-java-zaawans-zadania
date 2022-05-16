package website_homework.Exercise3;

public class TestMain {
    public static void main(String[] args) {
        Rectangle rectangle = Rectangle.create("red", true, 4, 6);
        Rectangle square = new Square(6, 8);
        System.out.println("Square area = " + square.getArea());
        System.out.println("Square perimeter = " + square.getPerimeter());
    }


}
