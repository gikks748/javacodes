public class LeapYear {

  public static void main(String[] args) {

    // year to be checked
    int year = 9;
  if( year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
	  
		 System.out.println(year + " is leap year"); 
	  }
    	
   else {
      System.out.println(year + " is not a leap year.");
  }
  }
 
}
