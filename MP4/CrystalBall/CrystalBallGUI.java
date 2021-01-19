// Jordan Wang
// CrystalBall Object
// Spec: has methods for determining random events

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import java.applet.*;

public class CrystalBallGUI extends JFrame
{
	private JLabel lblTitle, lblPic;
	private ImageIcon icoPic;
	private JButton btnAsk, btnFortune, btnLotto;
	private ButtonListener listener;

	public CrystalBallGUI()
	{
		super("Crystal Ball");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("\tCrystalBall\t");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblPic = new JLabel();
		icoPic = new ImageIcon("crystalball.jpg");
		btnAsk = new JButton("Ask");
		btnFortune = new JButton("Fortune");
		btnLotto = new JButton("Lotto Numbers");
		lblPic.setIcon(icoPic);
		listener = new ButtonListener();

		btnAsk.addActionListener(listener);
		btnFortune.addActionListener(listener);
		btnLotto.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblPic);
		cp.add(btnAsk);
		cp.add(btnFortune);
		cp.add(btnLotto);

		// Tell Java how to display the window
		setSize(275,350);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		CrystalBallGUI crystalball = new CrystalBallGUI();
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			CrystalBall c = new CrystalBall();
			Object source = event.getSource();
			if(source==btnAsk)
			{
				JOptionPane.showMessageDialog (null, c.getAnswer(), "Ask", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(source==btnFortune)
			{
				JOptionPane.showMessageDialog (null, c.getFortune(), "Fortune", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(source==btnLotto)
			{
				JOptionPane.showMessageDialog (null, c.getLottoNumbers(), "Lotto Numbers", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}