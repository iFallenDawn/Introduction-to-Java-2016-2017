// Jordan Wang
// Time Converter
// Spec: Converts between days, hours, and mins.

public class TimeConvert
{
	//Variables
	private int totalMins;

	public TimeConvert()
	{
		totalMins=0;
	}

	public TimeConvert(int mins)
	{
		totalMins=mins;
	}

	public int getDays()
	{
		int days;
		days=totalMins/60/24;
		return days;
	}

	public int getHours()
	{
		int hours;
		hours=totalMins/60%24;
		return hours;
	}

	public int getMins()
	{
		int mins;
		mins=totalMins%60;
		return mins;
	}

	public String toString()
	{
		String result= "Equivalent to: " + "\n";
		result+="		" + getDays() + " Day(s)" + "\n";
		result+="		" + getHours() + " Hour(s)" + "\n";
		result+="		" + getMins() + " Min(s)" + "\n";
		return result;
	}
}