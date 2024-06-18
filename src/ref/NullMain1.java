package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; //참조값을 넣고 싶지 않을 때, 가리키는 대상이 없다는 말
        System.out.println("1. data = " + data);
        data = new Data(); //참조값 생성
        System.out.println("2. data = " + data);
        data = null; //다시 참조값 비우기(이전에 만든 Data 인스턴스를 더는 참조하지 않음
        System.out.println("3. data = " + data);
    }
}
