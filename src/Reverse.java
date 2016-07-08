import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter Number Below: ");
		System.out.println("=======================");
		
		int number = input.nextInt();
		int rev = 0;
	
		while (number > 0) {
		
			rev = rev * 10 + (number) % 10;
			number = (number / 10);
		
		}
//Adjust System.out.println in to receive only the final print out, instead of 1/loop.
			System.out.println(rev);
		
	}
	
}