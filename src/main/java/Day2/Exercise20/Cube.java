package Day2.Exercise20;

public class Cube extends Shape3D {
    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    double calculateVolume() {
        return a * a * a;
    }


}
