package extends1.ex2;

//'자동차의 기능을 물려받겠다' 즉, GasCar 클래스는 자식 클래스, Car는 부모 클래스
public class GasCar extends Car{

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
