// Jordan Wang
// Guess My magicNumber Object
// Spec: Write a guess my number program with the following features:
//			Stage 1: Basic guessing game with feedback for too high, too low and correct
//			Stage 2: Add a counter variable to keep track of the magicNumber of guesses
//			Stage 3: Allow user to play again w/ a new random value
//			Stage 4: Add a method to provide user feedback based on the number of guesses
//				1-3 Superstar
//				4-6 Pretty Good
//				7-9 Mediocre
//				10 or more - Pathetic
//			Stage 5: Allow the user to set the range of numbers from 1 to whatever number they want

public class GuessMyNumber
{
	private int magicNumber, count;

	/** Default Constructor... initialize your Instance Variables here
	*	Set magicNumber to a random number from 1 to 100
	*	Set count to zero
	*/
	public GuessMyNumber()
	{
		magicNumber =(int)(Math.random() * 100) + 1;
		count = 0;
	}

	/** Overloaded Constructor... allows user to set their own range (upperBound)
	*	Set magicNumber to a random number from 1 to upperBound
	*	Set count to zero
	*/
	public GuessMyNumber(int upperBound)
	{
		magicNumber=(int)(Math.random()*upperBound) + 1;
	}

	/** Accessor method for the count
	*	@return the count */
	public int getCount()
	{
		return count;
	}

	/** @return the result ie "Too High", "Too Low" or "Correct!"
	*	We also want to increment the count here since they took a guess
	*/
	public String getResult(int guess)
	{
		String result="";
		if(guess>magicNumber)
		{
			result="Too high\n";
			count+=1;
		}
		else if(guess<magicNumber)
		{
			result="Too low\n";
			count+=1;
		}
		else if(guess==magicNumber)
		{
			result="Correct!\n";
			count+=1;
		}
		else
		{
			//Jacob was here
		}
		return result;
	}

	/** @return a rank, based on how well they did
	*	You should have at least 4 categories
	*	You can make them up or use those in the spec
	*/
	public String getRank()
	{
		String rank;
		if(count>=1 && count<=3)
		{
			rank="Superstar";
		}
		else if(count>3 && count<=6)
		{
			rank="Pretty Good";
		}
		else if(count>6 && count<=9)
		{
			rank="Mediocre";
		}
		else
		{
			rank="Pathetic";
		}
		return rank;
	}
}