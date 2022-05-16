package Exercise1;

import java.util.Arrays;

public class PointMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D(2, 5, 1);
        System.out.println(point2D + "\t|\t" + point3D);
        point2D.setX(6);
        point2D.setY(9);
        System.out.println(point2D);
        System.out.println("Point2D as array: " + Arrays.toString(point2D.getXY()));
        System.out.println("Point3D as array: " + Arrays.toString(point3D.getXYZ()));


    }
}
