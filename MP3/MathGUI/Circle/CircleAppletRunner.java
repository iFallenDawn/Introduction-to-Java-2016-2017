// Jordan Wang
// Circle Calculations Object
// Spec: Given the radius of a circle; calculate and display area and circumference

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class CircleAppletRunner extends JApplet
{
	private JLabel lblRadius, lblTitle, lblCircle;
	private ImageIcon icoCircle;
	private JTextField txtRadius;
	private JTextArea jtaOutput;
	private JButton btnSubmit;
	private ButtonListener listener;

	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("      Circle Application      \n      By Jordan Wang       ");
		lblCircle = new JLabel();
		icoCircle = new ImageIcon("circle.png");
		lblCircle.setIcon(icoCircle);
		lblRadius = new JLabel("Enter Radius:");
		txtRadius = new JTextField(5);
		btnSubmit = new JButton("Submit");
		jtaOutput = new JTextArea(5,20);
		jtaOutput.setEditable(false);
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblCircle);
		cp.add(lblRadius);
		cp.add(txtRadius);
		cp.add(btnSubmit);
		cp.add(jtaOutput);

		setSize(300, 250);
		setVisible(true);
	}
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String radius = txtRadius.getText();
			Circle c = new Circle(Double.parseDouble(radius));
			jtaOutput.setText(c.toString());
		}
	}
}