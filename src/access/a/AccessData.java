package access.a;

public class AccessData {
    //접근 제어자 사용 - 필드, 메서드
    public int publicField;
    int defaultField;
    private int privareField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 = " + publicField);
    }
    void defalultMethod() {
        System.out.println("defaultMethod 호출 = " + defaultField);
    }
    private void privateMethod() {
        System.out.println("privareMethod 호출 = " + privareField);
    }
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privareField = 300;
        privateMethod();
        defalultMethod();
        publicMethod();
    }
}
