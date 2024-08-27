package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); //생략 불가
        //super(10); //컴파일 오류
        System.out.println("ClassC 생성자");
    }
    //생성자는 하나만 호출할 수 있다. 두 생성자 중 하나만 선택
}
