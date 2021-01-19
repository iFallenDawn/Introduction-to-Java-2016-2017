// Jordan Wang
// StringUtility
// Spec: A String utility to help analyze and manipulate Strings

public class StringUtility
{
	/** @return the number of vowels (A, E, I, O, U) in the String word */
	public static int getNumVowels(String word)
	{
		int numValues = 0;
		for(int i = 0; i <= word.length()-1; i++)
		{
			String location = word.substring(i,i+1);
			if(location.equalsIgnoreCase("A") ||location.equalsIgnoreCase("E") || location.equalsIgnoreCase("I") || location.equalsIgnoreCase("O") || location.equalsIgnoreCase("U"))
			{
				numValues++;
			}
		}
		return numValues;
	}

	/** @return a String with all the letters reversed from the String fwd */
	public static String reverseWord(String fwd)
	{
		String reverse = "";
		for(int i=fwd.length()-1; i>=0; i--)
		{
			reverse += fwd.charAt(i);
		}
		return reverse;
	}

	/** @return the integer sum of all of the ascii values in word */
	public static int sumAscii(String word)
	{
		int totalAscii = 0;
		for(int i=0; i <= word.length()-1; i++)
		{
			totalAscii += word.charAt(i);
		}
		return totalAscii;
	}
}
