package oop1;

public class ValueObject {
    //속성(데이터)과 기능(메서드)을 함께 포함
    int value;

    void add() {
        value++; //본인 인스턴스에 있는 멤버 변수에 접근한다.
        System.out.println("숫자 증가 value = " + value);
    }
}
