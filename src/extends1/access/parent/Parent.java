package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue; //같은 패키지에서 호출 허용, 패캐지가 달라도 상속 관계 호출 허용
    int defaultValue; //defalut는 생략, 같은 패키지 안에서 호출 허용
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }
    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); //부모 메서드 안에서 접근 가능
        System.out.println("privateValue = " + privateValue); //부모 메서드 안에서 접근 가능

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
