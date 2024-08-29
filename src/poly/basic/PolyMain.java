package poly.basic;

/**
 * 다형적 참조: 부모는 자식을 품을 수 있다.
 */

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); //Parent 인스턴스 생성(메모리 상에 자식은 생성X)
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();
    }
}
//부모 타입은 자신을 포함해서, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
//이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라고 한다.
//그러나 자식 메서드를 호출이 불가능하다는 한계가 있다.
//이를 해결하기 위해 캐스팅이 필요하다.
