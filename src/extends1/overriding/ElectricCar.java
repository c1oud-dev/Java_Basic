package extends1.overriding;


public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }

    //메서드 오버라이딩
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
//오버라이딩 조건
//메서드 이름, 매개변수(파라미터), 반환 타입, 접근 제어자가 같아야 한다.
//예외 : 상위 클래스의 메서드보다 더 많은 체크 예외를 throws로 선언할 수 없다.
//static, final, private 키워드가 붙은 메서드는 오버라이딩 될 수 없다.
//생성자는 오버라이딩 할 수 없다.
