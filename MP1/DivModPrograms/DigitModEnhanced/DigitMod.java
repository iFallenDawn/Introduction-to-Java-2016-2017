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
	public int getMillions()
	{
		int millions;
		millions=number/1000000;
		return millions;
	}

	public int getHundredThousands()
	{
		int hthousands;
		hthousands=number%1000000/100000;
		return hthousands;
	}

	public int getTenThousands()
	{
		int tthousands;
		tthousands=number%1000000%100000/10000;
		return tthousands;
	}

	public int getThousands()
	{
		int thousands;
		thousands=number%1000000%100000%10000/1000;
		return thousands;
	}

	public int getHundreds()
	{
		int hundreds;
		hundreds=number%1000000%100000%10000%1000/100;
		return hundreds;
	}

	public int getTens()
	{
		int tens;
		tens=number%1000000%100000%10000%1000%100/10;
		return tens;
	}

	public int getOnes()
	{
		int ones;
		ones=number%1000000%100000%10000%1000%100%10/1;
		return ones;
	}

	//Converts everything to string
	public String toString()
	{
		String result;
		if(number>=1000000)
		{
			result="	" + getMillions() + " Million(s)" + "\n";
			result+="	" + getHundredThousands() + " Hundred Thousand(s)" + "\n";
			result+="	" + getTenThousands() + " Ten Thousand(s)" + "\n";
			result+="	" + getThousands() + " Thousand(s)" + "\n";
			result+="	" + getHundreds() + " Hundred(s)" + "\n";
			result+="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else if(number>=100000)
		{
			result="	" + getHundredThousands() + " Hundred Thousand(s)" + "\n";
			result+="	" + getTenThousands() + " Ten Thousand(s)" + "\n";
			result+="	" + getThousands() + " Thousand(s)" + "\n";
			result+="	" + getHundreds() + " Hundred(s)" + "\n";
			result+="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else if(number>=10000)
		{
			result="	" + getTenThousands() + " Ten Thousand(s)" + "\n";
			result+="	" + getThousands() + " Thousand(s)" + "\n";
			result+="	" + getHundreds() + " Hundred(s)" + "\n";
			result+="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else if(number>=1000)
		{
			result="	" + getThousands() + " Thousand(s)" + "\n";
			result+="	" + getHundreds() + " Hundred(s)" + "\n";
			result+="	" + getTens() + " Ten(s)" + "\n";
			result+="	" + getOnes() + " One(s)" + "\n";
		}
		else if(number>=100)
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