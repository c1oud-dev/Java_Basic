package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        //defalut여도 같은 패키지이므로 호출 가능하다.
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
