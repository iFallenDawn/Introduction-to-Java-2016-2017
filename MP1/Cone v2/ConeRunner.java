//Jordan Wang
//Cone Calculator
//Spec: Calculates volume, lateral surface area, and total surface area of a cone

public class ConeRunner
{
	public static void main(String[] args)
	{
		Cone c = new Cone(2,3);

		System.out.println("Right Circular Cone Program\n\n");
		System.out.println(c);
		c = new Cone(2.5,5.5);
		System.out.println(c);
		c = new Cone(4.25,7.75);
		System.out.println(c);
	}
}
/*
Right Circular Cone Program

Enter a radius: 2
Enter a height: 3

Radius: 2.0
Height: 3.0
Slant Height: 3.61
Volume: 12.57
Lateral Surface Area: 22.65
Surface Area: 35.22


Do you want to do it again? y
Enter a radius: 2.5
Enter a height: 5.5

Radius: 2.5
Height: 5.5
Slant Height: 6.04
Volume: 36.00
Lateral Surface Area: 47.45
Surface Area: 67.08


Do you want to do it again? y
Enter a radius: 4.25
Enter a height: 7.75

Radius: 4.25
Height: 7.75
Slant Height: 8.84
Volume: 146.59
Lateral Surface Area: 118.01
Surface Area: 174.76


Do you want to do it again? n
Press any key to continue . . .
*/




