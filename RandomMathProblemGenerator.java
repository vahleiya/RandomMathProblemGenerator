import java.util.Scanner; 
import java.lang.Math;

public class RandomMathProblemGenerator {
	
	public static void main(String[] args) { 

 		int i = 0;
 		int k = 0; 
 		int option; 
 		int answer; 
 		int loopOption
		int num1; 
		int num2; 
		int sum; 
		int difference; 
		int product; 
		int quotient; 

		while ( k = 0 ) {

			System.out.println("\nHello! \nWould you like to practice some math today? \nEnter a number for one of the following modes: \n1. Addition, 2. Subtraction, 3. Multiplication, or 4. Division\n" ); 

			Scanner input = new Scanner(System.in); 

			option = input.nextInt();

			switch ( option ) {

				case 1:

				while ( i = 0 ) {

					num1 = ( int )( Math.random() *  51 );

					num2 = ( int )(Math.random() * 51 ); 

					System.out.println("What is " + num1 + " + " + num2 + " ? \n");

					sum = num1 + num2; 

					answer = input.nextInt(); 

					if ( answer = sum ) {

						System.out.println("Correct! "); 
				
					}

					else {

						System.out.println("Incorrect. The answer is: " + sum )

					}

					System.out.println("Would you like to 1. continue practicing, 2. go back to main menu, or 3. exit program? Enter your choice of 1, 2, or 3: "); 

					loopOption = input.nextInt(); 

					switch ( loopOption ) {

					case 1:

					break; 

					case 2:

					i++; 

					break; 
						
					}
		
				} 

				break;

			}

		}

	}

}