//Jordan Wang
//Random Numbers
//Spec: Prints random numbers based off conditions given

public class RandomNumbers
{
	/** @return a random number from 1 to 100 inclusive
	*	Useful for guessing game, random grades etc. */
	public int getRange1to100()
	{
		return (int)(Math.random()*100)+1;
	}

	/** @return a random number from 1 to 21 inclusive*/
	public int getRange1to21()
	{
		return (int)(Math.random()*21)+1;
	}

	/** @return a random number from 5 to 10 inclusive*/
	public int getRange5to10()
	{
		return (int)(Math.random()*6)+5;
	}

	/** @return a random number from 10 to 19 inclusive*/
	public int getRange10to19()
	{
		return (int)(Math.random()*10)+10;
	}

	/** @return a random number from 3 to 6 inclusive
	*	Corresponds with ASCII values for hearts, diamonds, spades, clubs */
	public int getRange3to6()
	{
		return (int)(Math.random()*4)+3;
	}

	/** @return a random number from 11 to 13 inclusive
	*	Could be used to represent a face card */
	public int getRange11to13()
	{
		return (int)(Math.random()*3)+11;
	}

	/** @return a random number from 5 to 15 inclusive */
	public int getRange5to15()
	{
		return (int)(Math.random()*11)+5;
	}

	/** @return a random number from 100 to 199 inclusive */
	public int getRange100to199()
	{
		return (int)(Math.random()*100)+100;
	}

	/** @return a random number from 101 to 200 inclusive */
	public int getRange101to200()
	{
		return (int)(Math.random()*100)+101;
	}

	public int getRange100to200()
	{
		return (int)(Math.random()*101)+100;
	}
}
