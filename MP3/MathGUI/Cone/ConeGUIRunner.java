//Jordan Wang
//Cone Calculator
//Spec: Calculates volume, lateral surface area, and total surface area of a cone

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class ConeGUIRunner extends JFrame
{
	private JLabel lblRadius, lblHeight, lblTitle, lblCone;
	private ImageIcon icoCone;
	private JTextField txtRadius, txtHeight;
	private JTextArea jtaOutput;
	private JButton btnSubmit;
	private ButtonListener listener;

	public ConeGUIRunner()
	{
		super("Cone Program in GUI App Land");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("      Cone Application      \n      By Jordan Wang       ");
		lblCone = new JLabel();
		icoCone = new ImageIcon("cone.jpeg");
		lblCone.setIcon(icoCone);
		lblRadius= new JLabel("Enter Radius:");
		txtRadius = new JTextField(10);
		lblHeight = new JLabel("Enter Height:");
		txtHeight = new JTextField(10);
		btnSubmit = new JButton("Submit");
		jtaOutput = new JTextArea(5,20);
		jtaOutput.setEditable(false);
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblCone);
		cp.add(lblRadius);
		cp.add(txtRadius);
		cp.add(lblHeight);
		cp.add(txtHeight);
		cp.add(btnSubmit);
		cp.add(jtaOutput);

		setSize(250, 500);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		ConeGUIRunner Cone = new ConeGUIRunner();
	}

	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String radius = txtRadius.getText();
			String height = txtHeight.getText();
			Cone c = new Cone(Double.parseDouble(radius), Double.parseDouble(height));
			jtaOutput.setText(c.toString());
		}
	}
}