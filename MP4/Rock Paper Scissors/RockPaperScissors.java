//Jordan Wang
//RockPaperScissors
//Spec: Checks whether or not user input is a palindrome

import java.util.Arrays;

public class RockPaperScissors
{
	String[]outcomes = {"Rock", "Paper", "Scissors"};
	String result;
	String computerSign;
	int computer;
	public RockPaperScissors()
	{
		computer = 0;
		result = "";
		computerSign = "";
	}
	public RockPaperScissors(String userIn)
	{
		computerSign = computerS(userIn);
		result = gameLogic(userIn, computerSign);
	}
	public String computerS(String cinput)
	{
		computer = (int)(Math.random()*3);
		cinput = outcomes[computer];
		return cinput;
	}
	public String gameLogic(String input, String computer)
	{
		String result = "";
		if(input == "Rock")
		{
			if(computer == "Rock")
			{
				result = "Draw";
			}
			else if(computer == "Paper")
			{
				result = "Loss";
			}
			else if(computer == "Scissors")
			{
				result = "Win";
			}
		}
		if(input == "Paper")
		{
			if(computer == "Rock")
			{
				result = "Win";
			}
			else if(computer == "Paper")
			{
				result = "Draw";
			}
			else if(computer == "Scissors")
			{
				result = "Loss";
			}
		}
		if(input == "Scissors")
		{
			if(computer == "Rock")
			{
				result = "Loss";
			}
			else if(computer == "Paper")
			{
				result = "Win";
			}
			else if(computer == "Scissors")
			{
				result = "Draw";
			}
		}
		return result;
	}
}
