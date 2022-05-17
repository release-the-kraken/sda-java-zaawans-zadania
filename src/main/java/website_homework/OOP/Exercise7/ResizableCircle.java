package website_homework.OOP.Exercise7;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double resizeRatio = (double) percent / 100;
        radius = radius * resizeRatio;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
