package Sept22;

public class Student {

	int rollN;
	String Name;
	int m1;
	int m2;
	int m3;
	int total;
	float per;


void accept(int rollN, String Name, int m1, int m2, int m3) {
	this.rollN = rollN;
	this.Name = Name;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	}

void display() {
	System.out.println("Roll No is " + rollN);
	System.out.println("name  is " + Name);
	total = m1 +  m2 + m3;
	System.out.println("total marks is " + total );
	System.out.println("percentage is " + total/3);
}

void doStudy() {
	if(per < 50 ) {
		System.out.println(Name + " is studing >>>>>> ");
	}
	else
	System.out.println(Name + " is not studing >>>>>> ");
}
}