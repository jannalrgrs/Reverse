import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Integer Below: ");
		System.out.println("======================="); /* line isn't necessary
														 for code, but adds a
														 visual element.*/

		int number = input.nextInt();
		int rev = 0;
		while (number > 0) { /*
								 * The while loop seems more convenient in
								 * situations where the input integer's size is
								 * unknown, versus for loops*/
								 

			rev = rev * 10 + (number) % 10;
			number = (number / 10);

		}

		System.out.println(rev); /* Inside curly brackets of while loop, System.out.println(rev)
		 						   is executed as many times as the loop runs,*/									 	

	}
	
}