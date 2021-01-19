//Jordan Wang
//Happy Birthday Program
//Spec: Sings happy birthday

public class Birthday
{
	private String name;

	public Birthday()
	{
		name="";
	}

	public Birthday(String nm)
	{
		name=nm;
	}

	public void setName(String nm)
	{
		name=nm;
	}

	public String toString()
	{
		String result;
		result="Happy Birthday to you..." + "\n";
		result+="Happy Birthday to you..." + "\n";
		result+="Happy Birthday dear " + name + "!\n";
		result+="Happy Birthday to you!" + "\n";
		return result;
	}
}