//Jordan Wang
//Hello World Applet
//Spec: Prints hello to a user inputted name

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class HelloWorld extends JApplet
{
	// Declared GUI Items - Instance Variables
	private JLabel lblEnterName;
	private JTextField txtName;
	private JButton btnSubmit;
	private ButtonListener listener;

	public void init()
	{
		// Create Window
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		// Instantiate GUI objects... do the same for txtName, btnSubmit and your listener
		lblEnterName = new JLabel("Enter Name:");
		txtName = new JTextField(10);
		btnSubmit = new JButton("Submit");
		listener= new ButtonListener();

		// Add GUI objects to the window... add the txtName and btnSubmit in the same way
		cp.add(lblEnterName);
		cp.add(txtName);
		cp.add(btnSubmit);

		// Add Listener to the button
		btnSubmit.addActionListener(listener);

		// Set Size
		setSize(200,100);
		setVisible(true);
		//JOptionPane.showMessageDialog(null, "Hello World!!!");
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String name;
			name = txtName.getText();
			JOptionPane.showMessageDialog(null, "Hello " + name + "!");
		}
	}

}
