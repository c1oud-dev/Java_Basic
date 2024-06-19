package oop1.ex;

public class RectangleRef {
    int width;
    int height;

    
    //넓이 구하기
    int calculateArea() {
        return width * height;
    }

    //둘레 길이 구하기
    int calculatePerimeter() {
       return 2 * (width + height);
    }

    //정사각형 여부 구하기
    boolean isSquare() {
        return width == height;
    }
}
