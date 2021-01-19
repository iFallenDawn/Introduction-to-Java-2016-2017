//Jordan Wang
//Hello World Application
//Spec: Prints hello to a user inputted name

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class HelloWorldGUIApp extends JFrame
{
	//Declare gui items here
	private JLabel lblHello;
	private JTextField txtInput;
	private JButton btnSubmit;
	private ButtonListener listener;
	public HelloWorldGUIApp()
	{
		super("Hello World in GUI App Land");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblHello=new JLabel("Enter Name:");
		txtInput=new JTextField(10);
		btnSubmit=new JButton("Submit");
		listener= new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblHello);
		cp.add(txtInput);
		cp.add(btnSubmit);

		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		HelloWorldGUIApp HelloWorld = new HelloWorldGUIApp();
	}
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(null, "Hello " + txtInput.getText() + "!");
		}
	}
}