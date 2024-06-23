package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        //다른 패키지에서 public은 접근 가능하지만 defalut는 안 된다.
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가
        //DefalutClass1 class1 = new DefalutClass1();
        //DefalutClass2 class2 = new DefalutClass2();
    }
}
