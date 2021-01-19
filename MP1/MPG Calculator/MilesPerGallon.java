// Jordan Wang
// Miles Per Gallon Calculator
// Spec: Calculates mpg and cost per mile.

public class MilesPerGallon
{
	private double gallons, miles, costPerGallon;
	//Default Constructors
	public MilesPerGallon()
	{
		gallons=0;
		miles=0;
		costPerGallon=0;
	}
	//Initilization
	public MilesPerGallon(double startOdometer, double endOdometer, double gallons, double costPerGallon)
	{
		this.gallons = gallons;
		this.miles = Math.abs(endOdometer - startOdometer);
		this.costPerGallon=costPerGallon;
	}
	//Gets Mpg
	public double getMPG()
	{
		double MPG= miles/gallons;
		return MPG;
	}
	//Gets cost per mile
	public double getCPM()
	{
		double CPM= (costPerGallon*gallons)/miles;
		return CPM;
	}
	//Converts everything to string
	public String toString()
	{
		String result ="Miles Traveled: " + String.format("%.2f", miles) + "\n";
		result+="Gallons Used: " + gallons + "\n";
		result+="Cost Per Gallon: $" + String.format("%.2f" , costPerGallon) + "\n";
		result+="Miles Per Gallon: " + String.format("%.2f" ,getMPG()) + "\n";
		result+="Cost Per Mile: $" + String.format("%.2f" , getCPM()) + "\n";
		return result;
	}
}



