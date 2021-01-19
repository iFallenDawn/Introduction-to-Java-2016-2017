//Jordan Wang
//Palindrome Detector
//Spec: Checks whether or not user input is a palindrome
public class Palindrome
{
	private String word;
	private String revWord;

	public Palindrome()
	{
		word = "";
		revWord = "";
	}

	public Palindrome(String input)
	{
		word = stripPunctuation(input);
		revWord = revString(word);
	}

	public void setPalindrome(String input)
	{
		word = stripPunctuation(input);
		revWord = revString(word);
	}

	public boolean isPalindrome()
	{
		if(revWord.equals(word))
			return true;
		else
			return false;
	}

	private String revString(String wordR)
	{
		String revString = "";
		for(int i = wordR.length()-1; i>=0; i--)
		{
			revString += wordR.charAt(i);
		}
		return revString;
	}

	private String stripPunctuation(String userInput)
	{
		String cleanWord = "";
		userInput = userInput.toUpperCase();
		int locationValue;
		for(int i = 0; i<=userInput.length()-1; i++)
		{
			locationValue = userInput.charAt(i);
			if(locationValue >= 48 && locationValue <=57 || locationValue >=65 && locationValue <=90)
			{
				cleanWord+=userInput.charAt(i);
			}
		}
		return cleanWord;
	}

	public String toString()
	{
		String result = "";
		result+= word;
		if(isPalindrome() == true)
		{
			result+= " is a palindrome!";
		}
		else
		{
			result+= " is not a palindrome!";
		}
		return result;
	}
}