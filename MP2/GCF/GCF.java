// Jordan Wang
// GCF Object
// Spec: Write a program to identify the Greatest Common Factor between at least 2 integer numbers

public class GCF
{
	private int x1, x2;

	public GCF()
	{
		x1=0;
		x2=0;
	}

	public GCF(int num1, int num2)
	{
		x1=num1;
		x2=num2;
	}

	public void setFactors(int num1, int num2)
	{
		x1=num1;
		x2=num2;
	}

	public int getGCF()
	{
		int gcf = 1;
		// Build a for loop to determine the GCF
		for(int i=1; i<=x1 && i<=x2; i++)
		{
			if(x1%i==0 && x2%i==0)
			{
				gcf=i;
			}
		}
		return gcf;
	}

	public String toString()
	{
		String result = "";
		result+="First number: " + x1 + "\n";
		result+="Second number: " + x2 + "\n";
		result+="The GCF of " + x1 + " and " + x2 + " is " + getGCF() + "\n";
		return result;
	}
}