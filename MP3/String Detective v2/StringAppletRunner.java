// Jordan Wang
// StringUtility
// Spec: A String utility to help analyze and manipulate Strings

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class StringAppletRunner extends JApplet
{
	private JLabel lblTitle, lblEnter;
	private JTextField txtInput;
	private JButton btnSubmit;
	private JTextArea jtaOutput;
	private ButtonListener listener;

	public void init()
	{
		// Create the window to put things in
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		// Instantiate GUI objects
		lblTitle = new JLabel("String Detective");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblEnter = new JLabel("Enter a string: ");
		txtInput = new JTextField(10);
		btnSubmit = new JButton("Submit");
		jtaOutput = new JTextArea(20, 20);
		jtaOutput.setEditable(false);
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		// Add GUI objects to the window
		cp.add(lblTitle);
		cp.add(lblEnter);
		cp.add(txtInput);
		cp.add(btnSubmit);
		cp.add(jtaOutput);

		// Tell Java how to display the window
		setSize(250, 250);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String word = txtInput.getText();

			jtaOutput.setText("Word Analysis\n");
			jtaOutput.append("Reverse: " + StringUtility.reverseWord(word) + "\n");
			jtaOutput.append("Number of Letters: " + word.length() + "\n");
			jtaOutput.append("Number of Vowels: " + StringUtility.getNumVowels(word) + "\n");
			jtaOutput.append("Sum of Ascii Values: " + StringUtility.sumAscii(word));
			// Next, use jtaOutput.append() to display the:
			//	- Reverse
			//	- Number of Letters
			//	- Number of Vowels
			//	- Sum of ASCII Values
		}
	}
}