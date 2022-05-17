package website_homework.OOP.Exercise7;

public class CircleFactory {
    public static Circle createCircle(CircleType type, double radius){
        Circle circle =
            switch (type){
                case CIRCLE -> new Circle(radius);
                case RESIZABLE_CIRCLE -> new ResizableCircle(radius);
                default -> null;
            };
            return circle;
    }
}
