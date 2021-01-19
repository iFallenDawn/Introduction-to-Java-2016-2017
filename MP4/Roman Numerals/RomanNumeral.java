// Jordan Wang
// RomanNumeral
// Spec: Object that stores the roman numeral version as a String
//		 along with the integer values for each digit in the roman numeral
//		 It will call the evaluate method in toString()

import javax.swing.JOptionPane; // for error message as a dialog box if you want to use one

public class RomanNumeral
{
	private String strRoman;
	private int[] values;

	/** Initializes strRoman to an empty String and values to null */
	public RomanNumeral()
	{
		strRoman = "";
		values = null;
	}

	/** Initializes strRoman to an upper-case version of input
	*	if the input is valid (all acceptable letters) it will:
	*		- assign the value array
	*		- instantiate the values array to the correct size
	*	otherwise it will set the values array to null
	*/
	public RomanNumeral(String input)
	{
		strRoman = input.toUpperCase();
		if(isValid(strRoman) == true)
		{
			values = new int[strRoman.length()];
			assignValueArray();
		}
		else
		{
			values = null;
		}
	}

	/** @return true if all the letters are acceptable
	*	false otherwise */
	public boolean isValid(String input)
	{
		String roman = "MDCLXVI";
		for(int i = 0; i < input.length(); i++)
		{
			if(input.indexOf(i)!="Blah")
				return false;
		}
		return true;
	}

	/**	Helper method to be used in the assignValueArray
	*	@return the corresponding decimal value for a letter of a roman numeral
	*	Ex: the letter 'M' would return a value of 1000 etc.
	*/
	private int getValue(char ch)
	{
		int value = 0;
		String temp = "" + ch;
		if(temp.equalsIgnoreCase("M"))
			value = 1000;
		if(temp.equalsIgnoreCase("D"))
			value = 500;
		if(temp.equalsIgnoreCase("C"))
			value = 100;
		if(temp.equalsIgnoreCase("L"))
			value = 50;
		if(temp.equalsIgnoreCase("X"))
			value = 10;
		if(temp.equalsIgnoreCase("V"))
			value = 5;
		if(temp.equalsIgnoreCase("I"))
			value = 1;
		return value;
	}

	/** Assigns the values array based on the value of each letter of the roman numeral String */
	public void assignValueArray()
	{
		for(int i = 0; i < strRoman.length(); i++)
		{
			char temp = strRoman.charAt(i);
			values[i] = getValue(temp);
		}
	}

	/** @return the decimal value of this roman numeral
	*	Don't forget to first check for null in the case of a bad input
	*	otherwise, this puppy will crash and burn when you try to access elements of a null reference
	*/
	public int evaluate()
	{
		int sum = 0;
		if(values!=null)
		{
			for(int i = 0; i < values.length; i++)
			{
				if((i+1)<values.length && values[i]<values[i+1])
				{
					sum-=values[i];
				}
				else
				{
					sum+= values[i];
				}
			}
		}
		return sum;
	}

	/**	@return the roman numeral and either the value or " is not a valid Roman Numeral"
	*	Ex: "XIV = 14", or "XTW is not a valid Roman Numeral"
	*	Hint: Check to see if value is null */
	public String toString()
	{
		String result = "";
		if(isValid(strRoman))
			result = "The value of " + strRoman + " is " + evaluate() + "\n";
		else
			result = "Invalid characters, please enter a valid numeral: ";
		return result;
	}
}