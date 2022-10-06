package Sept22EmpSal;

public class Employee {

	int hra;
	int DA;
	int basics;
	float grossS;
	String name;
	String role;
	int ID;
	

Employee (String name, int ID, String role, int basics){
	this.name = name;
	this.ID = ID;
	this.role = role;
	this.basics = basics;
	this.display();
		
}

void display() {
	
	System.out.println("Employee name is " + name );
	System.out.println("Employee ID is " + ID );
	System.out.println("Employee Role is " + role );
	System.out.println("Employee basic salary  is " + basics );
	hra = basics*10/100;
	System.out.println("Employee hra is " + hra);
	DA = basics*15/100;
	System.out.println("Employee DA is " + DA );
	grossS = hra+basics+DA;
	System.out.println("Employee gross salary  is " + grossS );
	System.out.println("-------------------------");
}

}