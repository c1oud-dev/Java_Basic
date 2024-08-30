package poly.ex.pay0;

/**
 * 결제 시스템 개발
 * 새로운 결제수단을 쉽게 추가할 수 있도록 기존 코드를 리팩토링하라
 * 이 팀은 현재 2가지 결제 수단을 지원하는데 앞으로 5개의 결제 수단을 추가로 지원할 예정이다.
 */
public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
