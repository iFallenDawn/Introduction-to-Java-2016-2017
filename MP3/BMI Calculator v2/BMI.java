public class BMI
{
	private int feet, inchesPart, weight;

	/** Default Constructor - sets all the instance variables to zero */
	public BMI()
	{
		feet = 0;
		inchesPart = 0;
		weight = 0;
	}

	/** Constructor with parameters - sets Instance Variables to the parameters passed in */
	public BMI(int userFeet, int userInchesPart, int userWeight)
	{
		feet = userFeet;
		inchesPart = userInchesPart;
		weight = userWeight;
	}

	public void setFeet(int userFeet)
	{
		feet = userFeet;
	}

	public void setInchesPart(int userInchesPart)
	{
		inchesPart = userInchesPart;
	}

	public void setWeight(int userWeight)
	{
		weight = userWeight;
	}

	/** @return the BMI for this object
	*	Note: You will need to first calculate the total inches from feet and inchesPart
	*/
	public double getBMI()
	{
		int totalInches;
		double BMI;
		totalInches = feet * 12 + inchesPart;
		BMI = weight * 703 / Math.pow(totalInches, 2);
		return BMI;
	}

	/** @returns the BMI for this object along with a classification
	*	Ex: "Your BMI is 20.4 - Normal"
	*/
	public String toString()
	{
		String result = "Your BMI is " + String.format("%.2f", getBMI()) + " - ";
		double bmi = getBMI();
		if(bmi<18.5)
			result+="Underweight";
		else if(bmi>=18.5 && bmi<24.9)
			result+="Healthy Weight";
		else if(bmi>=24.9 && bmi<=29.9)
			result+="Overweight";
		else if(bmi>29.9)
			result+="Obese";
		return result;
	}

}

