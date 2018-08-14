package icesh.chapter06;

public class Account {
	String name;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println(money + "출금합니다.");
			balance += money; //balance = balance + money
		}
	}
	
	void withdraw(int money) {
		if(money < 0) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println(money + "출금합니다.");
			balance -= money; //balance = balance - money
		}
	}
	
	void printAccountInfo() {
		System.out.println("예금주  : " + name +"(계좌번호: " accNo+ ")");
		System.out.println("잔액 : " + balance);
	}
	void printBalance() {
		System.out.println("잔액 : " + balance);
	}
}
