
import java.util.Scanner;
//import java.lang.ArithmeticException;
public class exercise4 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		int temp=0;
		
		for (int i=1; i<=number;i++) {
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
			else {
				temp=0;
			}
			
		}
			
			
		
		
	}
}
