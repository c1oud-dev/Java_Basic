package extends1.ex2;

//'자동차의 기능을 물려받겠다' 즉, ElectricCar 클래스는 자식 클래스, Car는 부모 클래스
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }
}
