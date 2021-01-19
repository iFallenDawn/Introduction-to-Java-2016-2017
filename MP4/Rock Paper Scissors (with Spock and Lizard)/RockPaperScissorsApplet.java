//Jordan Wang
//RockPaperScissorsApplet
//Spec: Checks whether or not user input is a palindrome

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import java.applet.*;

public class RockPaperScissorsApplet extends JApplet
{
	int draws = 0;
	int losses = 0;
	int wins = 0;
	private JLabel lblTitle, lblFiller, lblPlayer, lblWins, lblDraws, lblLosses, lblComputer, lblCompPic, lblPlayerPic;
	private JRadioButton rdoRock, rdoPaper, rdoScissors, rdoSpock, rdoLizard;
	private ButtonGroup bgPlayerInputs;
	private ImageIcon icoRock, icoScissors, icoPaper, icoSpock, icoLizard;
	private JButton btnSubmit;
	private ButtonListener listener;

	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("\tRock Paper Scissors!");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblCompPic = new JLabel();
		lblPlayerPic = new JLabel();
		icoRock = new ImageIcon("rock.jpg");
		icoScissors = new ImageIcon("scissors.png");
		icoPaper = new ImageIcon("paper.jpg");
		icoSpock = new ImageIcon("spock.jpg");
		icoLizard = new ImageIcon("lizard.jpg");
		lblPlayerPic.setIcon(icoRock);
		lblCompPic.setIcon(icoRock);
		lblWins = new JLabel("Wins: 0");
		lblDraws = new JLabel("Draws: 0");
		lblLosses = new JLabel("Losses: 0");
		lblComputer = new JLabel("Computer Choice");
		lblComputer.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblFiller = new JLabel("                 ");
		lblFiller.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblPlayer = new JLabel("Player Choice");
		lblPlayer.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		rdoRock = new JRadioButton("Rock");
		rdoPaper = new JRadioButton("Paper");
		rdoScissors = new JRadioButton("Scissors");
		rdoLizard = new JRadioButton("Lizard");
		rdoSpock = new JRadioButton("Spock");
		bgPlayerInputs = new ButtonGroup();
		bgPlayerInputs.add(rdoRock);
		bgPlayerInputs.add(rdoPaper);
		bgPlayerInputs.add(rdoScissors);
		bgPlayerInputs.add(rdoSpock);
		bgPlayerInputs.add(rdoLizard);
		btnSubmit = new JButton("Submit");
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblPlayer);
		cp.add(lblFiller);
		cp.add(lblComputer);
		cp.add(lblPlayerPic);
		cp.add(lblCompPic);
		cp.add(lblWins);
		cp.add(lblLosses);
		cp.add(lblDraws);
		cp.add(rdoRock);
		cp.add(rdoPaper);
		cp.add(rdoScissors);
		cp.add(rdoLizard);
		cp.add(rdoSpock);
		cp.add(btnSubmit);

		setSize(500,500);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = new Object();
			source = event.getSource();
			String user = "";
			RockPaperScissors rps = new RockPaperScissors();
			if(rdoRock.isSelected())
			{
				user = "Rock";
				lblPlayerPic.setIcon(icoRock);
			}
			if(rdoPaper.isSelected())
			{
				user = "Paper";
				lblPlayerPic.setIcon(icoPaper);
			}
			if(rdoScissors.isSelected())
			{
				user = "Scissors";
				lblPlayerPic.setIcon(icoScissors);
			}
			if(rdoSpock.isSelected())
			{
				user = "Spock";
				lblPlayerPic.setIcon(icoSpock);
			}
			if(rdoLizard.isSelected())
			{
				user = "Lizard";
				lblPlayerPic.setIcon(icoLizard);
			}
			String computerS = rps.computerS(user);
			String resultT = rps.gameLogic(user, computerS);
			if(source == btnSubmit)
			{
				if(computerS == "Rock")
				{
					lblCompPic.setIcon(icoRock);
				}
				else if (computerS == "Paper")
				{
					lblCompPic.setIcon(icoPaper);
				}
				else if (computerS == "Scissors")
				{
					lblCompPic.setIcon(icoScissors);
				}
				else if (computerS == "Spock")
				{
					lblCompPic.setIcon(icoSpock);
				}
				else
				{
					lblCompPic.setIcon(icoLizard);
				}
				if(resultT == "Draw")
				{
					draws+=1;
				}
				else if(resultT == "Win")
				{
					wins+=1;
				}
				else if(resultT == "Loss")
				{
					losses+=1;
				}
			}
			lblWins.setText("Wins: " + wins);
			lblDraws.setText("Draws: " + draws);
			lblLosses.setText("Losses: " + losses);
		}
	}
}