//Jordan Wang
//RockPaperScissors
//Spec: Checks whether or not user input is a palindrome

import java.util.Arrays;

public class RockPaperScissors
{
	String[]outcomes = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
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
		computer = (int)(Math.random()*5);
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
			else if(computer == "Lizard")
			{
				result = "Win";
			}
			else if(computer == "Spock")
			{
				result = "Loss";
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
			else if(computer == "Spock")
			{
				result = "Win";
			}
			else if(computer == "Lizard")
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
			else if(computer == "Spock")
			{
				result = "Loss";
			}
			else if(computer == "Lizard")
			{
				result = "Win";
			}
		}
		if(input == "Spock")
		{
			if(computer == "Rock")
			{
				result = "Win";
			}
			else if(computer == "Paper")
			{
				result = "Loss";
			}
			else if(computer == "Scissors")
			{
				result = "Win";
			}
			else if(computer == "Lizard")
			{
				result = "Loss";
			}
			else if(computer == "Spock")
			{
				result = "Draw";
			}
		}
		if(input == "Lizard")
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
				result = "Loss";
			}
			else if(computer == "Lizard")
			{
				result = "Draw";
			}
			else if(computer == "Spock")
			{
				result = "Win";
			}
		}
		return result;
	}
}
