package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceMain1 = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

/**
 * 인터페이스를 사용해야 하는 이유
 * 인터페이스를 만드는 이유는 인테페이스를 구현하는 곳에서
 * 인터페이스의 메서드를 반드시 구현해야라는 규약(제약)을 주는 것이다.
 * 그런데 순수 추상 클래스의 경우 미래에 누군가 그곳에 실행 가능한 메서드를 끼워 넣을 수 있기 때문에
 * 그것은 더이상 순수 추상 클래스가 아니게 돼서 인터페이스를 사용해 이런 문제를 원전 차단할 수 있다.
 *
 * 클래스 상속은 부모를 하나만 지정할 수 있는데 인터페이스를 사용하면 부모를 여러명 둘 수 있다.
 * 이것을 다중 구현 혹은 다중 상속이라고 한다.
 */
