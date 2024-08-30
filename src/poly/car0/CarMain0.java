package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
/**
 * Driver와 K3Car을 먼저 생성하고 driver.setK3Car(..)을 통해 driver에게 k3Car의 참조를 넘겨줌
 */
