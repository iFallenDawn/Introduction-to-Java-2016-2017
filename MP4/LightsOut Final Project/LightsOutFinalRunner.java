//Jordan Wang
//Lights Out Final Project Game
//Spec: Plays a game of LightsOut with a preset board

import java.util.Scanner;

public class LightsOutFinalRunner
{
	public static void main(String[] args)
	{
		int validity = 0;
		Scanner sc = new Scanner(System.in);
		LightsOutFinal l = new LightsOutFinal();
		int[][]board = l.grid;
		String userListTiles = "";
		String again="y";
		String input = "";
		l.makeBoard();
		System.out.println("Welcome to Lights Out!");
		System.out.println("To win, turn all the tiles off.");
		System.out.println("In this case, 0 represents off.");
		System.out.println("Input takes row then column in a two digit number.\n(First digit is y value, second is x)\n");
		System.out.println("Good luck!\n\n");
		/*The while loop goes until the user finally solves the board.
		It then asks them if they want to play again, and generates a completely new board.*/
		while(again.equalsIgnoreCase("Y"))
		{
			System.out.println();
			System.out.print(l);
			System.out.println();
			userListTiles += input + " ";
			System.out.print("Tiles you've pressed: " + userListTiles + "\n");
			System.out.print("Enter a tile to press: ");
			input = sc.next();
			validity = Integer.parseInt(input);
			if(validity>44 || validity<0 || input.length()>2 || input == null || input.length() == 1)
			{
				System.out.print("Invalid input, please enter a valid tile");
			}
			else
			{
				l.makeDiamond(input);
				l.checkWin(board);
				System.out.println();
				System.out.println();
				System.out.print(l);
				System.out.println();
				System.out.println();
			}
			if(l.checkWin(board) == true)
			{
				System.out.print("Congratulations, you won!\n");
				System.out.print("Tiles pressed to make this board: " + l.tileCombo + "\n");
				System.out.print("Play again? y/n: ");
				again = sc.next();
				l.tileCombo = "";
				userListTiles = "";
				input = "";
				l.makeBoard();
			}
		}
	}
}
