package static1;

import static2.DecoData;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //인스턴스를 통해서 접근해도 static 영역에 있는 걸 가져다 쓴다.

        //클래스를 통한 접근
        System.out.println(Data3.count);

        //둘 다 결과는 같지만, 인스턴스를 통한 접근은 권장하지 않는다.
        //이유는 코드를 읽을 때 인스턴스 변수에 접근한다고 오해할 수 있기 때문이다.
        //data4.count를 봤을 때 인텔리제이에서 노란 박스로 돼 있는 걸 볼 수 있는데
        //이는 관례상 좋지 않다는 걸 알려주는 것이다.
    }
}
