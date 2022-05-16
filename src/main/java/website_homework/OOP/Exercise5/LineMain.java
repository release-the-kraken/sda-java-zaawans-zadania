package website_homework.OOP.Exercise5;

import java.util.Arrays;

public class LineMain {
    public static void main(String[] args) {
        runApp();        
    }

    private static void runApp() {
        Line line = Line.of(3, 4, 9, 12);
        System.out.println("Starting point = [" + line.lineBeginPoint.getX() + ", " + line.lineBeginPoint.getY() + "]");
        System.out.println("Ending point = [" + line.lineEndPoint.getX() + ", " + line.lineEndPoint.getY() + "]");
        System.out.println("Line length = " + line.getLength());
        System.out.println("Mid point coordinates = " + Arrays.toString(line.getMidPointCoordinates()));

    }
}
