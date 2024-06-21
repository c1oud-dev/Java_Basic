package pack;

//import pack.a.User;
import pack.a.*; //pack.a의 모든 클래스 사용

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지의 클래스를 가져올 때
        User user = new User(); //import 사용으로 패키지 명 생략 가능
    }
}
