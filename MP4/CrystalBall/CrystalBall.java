// Jordan Wang
// CrystalBall Object
// Spec: has methods for determining random events
import java.util.Arrays;

public class CrystalBall
{
	private String lottoNumbers;
	private String fortune;

	public CrystalBall()
	{
		lottoNumbers = getLottoNumbers();
		fortune = getFortune();
    }

	/** @return a "Yes", "No" or "Maybe" answer
	/*  Use Math.random to generate a number from 0 to 2 and
	/*  build an extended if to return the appropriate result
	*/
    public String getAnswer()
    {
		String answer = "";
		int n = (int)(Math.random()*3);
		if(n == 0)
			answer = "No";
		if(n == 1)
			answer = "Yes";
		if(n == 2 )
			answer = "Maybe";
		return answer;
    }

	/** @return A string with 6 random numbers from 1 to 50 comma separated
	/*  This basic version does not sort and does not check for dups
	*/
    public String getLottoNumbersBasic()
    {
		String lottoNumbers = "";
		for(int i = 0; i<6; i++)
		{
			int n = (int)(Math.random()*50)+1;
			if(i<5)
			{
				lottoNumbers+= n + ", ";
			}
			else
			{
				lottoNumbers+= n;
			}
		}
		return lottoNumbers;
    }

	/** @return A string with 6 random numbers from 1 to 50 comma separated
	/*  Use Arrays.sort() to sort the numbers in an int[] array that you build
	/*  Check for dups using a hasDups() method you will build below
	/*  While there are dups... call getNums() again.
	*/
    public String getLottoNumbers()
    {
		String lottoNumbers = "";
		int[] numbers = getNums();
		while(hasDups(numbers)==true)
		{
			numbers=getNums();
		}
		for(int i = 0; i<6; i++)
		{
			if(i<5)
			{
				lottoNumbers+= numbers[i] + ", ";
			}
			else
			{
				lottoNumbers+= numbers[i];
			}
		}
		return lottoNumbers;
	}

	/** @return An int[] of 6 integers from 1 to 50
	/*  Numbers are not sorted and not checked for dups
	/*  This is a private helper method you will use in getLottoNumbers()
	*/
	private int[] getNums()
	{
		int[] numbers = new int[6];
		for(int i = 0; i < 6; i++)
		{
			int n = (int)(Math.random()*50)+1;
			numbers[i]=n;
		}
		Arrays.sort(numbers);
		return numbers;
	}

	/** @return true if there are dups, false if no dups
	/*  If the array is sorted... then you just need to check
	/*  the current number with it's adjacent value in the array
	/*  If they are the same... return true
	/*  If you get thru the whole array without dups... return false
	*/
	private boolean hasDups(int[] x)
	{
		boolean duplicate = false;
		for(int i = 0; i < 6; i++)
		{
			if(i+1<6)
			{
				if(x[i] == x[i+1])
				{
					duplicate = true;
					i=6;
				}
				else
				{
					duplicate = false;
				}
			}
		}
		return duplicate;
	}

	/** @return a String with a random fortune
	/*  Build a String array with at least 15 different fortunes to keep it interesting
	/*  Generate a random number from 0 to the size of your array and use this index
	/*  to return a String from your fortune array.
	*/
    public String getFortune()
    {
		String fortune = "";
		String []fortuneArray = new String[15];
		fortuneArray[0] = "You will click one of the three buttons on this applet.";
		fortuneArray[1] = "You are filled with a sense of urgency. Be patient or you may end up confused.";
		fortuneArray[2] = "All the troubles you have will pass away very quickly.";
		fortuneArray[3] = "Follow that restless urge to find yourself.";
		fortuneArray[4] = "A lifetime isn't nearly long enough to figure out what it's all about.";
		fortuneArray[5] = "A golden egg of opportunity falls into your lap this week.";
		fortuneArray[6] = "Love is a roller coaster, it has its ups and downs.";
		fortuneArray[7] = "Open up your heart - it can always be closed again.";
		fortuneArray[8] = "By helping someone else today, you may also be helping yourself.";
		fortuneArray[9] = "Start a new project at work -- or start a new job altogether.";
		fortuneArray[10] = "Getting there is only half as far as getting there and back.";
		fortuneArray[11] = "You will enjoy good health, you will be surrounded by luxury.";
		fortuneArray[12] = "Accept the next proposition you hear.";
		fortuneArray[13] = "It is Fortune, not Wisdom, that rules man's life.";
		fortuneArray[14] = "Keep your eyes open. You never know what you might see.";
		int n = (int)(Math.random()*15);
		fortune = fortuneArray[n];
		return fortune;
    }
}


