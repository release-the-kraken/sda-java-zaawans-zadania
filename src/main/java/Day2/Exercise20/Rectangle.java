package Day2.Exercise20;

public class Rectangle extends Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return 2 * a + 2 * b;
    }
}
