package website_homework.OOP.Exercise6;

public class MovableCircle implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    int radius;
    MovablePoint movablePoint;

    private MovableCircle(int radius, MovablePoint movablePoint) {
        this.x = movablePoint.x;
        this.y = movablePoint.y;
        this.xSpeed = movablePoint.xSpeed;
        this.ySpeed = movablePoint.ySpeed;
        this.radius = radius;
        this.movablePoint = movablePoint;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    static MovableCircle create(int radius, MovablePoint movablePoint) {
        return new MovableCircle(radius, movablePoint);
    }

    @Override
    public String toString() {
        return "x=" + movablePoint.x +
                ", y=" + movablePoint.y +
                ", xSpeed=" + movablePoint.xSpeed +
                ", ySpeed=" + movablePoint.ySpeed +
                ", radius=" + radius;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }
}
