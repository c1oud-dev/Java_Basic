package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child(); //import 필요 - 패키지가 다름
        child.call();
    }
}
