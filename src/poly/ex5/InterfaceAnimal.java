package poly.ex5;

/**
 * 인터페이스는 추상 클래스와 유사하다.
 * 다른 점은 interface 키워드를 사용
 * 메서드는 'public abstract' 생략 가능
 * 그리고 인터페이스를 상속받을 때는 extends 대신 implements라는 구현이라는 키워드를 사용한다.
 */
public interface InterfaceAnimal {
    void sound();
    void move();
}
