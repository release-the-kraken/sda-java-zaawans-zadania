package website_homework.OOP.Exercise6;

public class TestMain {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        MovablePoint point = MovablePoint.from(1, 1, 1, 2);
        System.out.println("Point: " + point.toString());
        point.moveUp();
        point.moveUp();
        point.moveRight();
        System.out.println("Point: " + point.toString());
        point.moveDown();
        point.moveLeft();
        point.moveLeft();
        System.out.println("Point: " + point.toString());
        MovableCircle circle = MovableCircle.create(4, point);
        System.out.println("Circle: " + circle.toString());
        point.moveRight();
        System.out.println("Point: " + point.toString());
        System.out.println("Circle: " + circle.toString());
        MovablePoint newPoint = MovablePoint.from(10, 10, 3, 4);
        circle.setMovablePoint(newPoint);
        Movable[] movablesArray = {point, newPoint, circle};
        for (Movable movable : movablesArray){
            movable.moveUp();

            System.out.println(movable);
        }


    }


}
