package construct;

public class MemberThis {
    String nameField;

    //이런 경우는 멤버변수와 매개변수의 이름이 달라서 구분이 가능
    //자바가 자동으로 this를 붙인다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    //옛날에는 명확한 구분을 위해 this를 개발자가 다 붙여줬다.
    //그러나 요즘 IDE가 많이 발전돼서 색으로 구분해줘서 요즘은 굳이 붙일 필요가 없다.
    //그러나 김영한씨의 생각이라고 한다... ㅋㅋㅋㅋ
}
