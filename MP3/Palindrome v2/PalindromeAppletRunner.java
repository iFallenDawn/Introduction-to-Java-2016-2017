//Jordan Wang
//Palindrome Detector
//Spec: Checks whether or not user input is a palindrome

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import java.applet.*;

public class PalindromeAppletRunner extends JApplet
{
	private JLabel lblTitle, lblEnter, lblOutput, lblPic;
	private AudioClip audCoin;
	private ImageIcon icoPic, icoNo;
	private JTextField txtInput;
	private JButton btnSubmit;
	private ButtonListener listener;

	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		// Instantiate GUI object
		lblTitle = new JLabel("Palindrome Detector");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		audCoin = getAudioClip(getDocumentBase(), "coin.wav");
		lblEnter = new JLabel("Enter a word: ");
		lblOutput = new JLabel("Palindrome?");
		lblPic = new JLabel();
		icoPic = new ImageIcon("palindrome.jpg");
		icoNo = new ImageIcon("no.jpg");
		txtInput = new JTextField(10);
		btnSubmit = new JButton("Submit");
		listener = new ButtonListener();

		// Add listener(s)
		btnSubmit.addActionListener(listener);
		// Add GUI objects to the window in the order you want them to appear
		cp.add(lblTitle);
		cp.add(lblEnter);
		cp.add(txtInput);
		cp.add(btnSubmit);
		cp.add(lblOutput);
		cp.add(lblPic);

		// Tell Java how to display the window
		setSize(275,500);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String input = txtInput.getText();
			Palindrome p = new Palindrome(input);
			lblOutput.setText(p.toString());
			boolean palindrome = p.isPalindrome();
			if(palindrome == true)
			{
				lblPic.setIcon(icoPic);
				audCoin.play();
			}
			else
			{
				lblPic.setIcon(icoNo);
			}
		}
	}
}