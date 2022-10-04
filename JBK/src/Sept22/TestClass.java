package Sept22;

public class TestClass {

	public static void main (String[] args) {
		
		Student s1 = new Student();
		
		s1.accept(101, "Gajanan", 50, 50, 50);
		s1.doStudy();
		s1.display();
		System.out.println("################");
		
		s1.accept(102, "Chiu", 50, 50, 50);
		s1.doStudy();
		s1.display();
		System.out.println("total marks" +s1.total);
		System.out.println("################");
		
		s1.accept(103, "Bhavika", 50, 50, 50);
		s1.doStudy();
		s1.display();
		System.out.println("################");
	}
}
