package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        //member2에 성적 인수를 넘겨주지 않아도 초기화한 값이 50이 출력
        MemberConstruct member1 = new MemberConstruct("user1", 15,90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        //성적 입력이 꼭 필요한 경우에는 grade가 있는 생성자를 호출하고,
        //그렇지 않은 경우에는 grade가 없는 생성자를 호출하면 된다.
        //grade가 없는 생성자를 호출하면 성적은 50점이 된다.
        //생성자에 매개변수 유무를 말함

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
