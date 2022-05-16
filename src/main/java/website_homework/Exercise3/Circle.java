package website_homework.Exercise3;

public class Circle extends Shape {
    double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean isShapeFilled, double radius) {
        super(color, isShapeFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    static Circle create(String color, boolean isShapeFilled, double radius){
        return new Circle(color, isShapeFilled, radius);
    }
    @Override
    public String toString() {
        return "Circle with radius=" + radius+  "which is a subclass off " + super.toString();
    }
}
