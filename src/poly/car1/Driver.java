package poly.car1;

/**
 * 운전자는 자동차(Car)의 역할에만 의존한다. 구현인 K3, Model3 자동차에 의존하지 않는다.
 */
public class Driver {
    public Car car; //Car 인터페이스 참조

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다. " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
