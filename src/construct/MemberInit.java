package construct;

public class MemberInit {
    //생성자가 필요한 이유
    //객체를 생성하는 시점에 어떤 작업을 하고 싶을 때 사용
    String name;
    int age;
    int grade;

    //this를 붙이는 이유는 매개변수인지 멤버 변수인지 구분이 안 가기 때문
    //this를 안 붙였을 경우, 자바는 가장 가까운 scope의 변수를 가져온다.
    //this를 붙이면 자기 자신의 인스턴스를 가리킨다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
