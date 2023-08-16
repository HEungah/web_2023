package java2.day21;

public class Account {
	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 메소드
	public void withdraw(int money) throws 잔고부족예외 {
		if(balance < money) {
			// 예금액이 부족하면 출금 금지
			throw new 잔고부족예외("잔고가 부족합니다 : " + (money - balance) + "이 모자람");
		}
		balance -= money;
	}
	

}
