package sept28_Maths;

public class Fibbonachi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 111;
		int a = 0, b = 1;
		int c;
		System.out.print(a + ",");
		for (int i = 0; i<=num - 2; i++ ) {
			c = a + b ;
			System.out.print(c + ",");
			 a = b;
			 b = c;
		}

	}

}
