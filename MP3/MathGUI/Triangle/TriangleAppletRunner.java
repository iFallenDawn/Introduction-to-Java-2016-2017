//Jordan Wang
//Triangle Calculator
//Spec: Runs the Triangle program

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class TriangleAppletRunner extends JApplet
{
	private JLabel lblBase, lblHeight, lblName, lblTitle, lblTriangle;
	private ImageIcon icoTriangle;
	private JTextField txtBase, txtHeight;
	private JTextArea jtaOutput;
	private JButton btnSubmit;
	private ButtonListener listener;

	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("      Triangle Application      ");
		lblName = new JLabel("\tBy Jordan Wang\t");
		lblTriangle = new JLabel();
		icoTriangle = new ImageIcon("triangle.png");
		lblTriangle.setIcon(icoTriangle);
		lblBase= new JLabel("Enter Radius:");
		txtBase = new JTextField(10);
		lblHeight = new JLabel("Enter Height:");
		txtHeight = new JTextField(10);
		btnSubmit = new JButton("Submit");
		jtaOutput = new JTextArea(5,20);
		jtaOutput.setEditable(false);
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblName);
		cp.add(lblTriangle);
		cp.add(lblBase);
		cp.add(txtBase);
		cp.add(lblHeight);
		cp.add(txtHeight);
		cp.add(btnSubmit);
		cp.add(jtaOutput);

		setSize(250, 420);
		setVisible(true);
	}

	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String base = txtBase.getText();
			String height = txtHeight.getText();
			Triangle t = new Triangle(Double.parseDouble(base), Double.parseDouble(height));
			jtaOutput.setText(t.toString());
		}
	}
}