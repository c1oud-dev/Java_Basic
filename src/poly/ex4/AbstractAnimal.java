package poly.ex4;

/**
 * 순수 추상 클래스 : 모든 메서드가 추상 메서드인 추상 클래스
 * 추상 클래스는 실행 로직을 전혀 가지고 있지 않다.
 * 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
 * 특징
 * 1. 인스턴스를 생성할 수 없다.
 * 2. 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
 * 3. 주로 다형성을 위해 사용한다.
 */

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드
    public abstract void move();
}