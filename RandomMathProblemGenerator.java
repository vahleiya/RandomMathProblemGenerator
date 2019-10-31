import java.util.Scanner; 
import java.lang.Math;

public class RandomMathProblemGenerator {
	
	public static void main(String[] args) { 

 		int i = 0;
 		int k = 0; 
 		String option; 
 		int answer; 
 		double answerDivision; 
 		String loopOption; 
		int num1; 
		int num2; 
		int sum; 
		int difference; 
		int product; 
		double quotient;
		int subMenu;

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
			option = input.nextLine();
			System.out.println(); 

			switch ( option ) {

				case "1":
				while ( i == 0 ) {

					num1 = ( int )( Math.random() *  101 );
					num2 = ( int )(Math.random() * 101 ); 
					System.out.println("What is " + num1 + " + " + num2 + " ? \n");
					sum = num1 + num2; 

					try {
						answer = input.nextInt(); 
						input.nextLine();

						if ( answer == sum ) {
							System.out.println("\nCorrect! "); 
							System.out.println(); 
						}

						else {
							System.out.println(); 
							System.out.println("Incorrect. The answer is: " + sum ); 
							System.out.println();
						}

					}
					catch (Exception e) {

						input.nextLine();
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

					subMenu = 0;

					while (subMenu == 0) {

						loopOption = input.nextLine();

						switch ( loopOption ) {

							case "1":
							System.out.println(); 
							subMenu++;
							break; 

							case "2":
							i++; 
							subMenu++;
							break; 

							case "3": 
							System.out.println(); 
							System.out.println("Come practice again soon! "); 
							System.out.println();
							System.exit(1); 
							break;

							default:
							System.out.println(); 
							System.out.println("Invalid Input! Please enter a number 1 - 3"); 
							System.out.println();
							break;

						}
					}
		
				} 
				break;

				case "2":
				while ( i == 0 ) {

					num1 = ( int )( Math.random() *  51 );
					num2 = ( int )( Math.random() * 51 );

					if ( num1 >= num2 ) {
						System.out.println("What is " + num1 + " - " + num2 + " ? \n");
						difference = num1 - num2;

						try{
							answer = input.nextInt();
							input.nextLine();

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
						catch (Exception e) {
						
						input.nextLine();
						System.out.println(); 
						System.out.println("Incorrect. The answer is: " + difference ); 
						System.out.println();

						}

					}

					else {
						System.out.println("What is " + num2 + " - " + num1 + " ? \n");
						difference = num2 - num1;	

						try{
							answer = input.nextInt();
							input.nextLine();

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
						catch (Exception e) {
						
						input.nextLine();
						System.out.println(); 
						System.out.println("Incorrect. The answer is: " + difference ); 
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
					

					subMenu = 0;

					while (subMenu == 0) {

						loopOption = input.nextLine(); 

						switch ( loopOption ) {

							case "1":
							System.out.println();
							subMenu++;
							break; 

							case "2":
							i++; 
							subMenu++;
							break; 

							case "3": 
							System.out.println(); 
							System.out.println("Come practice again soon! "); 
							System.out.println();
							System.exit(1); 
							break;

							default:
							System.out.println(); 
							System.out.println("Invalid Input! Please enter a number 1 - 3"); 
							System.out.println();
							break;

						}
					}
		
				} 

				break; 

				case "3":
				while ( i == 0 ) {

					num1 = ( int )( Math.random() *  13 );
					num2 = ( int )(Math.random() * 13 ); 
					System.out.println("What is " + num1 + " * " + num2 + " ? \n");
					product = num1 * num2; 

					try{
						answer = input.nextInt(); 
						input.nextLine();

						if ( answer == product ) {
							System.out.println("\nCorrect! "); 
							System.out.println(); 
						}

						else {

							System.out.println(); 
							System.out.println("Incorrect. The answer is: " + product ); 
							System.out.println();

						}
					}
					catch (Exception e) {
						
						input.nextLine();
						System.out.println(); 
						System.out.println("Incorrect. The answer is: " + product ); 
						System.out.println();

					}

					System.out.println("Would you like to: \n");  
					System.out.println(); 
					System.out.println("1. continue practicing? \n"); 
					System.out.println("2. go back to main menu? \n");
					System.out.println("3. exit program? \n"); 
					System.out.println(); 
					System.out.println("Enter your choice of 1, 2, or 3: \n"); 

					subMenu = 0;

					while (subMenu == 0) {

						loopOption = input.nextLine(); 

						switch ( loopOption ) {

							case "1":
							System.out.println(); 
							subMenu++;
							break; 

							case "2":
							i++; 
							subMenu++;
							break; 

							case "3": 
							System.out.println(); 
							System.out.println("Come practice again soon! "); 
							System.out.println();
							System.exit(1);

							break; 

							default:
							System.out.println(); 
							System.out.println("Invalid Input! Please enter a number 1 - 3"); 
							System.out.println();
							break;

						}
					}
		
				} 

				break;

				case "4": 

				while ( i == 0 ) {

					num1 = ( int )( Math.random() * 89 ) + 12;
					num2 = ( int )(Math.random() * 13 ); 
					System.out.println("What is " + num1 + " / " + num2 + " ? Include 2 decimal digits in your answer \n");
					quotient = Math.round(((double)num1 / (double)num2) * 100.0) / 100.0; 

					try{
						answerDivision = input.nextDouble(); 
						input.nextLine();

						if ( answerDivision == quotient ) {
							System.out.println("\nCorrect! "); 
							System.out.println(); 
					
						}

						else {

							System.out.println();
							System.out.println("Incorrect. The answer is: " + quotient ); 
							System.out.println();

						}
					}
					catch (Exception e) {
						
						input.nextLine();
						System.out.println(); 
						System.out.println("Incorrect. The answer is: " + quotient ); 
						System.out.println();

					}

					System.out.println("Would you like to: \n");  
					System.out.println(); 
					System.out.println("1. continue practicing? \n"); 
					System.out.println("2. go back to main menu? \n");
					System.out.println("3. exit program? \n"); 
					System.out.println(); 
					System.out.println("Enter your choice of 1, 2, or 3: \n"); 

					subMenu = 0;

					while (subMenu == 0) {

						loopOption = input.nextLine(); 

						switch ( loopOption ) {

							case "1":
							System.out.println(); 
							subMenu++;
							break; 

							case "2":
							i++; 
							subMenu++;
							break; 

							case "3": 

							System.out.println(); 
							System.out.println("Come practice again soon! "); 
							System.out.println();
							System.exit(1); 

							break; 

							default:
							System.out.println(); 
							System.out.println("Invalid Input! Please enter a number 1 - 3"); 
							System.out.println();
							break;

						}

					}
		
				}

				break;

				default: 

				System.out.println(); 
				System.out.println("Invalid Input! Please enter a number 1 - 4"); 
				i++; 

				break;  

			}

		}

	}

}