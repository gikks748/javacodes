package bank_app;

public class Emp extends Person{
	
	int ecode;
	double salary;
	
	Emp(int adhar_id, String Name, int age, int ecode, double salary){
		super(adhar_id, Name, age);
		
		this.age=age;
		this.salary=salary;
		
	}
	@Override
	void details() {
		System.out.println(adhar_id);
		System.out.println(Name);
		System.out.println(age);
		System.out.println("employee code is " + ecode);
		System.out.println("Employee salary is " + salary);
	}
}
