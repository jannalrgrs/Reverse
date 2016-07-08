import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			
		   System.out.println("Enter Number Below: ");
		   System.out.println("======================="); // line isn't necessary for code, but adds a visual element
		
		int number = input.nextInt();
		int rev = 0;
	
		while (number != 0) {
		//The while loop seems more convenient in situations where the input integer's size is unknown, versus for loops 
			
			rev = rev * 10 + (number) % 10; 
			number = (number / 10);  
		
		}
		//Adjust System.out.println to receive only the final integer, instead of 1 per loop.
		
			System.out.println(rev);
	}
	
}