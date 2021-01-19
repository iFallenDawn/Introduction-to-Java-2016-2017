//Jordan Wang
//Sheep Counter
//Spec: Counts sheep based off user input.

public class Sheep
{
	private int numSheep;

	/** Default Constructor... set numSheep to zero */
	public Sheep()
	{
		numSheep=0;
	}

	/** Initialization Constructor
	*	set the value of your Instance Variable based on the parameter */
	public Sheep(int howMany)
	{
		numSheep=howMany;
	}

	public void setNumSheep(int howMany)
	{
		numSheep=howMany;
	}

	public String getOneSheep()
	{
		String result = "";
		for(int i=1;i<=1;i++)
		{
			result+="\n  _________\n";
			result+=" /         \\\n";
			result+="/    o o    \\\n";
			result+="|   _   _    \\\n";
			result+=" \\   \\_/      \\@@@@@@@@@@@@@@@@@@@@\n";
			result+="  \\          @@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="   \\@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
			result+="          1111                 1111\n";
		}
		return result;
	}


	public String toString()
	{
		String result = "";
		for(int i=1;i<=numSheep;i++)
		{
			result+= i + " sheep";
			result+=getOneSheep() + "\n";
		}
		return result;
	}
}