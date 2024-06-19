package oop1.ex;

public class Rectangle {
    //이렇게 해도 되긴 하지만 메서드에는 해당 기능만 있고,
    //출력 기능은 따로 두는 편이 유지보수하기 좋다.
    //따라서 Ref클래스에서 수정
    int width;
    int height;

    //넓이 구하기
    void calculateArea(int width, int height) {
        System.out.println("넓이 : " + (width * height));
    }

    //둘레 길이 구하기
    void calculatePerimeter(int width, int height) {
        System.out.println("둘레 길이 : " + (2 * (width + height)));
    }

    //정사각형 여부 구하기
    void isSquare(int width, int height) {
        if(width == height) {
            System.out.println("정사각형 여부 : true");
        } else {
            System.out.println("정사각형 여부 : false");
        }
    }
}
