//Jordan Wang
//Madlib Program
//Spec: Makes a madlib story based off user input

import java.util.Scanner;

public class Madlib
{
	//Variables needed for story
	String mainCName, month, itemlookedfor, egoliveby, strangeadjective, state, number, typetimeP, numberTimeP;
	String whyLost, wonderingVerb, walkVerb;
	String uncleName, motherName, crazyNoun;
	String womanName;
	Scanner input=new Scanner(System.in);

	public Madlib()
	{
		getInput();
	}

	public void getInput()
	{
		//Name of person
		System.out.print("Enter a masculine name of a person: ");
		mainCName=input.next();
		//Name of state
		System.out.print("Enter an acronym of a state: ");
		state=input.next();
		//Name of month
		System.out.print("Enter one of the 12 months of a year: ");
		month=input.next();
		//Name of items
		System.out.print("Enter the plural name of item: ");
		itemlookedfor=input.next();
		//A strange reason
		System.out.print("Enter a synonym or just the word for strange: ");
		strangeadjective=input.next();
		//Why are you lost?
		System.out.print("Enter a single word a person would say when they are lost: ");
		whyLost=input.next();
		//Verb for wondering
		System.out.print("Enter the past tense of a word that means to wonder: ");
		wonderingVerb=input.next();
		//Verb for walking
		System.out.print("Enter a form of motion (verb): ");
		walkVerb=input.next();
		//Amount of time
		System.out.print("Enter a number between 1-60: ");
		numberTimeP=input.next();
		//Type of time
		System.out.print("Enter a type of time(Minutes, hours, days, etc): ");
		typetimeP=input.next();
		//Saying
		System.out.print("Enter a single word ego to live by: ");
		egoliveby=input.next();
		//Uncle name
		System.out.print("Enter the name an uncle would have: ");
		uncleName=input.next();
		//Mother name
		System.out.print("Enter the name that a mother would have: ");
		motherName=input.next();
		//Lunatic noun
		System.out.print("Enter a noun that means a crazy person: ");
		crazyNoun=input.next();
		//Woman name
		System.out.print("Enter a feminine name: ");
		womanName=input.next();

	}

	public String getPart1()
	{
		String part1;
		part1= "Once upon a time there was a person named " + mainCName + " who lived in " + state + ".\n";
		part1+= "One day, in late " + month + ", " + "decided to go to a museum and look for " + itemlookedfor + ".\n";
		part1+= "But during his/her trip to the museum, for some " + strangeadjective + " reason, " + mainCName + " got lost.\n";
		part1+= "\"" + whyLost + ",\" " + mainCName + " " +  wonderingVerb + ". \nHe continued to " + walkVerb + " around aimlessly in the museum for " + typetimeP + ".\n";
		part1+= mainCName + " refused to admit that he was lost in the museum, as his great, ancient \nuncle once told him, \"" + egoliveby + "\"\n";
		return part1;
	}

	public String getPart2()
	{
		String part2="\n";
		part2+="Flashback\n";
		part2+="\"Hello " + mainCName + ", want to " + walkVerb + " around with me today?\"\n";
		part2+="\"Sure uncle " + uncleName + ".\"\n";
		part2+= mainCName + "'s mother, " + motherName + " was not very happy with them for leaving.\n";
		part2+= motherName + " banned the uncle from ever seeing her child again, saying that he was a " + crazyNoun + ".\n";
		part2+="But before he left, uncle " + uncleName + " told him, \"" + egoliveby + "\"";
		return part2;
	}

	public String getPart3()
	{
		String part3="\n\n";
		part3+="\"Hello, do you need assistance?\" a woman named " + womanName + " asked.\n";
		part3+="Still, " + mainCName + " refused to admit he was lost.\n";
		part3+="A lengthy amount of time passed by, until finally, " + mainCName + " gave up.\n";
		part3+="He came to the conclusion that it he would never find whatever he had been \n looking for.\n";
		part3+="Little did he know that the " + itemlookedfor + " exhibit was at the very front of the museum.\n";
		part3+= mainCName + " was just blinded by his own ego and wasn't able to see it.\n";
		part3+= "The end.\n";
		return part3;
	}

	public String toString()
	{
		String result;
		result= "\n" + getPart1() + getPart2() + getPart3();
		return result;
	}

}
