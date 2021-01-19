//Jordan Wang
//BMI Calculator
//Spec: Calculates BMI based off user input


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMIRunner extends JApplet
{
	// Declare all of your GUI objects here
	private JLabel lblWeight, lblFeet, lblTitle, lblInches, lblPerson;
	private ImageIcon icoSmall, icoMedium, icoBig, icoBigger;
	private JTextField txtWeight, txtFeet, txtInches;
	private BMI bmi;
	private JTextArea jtaOutput;
	private JButton btnSubmit;
	private ButtonListener listener;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		lblTitle = new JLabel("      BMI Calculator      \n      By Jordan Wang       ");
		lblPerson = new JLabel();
		lblWeight = new JLabel("Weight: ");
		txtWeight = new JTextField(5);
		lblFeet = new JLabel("Feet: ");
		txtFeet = new JTextField(5);
		lblInches = new JLabel("Inches: ");
		txtInches = new JTextField(5);
		jtaOutput = new JTextArea(1, 1);
		jtaOutput.setEditable(false);
		icoSmall = new ImageIcon("skeleton.jpg");
		icoMedium = new ImageIcon("medium.jpg");
		icoBig = new ImageIcon("big.jpg");
		icoBigger = new ImageIcon("bigger.jpg");
		listener = new ButtonListener();
		btnSubmit = new JButton("Submit");

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblFeet);
		cp.add(txtFeet);
		cp.add(lblInches);
		cp.add(txtInches);
		cp.add(lblWeight);
		cp.add(txtWeight);
		cp.add(btnSubmit);
		cp.add(jtaOutput);
		cp.add(lblPerson);

		setSize(250, 300);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String feet = txtFeet.getText();
			String inches = txtInches.getText();
			String weight = txtWeight.getText();
			bmi = new BMI(Integer.parseInt(feet), Integer.parseInt(inches), Integer.parseInt(weight));
			double bmi2 = bmi.getBMI();
			if(bmi2 < 18.5)
				lblPerson.setIcon(icoSmall);
			else if(bmi2 >= 18.5 && bmi2 < 24.9)
				lblPerson.setIcon(icoMedium);
			else if(bmi2 >= 24.9 && bmi2 <= 29.9)
				lblPerson.setIcon(icoBig);
			else
				lblPerson.setIcon(icoBigger);
			jtaOutput.setText(bmi.toString());
		}
	}
}


