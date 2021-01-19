//Jordan Wang
//Old MacDonald Program
//Spec: Sings Old MacDonald based off user input

public class OldMacDonald
{
	private String animal, sound;
	public OldMacDonald()
	{
		animal="";
		sound="";
	}
	public OldMacDonald(String userAnimal, String userSound)
	{
		animal=userAnimal;
		sound=userSound;
	}

	public void setStrings(String userAnimal, String userSound)
	{
		animal=userAnimal;
		sound=userSound;
	}

	public String toString()
	{
		String result;
		result="Old MacDonald had a farm,\n";
		result+="E-I-E-I-O!\n";
		result+="And on his farm he had a " + animal + ",\n";
		result+="E-I-E-I-O!\n";
		result+="With a " + sound + " " + sound + " here,\n";
		result+="And a " + sound + " " + sound + " there,\n";
		result+="Here a " + sound + ", there a " + sound + "...\n";
		result+="Everywhere a " + sound + " " + sound + "!\n";
		result+="Old MacDonald had a farm,\n";
		result+="E-I-E-I-O!\n";
		return result;
	}
}