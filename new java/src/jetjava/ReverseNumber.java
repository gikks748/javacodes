package jetjava;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int n=1223;
		int sum=0;
			
		while (n>0) {
			int r= n%10;
			n= n/10;
			sum=(sum*10)+r;
			
		}
		
		System.out.println("Rever number " + sum);

	}

}
