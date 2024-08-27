package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor(); //Car클래스의 openDoor 메서드를 사용

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
//기능을 추가하고 클래스를 확장
//상속 관계 덕분에 중복은 줄어들고, 새로운 수소차를 편리하게 확장한 것을 알 수 있음
