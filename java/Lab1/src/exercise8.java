import java.util.Scanner;
public class exercise8 {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		while (number%2==0) {
			number=number/2;
			}
		if(number==1) {
			System.out.println("Given number is a power of 2");
		}
		else {
			System.out.println("Given number is not a power of 2");
		}
			
		
	}

}
