
import java.util.Scanner;

public class exercise7 {
	 public static void main(String args[]) {

	      boolean flag=false;
	      int num;
	      Scanner scan=new Scanner(System.in);
	      System.out.println("Enter any number");
	      num=scan.nextInt();
	      int currentDigit=num%10;
	      num=num/10;
	      
	      while(num>0) {
	    	  if(currentDigit<=num%10) {
	    		  flag=true;
	    		  break;
	    	  }
	    	  currentDigit=num%10;
		      num=num/10;
	      }
	      if(flag==true) {
	    	  System.out.println("Numbers are not in increasing order");
	      }
	      else {
	    	  System.out.println("Numbers are in increasing order");
	      }
	     	      
	    }

}