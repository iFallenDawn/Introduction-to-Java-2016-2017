//Jordan Wang
//LightsOut Game
//Spec: Plays a game of LightsOut

import java.util.Scanner;

public class LightsOutRunner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LightsOut L;
		String input;

		for(int i = 0; i < 5; i++)
		{
			input=sc.nextLine();
			L=new LightsOut(input);
			System.out.print(L);
		}
	}
}
// 2 434 523 1 43					9
// 1 58 1 58						8
// 1 58 1 57						11
// 3 32 44 56 2 54 18				18
// 4 345 456 567 678 2 36 55		22

