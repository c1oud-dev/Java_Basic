package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자
    //생성자는 반환타입이 없다. 나머지는 메서드랑 같다.
    //생성자는 클래스 이름과 동일해야 한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //추가
    MemberConstruct(String name, int age) {
        /*this.name = name;
        this.age = age;
        this.grade = 50; //값을 한 번 줘보자*/

        //그러나 위 코드에서 반복되는 게 너무나 많다.
        //this.name, this.age 등등
        //따라서 이걸 해결하려면 아래와 같다.
        this(name, age, 50); //변경

        //this()사용 시 주의사항
        //반드시 첫째 줄에 사용해야 한다. 그렇지 않으면 컴파일 오류가 난다.
    }
}
