//Jordan Wang
//Food Order Program
//Spec: Orders food based off what button the user clicks

public class FoodOrder
{
	int rice = 0;
	int sushi = 0;
	int eggroll = 0;
	int chicken = 0;
	int vegetable = 0;
	double total = 0;
	public void resetVals()
	{
		rice = 0;
		sushi = 0;
		eggroll = 0;
		chicken = 0;
		vegetable = 0;
		total = 0;
	}

	public double getTotal()
	{
		total= rice * 5.00 + sushi * 3.00 + eggroll * 2.00 + chicken * 4.00 + vegetable * 3.00;
		return total;
	}
	public String toString()
	{
		String result = "";
		result += "Total Bill: $" + getTotal() + "\t     ";
		result += "Rice: " + rice + " Sushi: " + sushi + " Eggrolls: " + eggroll + " Chicken: " + chicken;
		result += " Vegetables: " + vegetable;
		return result;
	}
}