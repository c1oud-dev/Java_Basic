package access;

public class BanckAccountMain {
    public static void main(String[] args) {
        //balance : 데이터 필드는 외부에 직접 노출하지 않는다. BanckAccount가 제공하는 메서드를 통해서만 접근 가능
        //isAmountValid() : 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이므로 private
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());

        //은행 계좌를 관리하는 개발자와 이걸 가져다쓰는 개발자가 나뉘어져 있다면
        // 만약 검증 메서드를 public으로 설정했다면,
        // 가져다쓰는 개발자는 본인이 이걸 검증해야 하면서 써야 한다는 의문점이 생긴다.

        //그리고 balance 필드도 외부에 노출하게 되도 문제가 생긴다.
    }
}
