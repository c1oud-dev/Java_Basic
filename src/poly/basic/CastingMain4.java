package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; //다운캐스팅
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        child2.childMethod(); //실행 불가
    }
}
//parent2를 생성했을 때 부모 타입으로 객체를 생성했기 때문에 메모리 상에 자식 타입이 존재하지 않는다.
//따라서 parent2를 다운 캐스팅할 때 Child 인스턴스가 없어서 런타임 오류 발생
//컴파일 오류 vs 런타임 오류
