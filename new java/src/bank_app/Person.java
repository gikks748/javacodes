package bank_app;

public class Person {

		int adhar_id;
		String Name;
		int age;
		
		
		 Person(int adhar_id, String Name, int age) {
			this.adhar_id=adhar_id;
			this.Name=Name;
			this.age=age;
		}
		 void details() {
			 System.out.println(adhar_id);
			 System.out.println(Name);
			 System.out.println(age);
			 
		 }
		
	}
