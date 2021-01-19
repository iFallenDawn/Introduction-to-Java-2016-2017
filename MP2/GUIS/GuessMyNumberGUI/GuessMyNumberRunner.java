// Name
// Guess My Number Client
// Spec: Client for guess my number program
import java.awt.*; // abstract windowing toolkit
import java.awt.event.*; // respond to windows events
import javax.swing.*; // JGui stuff

public class GuessMyNumberRunner extends JFrame
{
	private JLabel lblUpperBound;
	private JTextField txtUpperBound;
	private JLabel lblGuess;
	private JTextField txtGuess;
	private JButton btnSubmitUpper;
	private JButton btnSubmitGuess;
	private ButtonListener listenerUpper;
	private ButtonListener listenerGuess;
	private JTextArea jtaOutput;
	//JtaOutput.setEditable(true/false)

	public GuessMyNumberRunner()
	{
		super("Guess My Number Game"); //titlebar
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblUpperBound = new JLabel("Enter a number to guess up to:");
		txtUpperBound = new JTextField(10);
		lblGuess = new JLabel("Enter your guess:");
		txtGuess = new JTextField(10);
		btnSubmitUpper = new JButton("Submit upper bound");
		btnSubmitGuess = new JButton("Submit your guess");
		listenerUpper = new ButtonListener();
		listenerGuess = new ButtonListener();

		btnSubmitUpper.addActionListener(listenerUpper);
		btnSubmitGuess.addActionListener(listenerGuess);
	}
}
