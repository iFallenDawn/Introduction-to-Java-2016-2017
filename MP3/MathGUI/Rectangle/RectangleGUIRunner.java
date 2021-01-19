// Jordan Wang
// Rectangle Calculator
// Spec: Calculates area and perimeter of rectangles

import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class RectangleGUIRunner extends JFrame
{
	private JLabel lblLength, lblWidth, lblTitle, lblRectangle;
	private ImageIcon icoRectangle;
	private JTextField txtWidth, txtLength;
	private JTextArea jtaOutput;
	private JButton btnSubmit;
	private ButtonListener listener;

	public RectangleGUIRunner()
	{
		super("Rectangle Program in GUI App Land");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("      Rectangle Application      \n      By Jordan Wang       ");
		lblRectangle = new JLabel();
		icoRectangle = new ImageIcon("rectangle.png");
		lblRectangle.setIcon(icoRectangle);
		lblLength = new JLabel("Enter Length:");
		txtLength = new JTextField(5);
		lblWidth = new JLabel("Enter Width:");
		txtWidth = new JTextField(5);
		btnSubmit = new JButton("Submit");
		jtaOutput = new JTextArea(5,20);
		jtaOutput.setEditable(false);
		listener = new ButtonListener();

		btnSubmit.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblRectangle);
		cp.add(lblLength);
		cp.add(txtLength);
		cp.add(lblWidth);
		cp.add(txtWidth);
		cp.add(btnSubmit);
		cp.add(jtaOutput);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		RectangleGUIRunner Rectangle = new RectangleGUIRunner();
	}

	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String length = txtLength.getText();
			String width = txtWidth.getText();
			Rectangle r = new Rectangle(Double.parseDouble(length), Double.parseDouble(width));
			jtaOutput.setText(r.toString());
		}
	}
}