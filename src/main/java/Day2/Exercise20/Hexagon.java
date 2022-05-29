package Day2.Exercise20;

public class Hexagon extends Shape {
    private final int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 6 * a;
    }
}
