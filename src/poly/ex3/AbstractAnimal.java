package poly.ex3;

/**
 * 추상 클래스 : 부모 클래스는 제공하지만, 실제 생성되면 안 되는 클래스
 * 추상적인 개념만을 제공하는 클래스이고, 실체인 인스턴스가 존재하지 않는다.
 * 따라서 직접 인스턴스를 생성하지 못하는 제약이 추가된 것
 */

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

/**
 * 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
 * 추상 메서드는 메서드 바디가 없다.
 * 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
*/