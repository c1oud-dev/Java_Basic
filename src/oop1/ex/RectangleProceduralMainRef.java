package oop1.ex;

public class RectangleProceduralMainRef {
    public static void main(String[] args) {
        RectangleRef rectangleRef = new RectangleRef();
        rectangleRef.width = 5;
        rectangleRef.height = 8;

        int area = rectangleRef.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangleRef.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangleRef.isSquare();
        System.out.println("정사각형 여부 : " + square);

    }
}
