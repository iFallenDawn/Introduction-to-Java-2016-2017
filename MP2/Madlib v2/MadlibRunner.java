//Jordan Wang
//Madlib Program
//Spec: Makes a madlib story based off user input
import java.util.Scanner;

public class MadlibRunner
{
	public static void main(String[] args)
	{
		System.out.println("Madlib Maker\n");
		Scanner sc= new Scanner(System.in);
		String again = "y";
		Madlib story;

		while(again.equalsIgnoreCase("y"))
		{
			story=new Madlib();
			System.out.print(story);
			System.out.print("\n");
			System.out.print("Do it again? <y or n>: ");
			again=sc.next();
		}
	}
}
/*
Madlib Maker

Enter a masculine name of a person: Obama
Enter an acronym of a state: NJ
Enter one of the 12 months of a year: March
Enter the plural name of item: pencils
Enter a synonym or just the word for strange: strange
Enter a single word a person would say when they are lost: Why
Enter the past tense of a word that means to wonder: wondered
Enter a form of motion (verb): walk
Enter a number between 1-60: 50
Enter a type of time(Minutes, hours, days, etc): minutes
Enter a single word ego to live by: Yolo
Enter the name an uncle would have: Barack
Enter the name that a mother would have: Patrice
Enter a noun that means a crazy person: lunatic
Enter a feminine name: Pubert

Once upon a time there was a person named Obama who lived in NJ.
One day, in late March, decided to go to a museum and look for pencils.
But during his/her trip to the museum, for some strange reason, Obama got lost.
"Why," Obama wondered.
He continued to walk around aimlessly in the museum for minutes.
Obama refused to admit that he was lost in the museum, as his great, ancient
uncle once told him, "Yolo"

Flashback
"Hello Obama, want to walk around with me today?"
"Sure uncle Barack."
Obama's mother, Patrice was not very happy with them for leaving.
Patrice banned the uncle from ever seeing her child again, saying that he was a
lunatic.
But before he left, uncle Barack told him, "Yolo"

"Hello, do you need assistance?" a woman named Pubert asked.
Still, Obama refused to admit he was lost.
A lengthy amount of time passed by, until finally, Obama gave up.
He came to the conclusion that it he would never find whatever he had been
 looking for.
Little did he know that the pencils exhibit was at the very front of the museum.

Obama was just blinded by his own ego and wasn't able to see it.
The end.

Do it again? <y or n>:
*/



