package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
        //풀어서 쓰면 x001.data.value -> x001.data는 null이다. 따라서 결과적으로 null.value가 됨
        //위에서 참조값을 생성했는데도 예외가 터지는 이유이다.
    }
}
