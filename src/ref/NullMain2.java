package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생(여기서 예외가 발생하기 때문에)
        System.out.println("data = " + data.value); //(그래서 이 문장은 수행되지 않는다.)
    }
}
