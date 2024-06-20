package construct;

public class MemberDefault {
    String name;

    //자바는 개발자가 적지 않아도 자동으로 기본 생성자를 만들어줌
    //그러나 개발자가 생성자를 하나라도 적으면 자바에서 기본 생성자가 제공되지 않는다.
    //예시로는 생성자를 정의한 후에 main에서 인수를 넘겨주지 않을 때 에러가 발생하는 경우가 있다.
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
