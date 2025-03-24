import java.util.Scanner;
import java.util.Random;


public class Guesser {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int choice;


		do {
			System.out.println("\n0) Exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.print("Please enter 0-2: ");
			choice = scanner.nextInt();


			if (choice == 1) {
				humanGuesser(scanner,random);
			} else if (choice == 2){ 
				computerGuesser(scanner);
			}
		} while (choice != 0);

			System.out.println("Goodbye!");
			scanner.close();
		}

		public static void humanGuesser(Scanner scanner, Random random){
			int secretNumber = random.nextInt(100) + 1;
			int guess, attempts = 0;

			System.out.println("\nHuman Guesser Mode");
			do{
				attempts++;
				System.out.print(attempts + ") Please enter a number: ");
				guess = scanner.nextInt();

				if (guess < secretNumber) {
					System.out.println("Too low ");
			} else if (guess > secretNumber){
				System.out.println("Too high");
			}else { 
				System.out.println("Got it! Good JOB");
			}
		} while (guess != secretNumber);
	}

	public static void computerGuesser(Scanner scanner){ 
		int low = 1, high = 100, guess, attempts = 0;
		String response;

		System.out.println("\nThink of a number between 1 and 100 ");
		do {
			guess = (low + high) / 2;
			attempts++;
			System.out.println(attempts + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			response = scanner.next();

			if (response.equalsIgnoreCase("H")){
				high = guess - 1;
			}else if (response.equalsIgnoreCase("L")){
				low = guess + 1;
			}
		} while (!response.equalsIgnoreCase("C"));

			System.out.println("Yay! I found your number!");
		}
	}
	
