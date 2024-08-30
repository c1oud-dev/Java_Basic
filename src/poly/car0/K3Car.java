package poly.car0;

/**
 * 운전자와 자동차의 관계 알아보기
 * 먼저 다형성을 사용하지 않고, 역할과 구현을 분리하지 않고 단순하게 개발
 */
public class K3Car {
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    public void offEngine() {
        System.out.println("K3Car.offEngine");
    }

    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
