import java.util.Scanner; 
import java.lang.Math;

public class RandomMathProblemGenerator {
	
	public static void main(String[] args) { 

 		int i = 0;
 		int k = 0; 
 		int option; 
 		int answer; 
 		int loopOption; 
		int num1; 
		int num2; 
		int sum; 
		int difference; 
		int product; 
		int quotient; 

		while ( k == 0 ) {

			System.out.println(); 

			System.out.println("\nHello! ");  

			System.out.println(); 

			System.out.println("Would you like to practice some math today? "); 

			System.out.println(); 

			System.out.println("Enter a number for one of the following modes: \n");  

			System.out.println(); 

			System.out.println("1. Addition\n");  

			System.out.println("2. Subtraction\n"); 

			System.out.println("3. Multiplication\n"); 

			System.out.println("4. Division\n"); 

			System.out.println();

			i = 0;

			Scanner input = new Scanner(System.in); 

			option = input.nextInt();

			System.out.println(); 

			switch ( option ) {

				case 1:

				while ( i == 0 ) {

					num1 = ( int )( Math.random() *  101 );

					num2 = ( int )(Math.random() * 101 ); 

					System.out.println("What is " + num1 + " + " + num2 + " ? \n");

					sum = num1 + num2; 

					answer = input.nextInt(); 

					if ( answer == sum ) {

						System.out.println("\nCorrect! "); 

						System.out.println(); 
				
					}

					else {

						System.out.println(); 

						System.out.println("Incorrect. The answer is: " + sum ); 

						System.out.println();

					}

					System.out.println("Would you like to: \n");  

					System.out.println(); 

					System.out.println("1. continue practicing? \n"); 

					System.out.println("2. go back to main menu? \n");

					System.out.println("3. exit program? \n"); 

					System.out.println(); 

					System.out.println("Enter your choice of 1, 2, or 3: \n"); 

					loopOption = input.nextInt(); 

					switch ( loopOption ) {

					case 1:

					System.out.println(); 

					break; 

					case 2:

					i++; 

					break; 

					case 3: 

					System.out.println(); 

					System.out.println("Come practice again soon! "); 

					System.out.println();

					System.exit(1); 

					break; 

					}
		
				} 

				break;

				case 2:

				while ( i == 0 ) {

					num1 = ( int )( Math.random() *  51 );

					num2 = ( int )( Math.random() * 51 );

					if ( num1 >= num2 ) {

						System.out.println("What is " + num1 + " - " + num2 + " ? \n");

						difference = num1 - num2;

						answer = input.nextInt();

						if ( answer == difference ) {

							System.out.println("\nCorrect! "); 

							System.out.println(); 
				
						}

						else {

							System.out.println(); 

							System.out.println("Incorrect. The answer is: " + difference); 

							System.out.println();

						}

					}

					else {

						System.out.println("What is " + num2 + " - " + num1 + " ? \n");

						difference = num2 - num1;	

						answer = input.nextInt();

						if ( answer == difference ) {

							System.out.println("\nCorrect! "); 

							System.out.println(); 
				
						}

						else {

							System.out.println(); 

							System.out.println("Incorrect. The answer is: " + difference); 

							System.out.println();

						}

					}

					System.out.println("Would you like to: \n");  

					System.out.println(); 

					System.out.println("1. continue practicing? \n"); 

					System.out.println("2. go back to main menu? \n");

					System.out.println("3. exit program? \n"); 

					System.out.println(); 

					System.out.println("Enter your choice of 1, 2, or 3: \n"); 

					loopOption = input.nextInt(); 

					switch ( loopOption ) {

					case 1:

					System.out.println(); 

					break; 

					case 2:

					i++; 

					break; 

					case 3: 

					System.out.println(); 

					System.out.println("Come practice again soon! "); 

					System.out.println();

					System.exit(1); 

					break; 

					}
		
				} 

				break; 

			}

		}

	}

}