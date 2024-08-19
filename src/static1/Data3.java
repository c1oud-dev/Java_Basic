package static1;

public class Data3 {
    public String name; //인스턴스 변수
    public static int count; //static , 클래스 변수(클래스 자체에 소속되어 있다)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
