import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number to Reverse: ");
		System.out.println("======================="); /// line isn't necessary, but adds a visual element
							
		int number = input.nextInt();
		int rev = 0;
		while (number > 0) {   /*  The while loop seems more convenient in
								  situations where the input integer's size is unknown, versus for loops*/
								  
								 

			rev = rev * 10 + (number) % 10;
			number = number / 10;		/* Information stored in variable number's data type (int) will
											causes number to be rounded down to an integer instead of a 
											decimal*/									

		}

		System.out.println(rev); /* Inside curly brackets of while loop, System.out.println(rev)
		 						   is executed as many times as the loop runs. Slowly builds to the
		 						   final reversed number*/									 	

	}
	
}