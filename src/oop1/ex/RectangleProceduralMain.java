package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        rectangle.calculateArea(rectangle.width, rectangle.height);
        rectangle.calculatePerimeter(rectangle.width, rectangle.height);
        rectangle.isSquare(rectangle.width, rectangle.height);
    }
}
