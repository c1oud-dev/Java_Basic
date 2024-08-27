package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        //super(); //기본 생성자 생략 가능 (부모 생성자가 기본 생성자이기 때문)
        //수정
        this(a, 0);
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
