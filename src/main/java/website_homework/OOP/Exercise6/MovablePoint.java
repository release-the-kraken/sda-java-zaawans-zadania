package website_homework.OOP.Exercise6;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    private MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    static MovablePoint from(int x, int y, int xSpeed, int ySpeed) {
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
}
