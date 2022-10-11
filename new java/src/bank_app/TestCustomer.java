package bank_app;

public class TestCustomer {

	public static void main(String[] args) {
			
		Customer c1 = new Customer(112233, "Raj", 29, "Pune", "DHKL90R", "abc@gmail.com", 13300.00);
		Customer c2 = new Customer(112234, "Mon", 39, "Pune", "DHKL80R", "def@gmail.com", 15000.00);
		c1.details();
		System.out.println("----------------------------------------");
		c2.details();
	}

}
