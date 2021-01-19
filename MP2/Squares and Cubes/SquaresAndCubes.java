//Jordan Wang
//Squares and Cubes Program
//Spec: Calculates the squared and cubed numbers of user input.

public class SquaresAndCubes
{
	int userNum;
	public SquaresAndCubes()
	{
		userNum=0;
	}

	public SquaresAndCubes(int num)
	{
		userNum=num;
	}

	public void setMax(int num)
	{
		userNum=num;
	}

	public String toString()
	{
		String result = "";
		result+="X\t\t" + "X^2\t\t" + "X^3\n";
		for(int i=1;i<=userNum;i++)
		{
			result+=i + "\t\t" + i*i + "\t\t" + i*i*i + "\n";
		}
		return result;
	}
}
