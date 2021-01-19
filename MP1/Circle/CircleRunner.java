// Jordan Wang
// Circle Calculations Client
// Spec: Given the radius of a circle
// 		calculate and display area and circumference

public class CircleRunner
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Circle Calcs!\n");

		Circle one = new Circle(1);
		System.out.println(one);

		Circle two = new Circle(2.4);
		System.out.println(two);

		Circle three = new Circle(33);
		System.out.println(three);
	}
}
/*
Welcome to Circle Calcs!

Radius: 1.0
Area: 3.14
Circumference: 6.28

Radius: 2.4
Area: 18.10
Circumference: 15.08

Radius: 33.0
Area: 3421.19
Circumference: 207.35

Press any key to continue . . .
*/