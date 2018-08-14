package icesh.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.accNo = "123-456789";
		acc1.name = "ȫ�浿";
		acc1.balance = 10000;
		
		acc1.printAccountInfo();
		acc1.deposit(20000);
		acc1.printBalance();
		
		acc1.withdraw(45000);
		

	}

}
