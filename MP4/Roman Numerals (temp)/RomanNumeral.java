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
	//Checking if L, V, and D are repeated at all
	public boolean checkLVD(String input)
	{
		boolean check = false;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for(int i = 0; i<input.length()-1; i++)
		{
			if(input.substring(i, i+1) == "L")
			{
				count1++;
			}
			else if(input.substring(i, i+1) == "V")
			{
				count2++;
			}
			else if(input.substring(i, i+1) == "D")
			{
				count3++;
			}
			if(count1 > 1 || count2 > 1 || count3 > 1)
			{
				check = false;
			}
			else
			{
				check = true;
			}
		}
		return check;
	}

	/** @return true if all the letters are acceptable
	*	false otherwise */
	public boolean isValid(String input)
	{
		//abefghjknopqrstuwyz
		//mdclxvi
		//Put rules here later
		boolean blah = false;
		if(input.contains("A") || input.contains("B")|| input.contains("E")|| input.contains("F")
		|| input.contains("G")|| input.contains("H")|| input.contains("J")||input.contains("K")|| input.contains("N")||
		input.contains("O")||input.contains("P")|| input.contains("Q")|| input.contains("R")|| input.contains("S")||
		input.contains("T")|| input.contains("U")|| input.contains("W")|| input.contains("Y")|| input.contains("Z"))
		{
			blah = false;
		}
		else
		{
			for(int i = 0; i < input.length(); i++)
			{
				if(checkLVD(input) == false)
				{
					i=input.length();
					blah = false;
				}
				else

			}
		}
		return blah;
	}

	/**	Helper method to be used in the assignValueArray
	*	@return the corresponding decimal value for a letter of a roman numeral
	*	Ex: the letter 'M' would return a value of 1000 etc.
	*/
	private int getValue(char ch)
	{
		int value = 0;
		String temp = Character.toString(ch);
		if(temp == "M")
			value = 1000;
		if(temp == "D")
			value = 500;
		if(temp == "C")
			value = 100;
		if(temp == "L")
			value = 50;
		if(temp == "X")
			value = 10;
		if(temp == "V")
			value = 5;
		if(temp == "I")
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
				if((i+1)>values.length && values[i]<values[i+1])
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
		if(isValid(strRoman) == true)
			result = "The value of " + strRoman + " is " + evaluate();
		else
			result = "Invalid characters, please enter a valid numeral: ";
		return result;
	}
}