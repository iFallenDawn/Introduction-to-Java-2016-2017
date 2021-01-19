//Jordan Wang
//Food Order Program
//Spec: Orders food based off what button the user clicks

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import java.applet.*;

public class FoodOrderApplet extends JApplet
{
	FoodOrder f = new FoodOrder();
	double money;
	private JLabel lblTitle, lblInformation, lblPic, lblPrices;
	private ImageIcon icoRice, icoSushi, icoEggroll, icoChicken, icoVegetable;
	private JButton btnCompleteOrder, btnClear, btnRice, btnSushi, btnEggroll, btnChicken, btnVegetable;
	private ButtonListener listener;

	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		lblTitle = new JLabel("\tAsian Food Place!");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblInformation = new JLabel("Total Bill: 0  Rice: 0 Sushi: 0 Eggrolls: 0 Chicken: 0 Vegetables: 0");
		lblPrices = new JLabel("Rice $5, Sushi $3, Eggrolls $2, Chicken $4, Vegetables $3");
		lblPic = new JLabel();
		icoRice = new ImageIcon("rice.jpg");
		icoSushi = new ImageIcon("sushi.jpg");
		icoEggroll = new ImageIcon("eggroll.jpg");
		icoChicken = new ImageIcon("chicken.jpg");
		icoVegetable = new ImageIcon("vegetable.jpg");
		lblPic.setIcon(icoRice);
		btnCompleteOrder = new JButton("Complete Order");
		btnClear = new JButton("Clear Order");
		btnRice = new JButton("Rice");
		btnSushi = new JButton("Sushi");
		btnEggroll = new JButton("Eggroll");
		btnChicken = new JButton("Chicken");
		btnVegetable = new JButton("Vegetable");
		listener = new ButtonListener();

		btnCompleteOrder.addActionListener(listener);
		btnClear.addActionListener(listener);
		btnRice.addActionListener(listener);
		btnSushi.addActionListener(listener);
		btnEggroll.addActionListener(listener);
		btnChicken.addActionListener(listener);
		btnVegetable.addActionListener(listener);

		cp.add(lblTitle);
		cp.add(lblInformation);
		cp.add(btnRice);
		cp.add(btnSushi);
		cp.add(btnEggroll);
		cp.add(btnChicken);
		cp.add(btnVegetable);
		cp.add(btnCompleteOrder);
		cp.add(btnClear);
		cp.add(lblPic);
		cp.add(lblPrices);

		setSize(410,410);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = new Object();
			source = event.getSource();
			if(source == btnRice)
			{
				lblPic.setIcon(icoRice);
				f.rice++;
				//System.out.print(f.rice + "\n");
			}
			if(source == btnSushi)
			{
				lblPic.setIcon(icoSushi);
				f.sushi++;
			}
			if(source == btnEggroll)
			{
				lblPic.setIcon(icoEggroll);
				f.eggroll++;
			}
			if(source == btnChicken)
			{
				lblPic.setIcon(icoChicken);
				f.chicken++;
			}
			if(source == btnVegetable)
			{
				lblPic.setIcon(icoVegetable);
				f.vegetable++;
			}
			if(source == btnCompleteOrder)
			{
				String strMoneypaid = JOptionPane.showInputDialog("Enter how much money you have: ");
				money = Double.parseDouble(strMoneypaid);
				double temp = f.getTotal();
				if(money >= f.getTotal())
				{
					JOptionPane.showMessageDialog (null, "You have enough money, with $" + (money-temp) + " as change!");
					f.resetVals();
				}
				else
				{
					JOptionPane.showMessageDialog (null, "You don't have enough money, you need $" + (temp-money) + " more!");
				}
			}
			if(source == btnClear)
			{
				f.resetVals();
			}
			lblInformation.setText(f.toString());
		}
	}
}