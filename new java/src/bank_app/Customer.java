package bank_app;

public class Customer extends Person {
	
	
	String add;
	String Pan;
	String Email;
	double amount;
	
	 Customer(int adhar_id, String Name, int age, String add, String Pan, String Email, double amount) {
		super(adhar_id, Name, age);
		this.add=add;
		this.Pan=Pan;
		this.Email=Email;
		this.amount=amount;
		
	}
	 @Override
	 void details() {
		 System.out.println(adhar_id);
		 System.out.println(Name);
		 System.out.println(age);
		 System.out.println(add);
		 System.out.println(Pan);
		 System.out.println(Email);
		 System.out.println(amount);
	 }
}
