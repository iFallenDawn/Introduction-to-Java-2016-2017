//Jordan Wang
//Java Soundboard
//Spec: Plays mario sounds based off which button the user clicks

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;//for audioclip

public class Soundboard extends JApplet
{
	// Declare all objects
	// ie. your JButtons, ImageIcons, AudioClips, JLabel and ButtonListener
	// Note: you will only need 1 JLabel and 1 ButtonListener
	// Also, remember the Access Specifier should be private for Instance Variables
	private JLabel lblOutput;
	private AudioClip audDead, audJump, audYahoo, audCoin, audMushroom;
	private JButton btnDead, btnJump, btnYahoo, btnCoin, btnMushroom;
	private ButtonListener listener;
	private ImageIcon icoDead, icoJump, icoYahoo, icoCoin, icoMushroom;
	public void init()
	{
		// Create Window/Frame
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblOutput = new JLabel();
		audDead = getAudioClip(getDocumentBase(), "dead.wav");
		audJump = getAudioClip(getDocumentBase(), "jump.wav");
		audYahoo = getAudioClip(getDocumentBase(), "yahoo.wav");
		audCoin = getAudioClip(getDocumentBase(), "coin.wav");
		audMushroom = getAudioClip(getDocumentBase(), "mushroom.wav");
		btnDead = new JButton("Dead");
		btnJump = new JButton("Jump");
		btnYahoo = new JButton("Yahoo");
		btnCoin = new JButton("Coin");
		btnMushroom = new JButton("Mushroom");
		icoDead = new ImageIcon("mdead.jpg");
		icoJump = new ImageIcon("mjump.png");
		icoYahoo = new ImageIcon("myahoo.jpg");
		icoCoin = new ImageIcon("mcoin.png");
		icoMushroom = new ImageIcon("mmushroom.jpg");
		listener = new ButtonListener();

		listener = new ButtonListener();

		btnDead.addActionListener(listener);
		btnJump.addActionListener(listener);
		btnYahoo.addActionListener(listener);
		btnCoin.addActionListener(listener);
		btnMushroom.addActionListener(listener);

		cp.add(btnDead);
		cp.add(btnJump);
		cp.add(btnYahoo);
		cp.add(btnCoin);
		cp.add(btnMushroom);
		cp.add(lblOutput);

		setSize(300, 350);
		setVisible(true);
	}


	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();

			if(source==btnDead)
			{
				lblOutput.setIcon(icoDead);
				audDead.play();
			}
			else if(source==btnJump)
			{
				lblOutput.setIcon(icoJump);
				audJump.play();
			}
			else if(source==btnYahoo)
			{
				lblOutput.setIcon(icoYahoo);
				audYahoo.play();
			}
			else if(source==btnCoin)
			{
				lblOutput.setIcon(icoCoin);
				audCoin.play();
			}
			else
			{
				lblOutput.setIcon(icoMushroom);
				audMushroom.play();
			}
		}
	}
}