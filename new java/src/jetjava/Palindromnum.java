package jetjava;

public class Palindromnum {

	public static void main(String[] args) {
		int n=121;
		int sum=0; int t=n;//we add n into temporary t variable because n is becoming 0 inthe while loop
			
		while (n>0) {
			int r= n%10;
			n= n/10;
			sum=(sum*10)+r;
		}
		if(t == sum )
			System.out.println( t + " is Pallimdrom Number " );
		else
			System.out.println( " is not Pallimdrom Number " );
	}

}
