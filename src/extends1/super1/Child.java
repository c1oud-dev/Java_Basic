package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this.value = " + this.value); //this 생략 가능
        System.out.println("super.value = " + super.value);

        this.hello(); //this 생략 가능
        super.hello();
    }
    //오버라이딩을 하면 자식 메서드가 호출 되지만
    //super을 사용하면 부모 클래스에 있는 메서드를 호출할 수 있다.
}
