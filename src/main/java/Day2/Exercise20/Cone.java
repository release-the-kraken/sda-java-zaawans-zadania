package Day2.Exercise20;

public class Cone extends Shape3D {
    private final double h;
    private final double r;

    public Cone(double h, double r) {
        this.h = h;
        this.r = r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double calculateVolume() {
        return (1/3) * Math.PI * h * Math.pow(r, 2);
    }


}
