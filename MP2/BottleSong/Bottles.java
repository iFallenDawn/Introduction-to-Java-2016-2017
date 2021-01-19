//Jordan Wang
//Bottle Song
//Spec: Returns the bottle song based off user input.

public class Bottles
{
	//Variables needed by user
	String beverage;
	int itemNumber;

	public Bottles()
	{
		beverage="";
		itemNumber=0;
	}

	public Bottles(String item, int number)
	{
		beverage=item;
		itemNumber=number;
	}

	public void setValues(String item, int number)
	{
		beverage=item;
		itemNumber=number;
	}

	public String toString()
	{
		String result="";
		for(int i=itemNumber;i>0;i--)
		{
			if(i==2)
			{
				result+="\n" + i + " bottles of " + beverage + " on the wall\n";
				result+= i + " bottles of " + beverage + "\n";
				result+="Take one down, pass it around\n";
				result+=(i-1) + " bottle of " + beverage + " on the wall!\n";
			}
			else if(i<2)
			{
				result+="\n" + i + " bottle of " + beverage + " on the wall\n";
				result+= i + " bottle of " + beverage + "\n";
				result+="Take one down, pass it around\n";
				result+="No more bottles of " + beverage + " on the wall!\n";
			}
			else
			{
				result+="\n" + i + " bottles of " + beverage + " on the wall\n";
				result+= i + " bottles of " + beverage + "\n";
				result+="Take one down, pass it around\n";
				result+=(i-1) + " bottles of " + beverage + " on the wall!\n";
			}

		}
		return result;
	}
}


