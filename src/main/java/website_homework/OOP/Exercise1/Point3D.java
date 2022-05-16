package website_homework.OOP.Exercise1;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    float[] getXYZ() {
        float[] pointsArray = {this.getX(), this.getY(), this.z};
        return pointsArray;
    }
    void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + z + ")";
    }
}
