package static2;

public class DecoUtil2 {
    //static을 붙여서 정적 메서드를 만들기
    //정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
