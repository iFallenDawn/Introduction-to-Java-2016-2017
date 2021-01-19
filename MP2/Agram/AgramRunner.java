//Jordan Wang
//Agram Game
//Spec: Plays a game of Agram

import java.util.Scanner;

public class AgramRunner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Agram a;
		String input;

		for(int i = 0; i<5; i++)
		{
			input=sc.nextLine();
			a=new Agram(input);
			System.out.print(a);
		}
	}
}