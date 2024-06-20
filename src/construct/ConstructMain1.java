package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //생성자는 괄호 안에 값을 넘겨주지 않으면 에러가 난다.
        //생성자는 인스턴스를 생성하고 나서 즉시 생성자 호출이 된다.
        //호출하는 방법은 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
        MemberConstruct member1 = new MemberConstruct("user1", 15,90);
        MemberConstruct member2 = new MemberConstruct("user2", 16,80);

        //원래는 이전에 했던 것처럼 객체를 사용하여 값을 넣어줘야 하는 번거로움이 있었다.
        //예시 - member1.initMember("user1", 15,90);
        //그러나 생성자로 인해 값을 넣고 바로 호출이 가능하다.
        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
