//Jordan Wang
//Digit Mod Program
//Spec: Returns hundreds, tens, and ones for digits in between 100-999.

public class DigitMod
{
	//variables
	private int number;

	public DigitMod()
	{
		number=0;
	}

	public DigitMod(int num)
	{
		number=num;
	}

	//All the methods
	public int getHundreds()
	{
		int hundreds;
		hundreds=number/100;
		return hundreds;
	}

	public int getTens()
	{
		int tens;
		tens=number%100/10;
		return tens;
	}

	public int getOnes()
	{
		int ones;
		ones=number%100%10/1;
		return ones;
	}

	//Converts everything to string
	public String toString()
	{
		String result;
		if(number>=100)
		{
			result="	" + getHundreds() + " Hundred(s)" + "\n";
			result+="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else if(number>=10)
		{
			result="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else
		{
			result="	" + getOnes() + " One(s)" + "\n";
		}
		return result;
	}
}