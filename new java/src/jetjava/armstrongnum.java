package jetjava;

public class armstrongnum {

	public static void main(String[] args) {
	
		int n=152;
		int sum=0; int t=n;//we add n into temporary t variable because n is becoming 0 inthe while loop
			
		while (n>0) {
			int r= n%10;
			n= n/10;
			sum=sum+(r*r*r);
		}
		if(t == sum )
			System.out.println( t + " is Armstrong Number " );
		else
			System.out.println( t +" is not Armstrong Number " );

	}

}
