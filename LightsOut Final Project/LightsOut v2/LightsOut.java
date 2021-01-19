//Jordan Wang
//LightsOut Game
//Spec: Plays a game of LightsOut

import java.util.Scanner;

public class LightsOut
{
	private int rowsForOnTiles;
	int [][]grid = new int[8][8];
	private String userInput;
	public LightsOut()
	{
		userInput = "";
	}

	public LightsOut(String input)
	{
		Scanner sc = new Scanner(input);
		rowsForOnTiles = sc.nextInt();
		userInput = input.substring(2, input.length());
	}

	//Makes a diamond wherever the pressed button is
	public void makeDiamond(String markedTile)
	{
		String mTile = markedTile;
		int row = Character.getNumericValue(mTile.charAt(0)) - 1;
		int column = Character.getNumericValue(mTile.charAt(1)) - 1;
		//Inverting the pressed tile
		if(grid[row][column] == 1)
			grid[row][column] = 0;
		else if(grid[row][column] == 0)
			grid[row][column] = 1;
		//bottom right
		if(row + 1 < 8 && column + 1 < 8)
		{
			if(grid[row + 1][column + 1] == 1)
				grid[row + 1][column + 1] = 0;
			else if(grid[row + 1][column + 1] == 0)
				grid[row + 1][column + 1] = 1;
		}

		//top left
		if(row - 1 > -1 && column - 1 > -1)
		{
			if(grid[row - 1][column - 1] == 1)
				grid[row - 1][column - 1] = 0;
			else if(grid[row - 1][column - 1] == 0)
				grid[row - 1][column - 1] = 1;
		}

		//Bottom left
		if(row + 1 < 8 && column - 1 > -1)
		{
			if(grid[row + 1][column - 1] == 1)
				grid[row + 1][column - 1] = 0;
			else if(grid[row + 1][column - 1] == 0)
				grid[row + 1][column - 1] = 1;
		}

		//top right
		if(row - 1 > -1 && column + 1 < 8)
		{
			if(grid[row - 1][column + 1] == 1)
				grid[row - 1][column + 1] = 0;
			else if(grid[row - 1][column + 1] == 0)
				grid[row - 1][column + 1] = 1;
		}
		//xxxxxxx
		//lower bound
		if(row + 1 < 8)
		{
			if(grid[row + 1][column] == 1)
				grid[row + 1][column] = 0;
			else if(grid[row + 1][column] == 0)
				grid[row + 1][column] = 1;
		}

		if(row + 2 < 8)
		{
			if(grid[row + 2][column] == 1)
				grid[row + 2][column] = 0;
			else if(grid[row + 2][column] == 0)
				grid[row + 2][column] = 1;;
		}
		//up bound
		if(row - 1 > -1)
		{
			if(grid[row - 1][column] == 1)
				grid[row - 1][column] = 0;
			else if(grid[row - 1][column] == 0)
				grid[row - 1][column] = 1;
		}

		if(row - 2 > -1)
		{
			if(grid[row - 2][column] == 1)
				grid[row - 2][column] = 0;
			else if(grid[row - 2][column] == 0)
				grid[row - 2][column] = 1;
		}
		//right bound
		if(column + 1 < 8)
		{
			if(grid[row][column + 1] == 1)
				grid[row][column + 1] = 0;
			else if(grid[row][column + 1] == 0)
				grid[row][column + 1] = 1;
		}

		if(column + 2 < 8)
		{
			if(grid[row][column + 2] == 1)
				grid[row][column + 2] = 0;
			else if(grid[row][column + 2] == 0)
				grid[row][column + 2] = 1;
		}
		//left bound
		if(column - 1 > -1)
		{
			if(grid[row][column - 1] == 1)
				grid[row][column - 1] = 0;
			else if(grid[row][column - 1] == 0)
				grid[row][column - 1] = 1;
		}

		if(column - 2 > -1)
		{
			if(grid[row][column - 2] == 1)
				grid[row][column - 2] = 0;
			else if(grid[row][column - 2] == 0)
				grid[row][column - 2] = 1;
		}
	}
	public String toString()
	{
		String result = "";
		String firstMTile = "";
		String secondMTile = "";
		String thirdMTile = "";
		String fourthMTile = "";
		String firstOnTiles;
		String secondOnTiles;
		String thirdOnTiles;
		String fourthOnTiles;
		String []updatedInput;
		updatedInput = userInput.split(" ");
		int onTiles = 0;
		int row;
		int numMarkedTiles = 0;
		int column;

		//If there's one row with on tiles
		if(rowsForOnTiles == 1)
		{
			firstOnTiles = (updatedInput[0]);
			numMarkedTiles = Integer.parseInt((updatedInput[1]));
			if(firstOnTiles.length() == 2)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(firstOnTiles.length() == 3)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(firstOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
		}

		//If there's two rows with on tiles
		if(rowsForOnTiles == 2)
		{
			firstOnTiles = (updatedInput[0]);
			secondOnTiles = (updatedInput[1]);
			numMarkedTiles = Integer.parseInt((updatedInput[2]));
			if(firstOnTiles.length() == 2)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(firstOnTiles.length() == 3)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(firstOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 2)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 3)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(secondOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
		}

		//If there's three rows with on tiles
		if(rowsForOnTiles == 3)
		{
			firstOnTiles = (updatedInput[0]);
			secondOnTiles = (updatedInput[1]);
			thirdOnTiles = (updatedInput[2]);
			numMarkedTiles = Integer.parseInt((updatedInput[3]));
			if(firstOnTiles.length() == 2)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(firstOnTiles.length() == 3)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(firstOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 2)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 3)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(secondOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(thirdOnTiles.length() == 2)
			{
				row = Character.getNumericValue(thirdOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(thirdOnTiles.length() == 3)
			{
				row = Character.getNumericValue(thirdOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
		}

		//If there's four rows with on tiles
		if(rowsForOnTiles == 4)
		{
			firstOnTiles = (updatedInput[0]);
			secondOnTiles = (updatedInput[1]);
			thirdOnTiles = (updatedInput[2]);
			fourthOnTiles = (updatedInput[3]);
			numMarkedTiles = Integer.parseInt((updatedInput[4]));
			if(firstOnTiles.length() == 2)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(firstOnTiles.length() == 3)
			{
				row = Character.getNumericValue(firstOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(firstOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(firstOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 2)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(secondOnTiles.length() == 3)
			{
				row = Character.getNumericValue(secondOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(secondOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(secondOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(thirdOnTiles.length() == 2)
			{
				row = Character.getNumericValue(thirdOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(thirdOnTiles.length() == 3)
			{
				row = Character.getNumericValue(thirdOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(thirdOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
			if(fourthOnTiles.length() == 2)
			{
				row = Character.getNumericValue(fourthOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(fourthOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
			}
			if(fourthOnTiles.length() == 3)
			{
				row = Character.getNumericValue(fourthOnTiles.charAt(0)) - 1;
				column = Character.getNumericValue(fourthOnTiles.charAt(1)) - 1;
				grid[row][column] = 1;
				column = Character.getNumericValue(fourthOnTiles.charAt(2)) - 1;
				grid[row][column] = 1;
			}
		}

		//Diamond based off the amount of marked tiles
		if(numMarkedTiles == 1)
		{
			firstMTile = updatedInput[updatedInput.length-1];
			makeDiamond(firstMTile);
		}

		if(numMarkedTiles == 2)
		{
			firstMTile = updatedInput[updatedInput.length-2];
			makeDiamond(firstMTile);
			secondMTile = updatedInput[updatedInput.length-1];
			makeDiamond(secondMTile);
		}

		if(numMarkedTiles == 3)
		{
			firstMTile = updatedInput[updatedInput.length-3];
			makeDiamond(firstMTile);
			secondMTile = updatedInput[updatedInput.length-2];
			makeDiamond(secondMTile);
			thirdMTile = updatedInput[updatedInput.length-1];
			makeDiamond(thirdMTile);
		}

		if(numMarkedTiles == 4)
		{
			firstMTile = updatedInput[updatedInput.length-4];
			makeDiamond(firstMTile);
			secondMTile = updatedInput[updatedInput.length-3];
			makeDiamond(secondMTile);
			thirdMTile = updatedInput[updatedInput.length-2];
			makeDiamond(thirdMTile);
			fourthMTile = updatedInput[updatedInput.length-1];
			makeDiamond(fourthMTile);
		}

		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				if(grid[r][c] == 1)
				{
					onTiles++;
				}
			}
		}
		result+= onTiles + "\n";
		return result;
	}
}