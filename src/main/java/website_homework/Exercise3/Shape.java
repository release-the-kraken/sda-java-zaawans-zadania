package website_homework.Exercise3;

public abstract class Shape {
    protected String color;
    protected boolean isShapeFilled;

    public Shape() {
        this.color = "unknown";
        isShapeFilled = false;
    }

    public Shape(String color, boolean shouldColorFillShape) {
        this.color = color;
        this.isShapeFilled = shouldColorFillShape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isShapeFilled() {
        return isShapeFilled;
    }

    public void setShapeFilled(boolean shapeFilled) {
        this.isShapeFilled = shapeFilled;
    }

    @Override
    public String toString() {
        String colorFill = isShapeFilled ?
                " filled" : " not filled";
        return "Shape with color of " + color +
                " and " + colorFill;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
