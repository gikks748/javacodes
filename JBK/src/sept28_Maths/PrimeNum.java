package sept28_Maths;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 51;
		int total =0;
		
		for (int i=1; i<=a; a++) {
			if(a % i == 0) 
				total++;
		}
	
		if (total == 2 ) {
			System.out.println(i + "is Prime");
		}
		else {
			System.out.println( a + "is Not Prime");
		}
}
}
