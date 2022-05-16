package website_homework.OOP.Exercise3;

public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    private Rectangle(String color, boolean isShapeFilled, double height, double width) {
        super(color, isShapeFilled);
        this.height = height;
        this.width = width;
    }

    static Rectangle create(String color, boolean isShapeFilled, double height, double width){
        return new Rectangle(color, isShapeFilled, height, width);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return this.height * this.width;
    }

    @Override
    double getPerimeter() {
        return 2 * this.height + 2 * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle with width=" + this.width +  " and height=" + this.height +  "which is a subclass of " + super.toString();
    }
}
