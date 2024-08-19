package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instaceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instaceCall();

        staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();

        //인스턴스를 통한 접근은 좋지 않다.
        //클래스를 통한 접근은 import를 통해서 사용할 수 있다. 그래서 클래스명 생략 가능하다.
    }
}
