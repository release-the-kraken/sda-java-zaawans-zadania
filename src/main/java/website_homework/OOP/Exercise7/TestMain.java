package website_homework.OOP.Exercise7;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle = CircleFactory.createCircle(CircleType.CIRCLE, 10);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        ResizableCircle resizableCircle = (ResizableCircle) CircleFactory.createCircle(CircleType.RESIZABLE_CIRCLE, 20);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
    }

}
