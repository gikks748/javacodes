package Sept26;

public class Account{

	int Acc_no;
	String ename;
	float balance;
	
	
public Account(int acc_no, String ename, float balance) {
		Acc_no = acc_no;
		this.ename = ename;
		this.balance = balance;
		this.display();
	}


void display() {
	System.out.println("Employee account number is " + Acc_no );
	System.out.println("Employee name is " + ename );
	System.out.println("Employee balance is " + balance );
	
}
}