package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //이미 User라는 이름을 가진 클래스를 a에서 사용했기 때문에
        //b 패키지에 있는 User 클래스는 풀로 적어줘야 한다.

        //같은 이름의 클래스가 있다면 import는 둘 중 하나만 선택 가능
        //이때는 자주 사용하는 클래스를 import하고 나머지를 패키지를 포함한
        //전체 경로를 적어주면 된다.
    }
}
