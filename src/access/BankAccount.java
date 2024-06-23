package access;

public class BankAccount {
    //데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.
    private int balance; //데이터 숨기기

    public BankAccount() {
        balance = 0;
    }
    //public 메서드 : depoist
    public void deposit(int amount) {
        if(isAmountValue(amount)) { //검증
            balance += amount;
        } else {
            System.out.println("요효하지 않은 금액입니다.");
        }

    }

    //public 메서드 : withdraw
    public void withdraw(int amount) {
        if(isAmountValue(amount) && balance - amount >= 0) { //검증
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족함");
        }
    }

    //public 메서드 : getBalance
    public int getBalance() { //금액 확인
        return balance;
    }

    //이 기능은 여기서만 내부에서만 사용하는 것이므로 private 처리
    private boolean isAmountValue(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }
}
