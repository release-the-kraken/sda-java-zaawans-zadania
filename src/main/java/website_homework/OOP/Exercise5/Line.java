package website_homework.OOP.Exercise5;

import website_homework.OOP.Exercise1.Point2D;

public class Line {
    Point2D lineBeginPoint;
    Point2D lineEndPoint;

    private Line(Point2D lineBeginPoint, Point2D lineEndPoint) {
        this.lineBeginPoint = new Point2D();
        this.lineEndPoint = new Point2D();
    }

    private Line(float beginPointX, float beginPointY, float endPointX, float endPointY) {
        this.lineBeginPoint = new Point2D(beginPointX, beginPointY);
        this.lineEndPoint = new Point2D(endPointX, endPointY);
    }
    static Line from(Point2D lineBeginPoint, Point2D lineEndPoint){
        return new Line(lineBeginPoint, lineEndPoint);
    }
    static Line of(float beginPointX, float beginPointY, float endPointX, float endPointY){
        return new Line(beginPointX, beginPointY, endPointX, endPointY);
    }
    float getLength(){
        float differenceOfXs = lineBeginPoint.getX() - lineEndPoint.getX();
        float differenceOfYs = lineBeginPoint.getY() - lineEndPoint.getY();
        float powerOfDiffX = (float) Math.pow(differenceOfXs, 2);
        float powerOfDiffY = (float) Math.pow(differenceOfYs, 2);
        float result = (float) Math.sqrt(powerOfDiffX + powerOfDiffY);
        return result;
    }
    float[] getMidPointCoordinates(){
        float sumOfXs = lineBeginPoint.getX() + lineEndPoint.getX();
        float sumOfYs = lineBeginPoint.getY() + lineEndPoint.getY();
        float middlePointX = sumOfXs / 2;
        float middlePointY = sumOfYs / 2;
        float[] middlePointCoordinates = {middlePointX, middlePointY};
        return middlePointCoordinates;
    }

}
