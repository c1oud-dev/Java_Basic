package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        //절차 지향 프로그로밍 -> 객체 지향 프로그래밍
        //기능과 데이터 묶음
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        //필드 말고도 기능을 수행하는 메서드도 사용 가능하다.
        System.out.println("최종 숫자 = "+ valueObject.value);
    }
}
