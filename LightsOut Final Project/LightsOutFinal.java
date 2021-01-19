//Jordan Wang
//Lights Out Final Project Game
//Spec: Plays a game of LightsOut with a preset board

import java.util.Scanner;

public class LightsOutFinal
{
	String tileCombo = "";
	String tilePressed;
	int [][]grid = new int[5][5];
	private String userInput;
	public LightsOutFinal()
	{
		tilePressed = "";
		userInput = "";
	}
	public LightsOutFinal(String input)
	{
		userInput = input;
		makeDiamond(userInput);
	}
	//Checks for win
	public static boolean checkWin(int[][] board)
	{
		int count = 0;
		for(int r = 0; r < board.length; r++)
		{
			for(int c = 0; c < board[r].length; c++)
			{
				if(board[r][c] == 0)
				{
					count++;
				}
			}
		}
		if(count == 25)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Makes the board by pressing random tiles, automatically making it so every board is valid.
	public void makeBoard()
	{
		int presetTilesPressed = (int)(Math.random()*5)+6;
		for(int i = 0; i < presetTilesPressed; i++)
		{
			int row = (int)(Math.random()*5);
			int column = (int)(Math.random()*5);
			tilePressed = "" + row + "" + column;
			makeDiamond(tilePressed);
			tileCombo += tilePressed + " ";
		}
	}
	//Makes diamond wherever the user puts a marked tile
	public void makeDiamond(String markedTile)
	{
		String mTile = markedTile;
		int row = Character.getNumericValue(mTile.charAt(0));
		int column = Character.getNumericValue(mTile.charAt(1));
		//Inverting the pressed tile
		if(grid[row][column] == 1)
			grid[row][column] = 0;
		else if(grid[row][column] == 0)
			grid[row][column] = 1;
		//Lower bound
		if(row < 4)
		{
			if(grid[row + 1][column] == 1)
				grid[row + 1][column] = 0;
			else if(grid[row + 1][column] == 0)
				grid[row + 1][column] = 1;
		}
		//Upper bound
		if(row > 0)
		{
			if(grid[row - 1][column] == 1)
				grid[row - 1][column] = 0;
			else if(grid[row - 1][column] == 0)
				grid[row - 1][column] = 1;
		}
		//right bound
		if(column < 4)
		{
			if(grid[row][column + 1] == 1)
				grid[row][column + 1] = 0;
			else if(grid[row][column + 1] == 0)
				grid[row][column + 1] = 1;
		}
		//left bound
		if(column > 0)
		{
			if(grid[row][column - 1] == 1)
				grid[row][column - 1] = 0;
			else if(grid[row][column - 1] == 0)
				grid[row][column - 1] = 1;
		}
	}
	public String toString()
	{
		String result = "";
		result+= "\t0\t1\t2\t3\t4\t\n\n";
		for(int r = 0; r < grid.length; r++)
		{
			result+=r + "\t";
			for(int c = 0; c < grid.length; c++)
			{
				result+=grid[r][c] + "\t";
			}
			result+="\n";
		}
		/*A little cheat code so I can easily win the game.
		/result+= tileCombo + "\n";*/
		return result;
	}
}
