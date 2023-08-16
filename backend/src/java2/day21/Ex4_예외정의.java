package java2.day21;

public class Ex4_예외정의 {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(5000);
		} catch (잔고부족예외 e) {
			System.out.println(e);
		}
		
		try {
			// 예금액이 부족하면 출금 불가 --> 고의적으로 예외 발생시킴
			account.withdraw(20000);
		} catch (잔고부족예외 e) {
			System.out.println(e);
		}
		
	}

}
