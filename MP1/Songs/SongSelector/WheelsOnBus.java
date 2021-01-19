// Jordan Wang
// Wheels on the Bus Object
// Spec: Given an item and the noise it makes, sing Wheels on the Bus

public class WheelsOnBus
{
	private String item, sound;

	public WheelsOnBus()
	{
		item="";
		sound="";
	}

	public WheelsOnBus(String userItem, String userSound)
	{
		item=userItem;
		sound=userSound;
	}

	public void setValues(String userItem, String userSound)
	{
		item=userItem;
		sound=userSound;
	}

	/** @return a String with the lyrics to Wheels On The Bus neatly formatted
	*	(as it appears in the spec)
	*/
	public String toString()
	{
		String result;
		result="The " + item + " on the bus goes " + sound + " " + sound + " " + sound + ",\n";
		result+=sound + " " + sound + " " + sound + ",\n";
		result+=sound + " " + sound + " " + sound + ",\n";
		result+="The " + item + " on the bus goes " + sound + " " + sound + " " + sound + ",\n";
		result+="All through the town.\n";
		return result;
	}
}

