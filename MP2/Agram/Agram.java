//Jordan Wang
//Agram Game
//Spec: Plays a game of Agram

import java.util.Scanner;

public class Agram
{
	Scanner sc=new Scanner(System.in);
	String opponent, C1, C2, C3, C4, C5;
	String ranks="A23456789TJQK";
	String suits="DHSC";

	public Agram()
	{
		opponent="";
		C1="";
		C2="";
		C3="";
		C4="";
		C5="";
	}

	public Agram(String input)
	{
		Scanner sc = new Scanner(input);
		opponent=sc.next();
		C1=sc.next();
		C2=sc.next();
		C3=sc.next();
		C4=sc.next();
		C5=sc.next();
	}

	public String toString()
	{
		String result="";
		char rankP, suitP, rank1, suit1, rank2, suit2, rank3, suit3, rank4, suit4, rank5, suit5;
		//Collecting all the stuff
		rankP=opponent.charAt(0);
		rank1=C1.charAt(0);
		rank2=C2.charAt(0);
		rank3=C3.charAt(0);
		rank4=C4.charAt(0);
		rank5=C5.charAt(0);
		suitP=opponent.charAt(1);
		suit1=C1.charAt(1);
		suit2=C2.charAt(1);
		suit3=C3.charAt(1);
		suit4=C4.charAt(1);
		suit5=C5.charAt(1);

		//Card 1
		if(suits.indexOf(suitP) == suits.indexOf(suit1))
		{
			if(ranks.indexOf(rank1) > ranks.indexOf(rankP) && ranks.indexOf(rank1) < ranks.indexOf(rank2)
			&& ranks.indexOf(rank1) < ranks.indexOf(rank3) && ranks.indexOf(rank1) < ranks.indexOf(rank4)
			&& ranks.indexOf(rank1) < ranks.indexOf(rank5))
			{
				result=C1 + "\n";
			}
			else
			{
				if(suits.indexOf(suitP) == suits.indexOf(suit2) && ranks.indexOf(rank2) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank3) && ranks.indexOf(rank2) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C2 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit3) && ranks.indexOf(rank3) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank2) && ranks.indexOf(rank3) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank5))
				{
					result=C3 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit4) && ranks.indexOf(rank4) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank2) && ranks.indexOf(rank4) < ranks.indexOf(rank3)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank5))
				{
					result=C4 + "\n";
				}
				else
				{
					result=C5 + "\n";
				}
			}
		}
		//Card 2
		else if(suits.indexOf(suitP) == suits.indexOf(suit2))
		{
			if(ranks.indexOf(rank2) > ranks.indexOf(rankP) && ranks.indexOf(rank2) < ranks.indexOf(rank1)
			&& ranks.indexOf(rank2) < ranks.indexOf(rank3) && ranks.indexOf(rank2) < ranks.indexOf(rank4)
			&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
			{
				result=C2 + "\n";
			}
			else
			{
				if(suits.indexOf(suitP) == suits.indexOf(suit1) && ranks.indexOf(rank1) < ranks.indexOf(rank2)
				&& ranks.indexOf(rank1) < ranks.indexOf(rank3) && ranks.indexOf(rank1) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C1 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit3) && ranks.indexOf(rank3) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank2) && ranks.indexOf(rank3) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank5))
				{
					result=C3 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit4) && ranks.indexOf(rank4) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank2) && ranks.indexOf(rank4) < ranks.indexOf(rank3)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank5))
				{
					result=C4 + "\n";
				}
				else
				{
					result=C5 + "\n";
				}
			}
		}
		//Card 3
		else if(suits.indexOf(suitP) == suits.indexOf(suit3))
		{
			if(ranks.indexOf(rank3) > ranks.indexOf(rankP) && ranks.indexOf(rank3) < ranks.indexOf(rank1)
			&& ranks.indexOf(rank3) < ranks.indexOf(rank2) && ranks.indexOf(rank3) < ranks.indexOf(rank4)
			&& ranks.indexOf(rank3) < ranks.indexOf(rank5))
			{
				result=C3 + "\n";
			}
			else
			{
				if(suits.indexOf(suitP) == suits.indexOf(suit1) && ranks.indexOf(rank1) < ranks.indexOf(rank2)
				&& ranks.indexOf(rank1) < ranks.indexOf(rank3) && ranks.indexOf(rank1) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C1 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit2) && ranks.indexOf(rank2) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank3) && ranks.indexOf(rank2) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C2 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit4) && ranks.indexOf(rank4) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank2) && ranks.indexOf(rank4) < ranks.indexOf(rank3)
				&& ranks.indexOf(rank4) < ranks.indexOf(rank5))
				{
					result=C4 + "\n";
				}
				else
				{
					result=C5 + "\n";
				}
			}
		}
		//Card 4
		else if(suits.indexOf(suitP) == suits.indexOf(suit4))
		{
			if(ranks.indexOf(rank4) > ranks.indexOf(rankP) && ranks.indexOf(rank4) < ranks.indexOf(rank1)
			&& ranks.indexOf(rank4) < ranks.indexOf(rank2) && ranks.indexOf(rank4) < ranks.indexOf(rank3)
			&& ranks.indexOf(rank4) < ranks.indexOf(rank5))
			{
				result=C4 + "\n";
			}
			else
			{
				if(suits.indexOf(suitP) == suits.indexOf(suit1) && ranks.indexOf(rank1) < ranks.indexOf(rank2)
				&& ranks.indexOf(rank1) < ranks.indexOf(rank3) && ranks.indexOf(rank1) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C1 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit2) && ranks.indexOf(rank2) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank3) && ranks.indexOf(rank2) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C2 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit3) && ranks.indexOf(rank3) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank2) && ranks.indexOf(rank3) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank5))
				{
					result=C3 + "\n";
				}
				else
				{
					result=C5 + "\n";
				}
			}
		}
		//Card 5
		else if(suits.indexOf(suitP) == suits.indexOf(suit5))
		{
			if(ranks.indexOf(rank5) > ranks.indexOf(rankP) && ranks.indexOf(rank5) < ranks.indexOf(rank1)
			&& ranks.indexOf(rank5) < ranks.indexOf(rank2) && ranks.indexOf(rank5) < ranks.indexOf(rank3)
			&& ranks.indexOf(rank5) < ranks.indexOf(rank4))
			{
				result=C5 + "\n";
			}
			else
			{
				if(suits.indexOf(suitP) == suits.indexOf(suit1) && ranks.indexOf(rank1) < ranks.indexOf(rank2)
				&& ranks.indexOf(rank1) < ranks.indexOf(rank3) && ranks.indexOf(rank1) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C1 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit2) && ranks.indexOf(rank2) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank3) && ranks.indexOf(rank2) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank2) < ranks.indexOf(rank5))
				{
					result=C2 + "\n";
				}
				else if(suits.indexOf(suitP) == suits.indexOf(suit3) && ranks.indexOf(rank3) < ranks.indexOf(rank1)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank2) && ranks.indexOf(rank3) < ranks.indexOf(rank4)
				&& ranks.indexOf(rank3) < ranks.indexOf(rank5))
				{
					result=C3 + "\n";
				}
				else
				{
					result=C4 + "\n";
				}
			}
		}
		//Code to guarantee no ties.
		else
		{
			if(ranks.indexOf(rank1) <= ranks.indexOf(rank2) && ranks.indexOf(rank1) <= ranks.indexOf(rank3)
			&& ranks.indexOf(rank1) <= ranks.indexOf(rank4) && ranks.indexOf(rank1) <= ranks.indexOf(rank5))
			{
				result=C1 + "\n";
			}
			else if(ranks.indexOf(rank2) <= ranks.indexOf(rank1) && ranks.indexOf(rank2) <= ranks.indexOf(rank3)
			&& ranks.indexOf(rank2) <= ranks.indexOf(rank4) && ranks.indexOf(rank2) <= ranks.indexOf(rank5))
			{
				result=C2 + "\n";
			}
			else if(ranks.indexOf(rank3) <= ranks.indexOf(rank1) && ranks.indexOf(rank3) <= ranks.indexOf(rank2)
			&& ranks.indexOf(rank3) <= ranks.indexOf(rank4) && ranks.indexOf(rank3) <= ranks.indexOf(rank5))
			{
				result=C3 + "\n";
			}
			else if(ranks.indexOf(rank4) <= ranks.indexOf(rank1) && ranks.indexOf(rank4) <= ranks.indexOf(rank2)
			&& ranks.indexOf(rank4) <= ranks.indexOf(rank3) && ranks.indexOf(rank4) <= ranks.indexOf(rank5))
			{
				result=C4 + "\n";
			}
			else
			{
				result=C5 + "\n";
			}
		}
		return result;
	}
}