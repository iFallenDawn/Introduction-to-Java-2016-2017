// Jordan Wang
// Grade Converter
// Spec: Converts grade into GPA

public class GradeConverter
{
	//Variables
	private int numberGrade;
	private boolean isWeighted;

	//Sets it to 0
	public GradeConverter()
	{
		numberGrade=0;
	}
	//Intitialization
	public GradeConverter(int number, boolean weight)
	{
		numberGrade=number;
		isWeighted=weight;
	}

	//Provides another way
	public void setGrade(int number, boolean weight)
	{
		numberGrade=number;
		isWeighted=weight;
	}

	//Converts number into a letter grade
	public String getLetter()
	{
		String letter;
		if(numberGrade>=93)
		{
			letter="A";
		}
		else if(numberGrade>=90)
		{
			letter="A-";
		}
		else if(numberGrade>=87)
		{
			letter="B+";
		}
		else if(numberGrade>=83)
		{
			letter="B";
		}
		else if(numberGrade>=80)
		{
			letter="B-";
		}
		else if(numberGrade>=77)
		{
			letter="C+";
		}
		else if(numberGrade>=73)
		{
			letter="C";
		}
		else if(numberGrade>=70)
		{
			letter="C-";
		}
		else if(numberGrade>=67)
		{
			letter="D+";
		}
		else if(numberGrade>=63)
		{
			letter="D";
		}
		else if(numberGrade>=60)
		{
			letter="D-";
		}
		else
		{
			letter="F, You're a failure.";
		}
		return letter;
	}

	//Unweighted gpa
	public double getUnweighted()
	{
		double unweighted;
		if(numberGrade>=93)
		{
			unweighted=4.00;
		}
		else if(numberGrade>=90)
		{
			unweighted=3.67;
		}
		else if(numberGrade>=87)
		{
			unweighted=3.33;
		}
		else if(numberGrade>=83)
		{
			unweighted=3.00;
		}
		else if(numberGrade>=80)
		{
			unweighted=2.67;
		}
		else if(numberGrade>=77)
		{
			unweighted=2.33;
		}
		else if(numberGrade>=73)
		{
			unweighted=2.00;
		}
		else if(numberGrade>=70)
		{
			unweighted=1.67;
		}
		else if(numberGrade>=67)
		{
			unweighted=1.33;
		}
		else if(numberGrade>=63)
		{
			unweighted=1.00;
		}
		else if(numberGrade>=60)
		{
			unweighted=.67;
		}
		else
		{
			unweighted=0;
		}
		return unweighted;
	}

	//Gets weighted gpa
	public double getWeighted()
	{
		double weighted;
		if(numberGrade>=93)
		{
			weighted=5.00;
		}
		else if(numberGrade>=90)
		{
			weighted=4.67;
		}
		else if(numberGrade>=87)
		{
			weighted=4.33;
		}
		else if(numberGrade>=83)
		{
			weighted=4.00;
		}
		else if(numberGrade>=80)
		{
			weighted=3.67;
		}
		else if(numberGrade>=77)
		{
			weighted=3.33;
		}
		else if(numberGrade>=73)
		{
			weighted=3.00;
		}
		else if(numberGrade>=70)
		{
			weighted=2.67;
		}
		else if(numberGrade>=67)
		{
			weighted=1.33;
		}
		else if(numberGrade>=63)
		{
			weighted=1.00;
		}
		else if(numberGrade>=60)
		{
			weighted=.67;
		}
		else
		{
			weighted=0;
		}
		return weighted;
	}

	//Converts everything to string
	public String toString()
	{
		String result="Numerical Grade: " + numberGrade + "\n";
		result+="Letter Grade: " + getLetter();

		if(isWeighted==true)
		{
			result += "\nWeighted: Yes\n";
			result += "GPA Points: " + getWeighted();
		}
		else
		{
			result += "\nWeighted: No\n";
			result += "GPA Points: " + getUnweighted();
		}
		return result;
	}
}
