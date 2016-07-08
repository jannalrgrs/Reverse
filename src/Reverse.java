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
		
	
			System.out.println(rev);
		}
	}
	
}