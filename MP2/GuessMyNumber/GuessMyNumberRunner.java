// Name
// Guess My Number Client
// Spec: Client for guess my number program
import java.util.Scanner;

public class GuessMyNumberRunner
{
	public static void main (String[] args)
	{
		GuessMyNumber game;
		Scanner sc = new Scanner(System.in);
		int guess, upperBound;
		String result, again = "y";

		// Build a runner to play the Guess My Number game
		// Make sure you consider how the object works
		// Allow the user to play again if they like
		System.out.print("Welcome to Guess my Number!\n");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter a number to guess up to: ");
			upperBound=sc.nextInt();
			game=new GuessMyNumber(upperBound);
			System.out.print("\n");
			System.out.print("Enter a number between 1 and " + upperBound + ": ");
			guess=sc.nextInt();
			result=game.getResult(guess);
			System.out.print(result);
			while(result!="Correct!\n")
			{
				System.out.print("Enter a number between 1 and " + upperBound + ": ");
				guess=sc.nextInt();
				result=game.getResult(guess);
				System.out.print(result);
			}
			System.out.print("\nCongratulations, you got it!\n");
			System.out.print("Guesses: " + game.getCount() + "\n");
			System.out.print("Rank: " + game.getRank() + "\n");
			System.out.print("Play again? y/n: ");
			again=sc.next();
		}
	}
}
/*
Welcome to Guess my Number!

Enter a number to guess up to: 37

Enter a number between 1 and 37: 5
Too low
Enter a number between 1 and 37: 6
Too low
Enter a number between 1 and 37: 30
Too high
Enter a number between 1 and 37: 20
Too high
Enter a number between 1 and 37: 15
Too high
Enter a number between 1 and 37: 13
Correct!

Congratulations, you got it!
Guesses: 6
Rank: Pretty Good
Play again? y/n: n
Press any key to continue . . .
*/