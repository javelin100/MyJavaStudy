package icesh.chapter06;

public class Account {
	String name;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(money > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.println(money + "����մϴ�.");
			balance += money; //balance = balance + money
		}
	}
	
	void withdraw(int money) {
		if(money < 0) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(money > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.println(money + "����մϴ�.");
			balance -= money; //balance = balance - money
		}
	}
	
	void printAccountInfo() {
		System.out.println("������  : " + name +"(���¹�ȣ: " accNo+ ")");
		System.out.println("�ܾ� : " + balance);
	}
	void printBalance() {
		System.out.println("�ܾ� : " + balance);
	}
}
