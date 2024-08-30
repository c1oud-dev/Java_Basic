package poly.ex.sender;

/**
 * 한번에 여러 곳에 메시지를 발송하는 프로그램
 * 조건 : 다형성 활용, Sender 인터페이스 사용
 */
public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
