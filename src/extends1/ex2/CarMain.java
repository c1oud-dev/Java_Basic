package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //ElectricCar 클래스에는 move가 없지만 상속을 받아서 사용 가능
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //GasCar 클래스에는 move가 없지만 상속을 받아서 사용 가능
        gasCar.fillUp();
    }
}
//자바는 다중 상속을 지원하지 않는다.
//부모 클래스를 다중 상속 받을 경우 자식 클래스에서 메서드를 호출할 때 어떤
//클래스를 사용해야 할지 애매한 문제가 발생한다. 이것을 다이아몬드 문제라고 한다.
//그러나 인터페이스의 다중 구현을 허용해서 이러한 문제를 해결할 수 있다.
