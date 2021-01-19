// Jordan Wang
// Car Buying Program
// Spec: Determines whether or not you can buy a car with the amount of money that is inputted by the user.

public class CarBuying
{
	//Variables
	private double userBudget;
	//sets it to 0
	public CarBuying()
	{
		userBudget=0;
	}
	//Intitialization
	public CarBuying(double budget)
	{
		userBudget=budget;
	}
	public void setMoney(double budget)
	{
		userBudget=budget;
	}

	//Determines the car you can get
	public String getCar()
	{
		String car;
		if(userBudget>2000000)
		{
			car="You can buy a Bugatti! Wow! Donate some of that money to charity. Buy yourself a house. Buy your whole family houses.";
		}
		else if(userBudget>200000)
		{
			car="You can buy a Ferrari!";
		}
		else if(userBudget>100000)
		{
			car="Buy yourself a Hellcat!";
		}
		else if(userBudget>10000)
		{
			car="You can buy a wide variety of cars that the programmer is not going to list for you!";
		}
		else if(userBudget>200)
		{
			car="Buy a bike instead!";
		}
		else if(userBudget>100)
		{
			car="Buy yourself a scooter";
		}
		else
		{
			car="You cannot afford anything!";
		}
		return car;
	}
	//Converts to String
	public String toString()
	{
		String result="Your funds: $" + userBudget + "\n";
		result+=getCar();
		return result;
	}
}
