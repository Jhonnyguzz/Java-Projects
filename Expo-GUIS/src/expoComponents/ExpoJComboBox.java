package expoComponents;

import java.awt.Color;

import javax.swing.*;
import java.awt.Font;

public class ExpoJComboBox extends JFrame
{
	private JComboBox cities;
	private JLabel tittle;
	private JButton ok;	
	private String[] citiesList= {"Bogota", "Cali", "Villavicencio", "Barranquilla", "Ibague"};
	
	public ExpoJComboBox()
	{
		super("JComboBox Example");
		this.jComboBoxDefinition();
		this.setSize(400, 217);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

	private void jComboBoxDefinition()
	{
		tittle = new JLabel("Ciudades");
		tittle.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		tittle.setForeground(Color.green);
		tittle.setBounds(63, 22, 100, 20);
		tittle.setHorizontalAlignment(0);
		getContentPane().add(tittle);
		
		cities = new JComboBox(citiesList);
		cities.setBounds(63, 59, 100, 20);
//		cities.setSelectedIndex(3);
		getContentPane().add(cities);
		
		ok = new JButton("Ok");
		ok.setBounds(199, 59, 100, 20);
		getContentPane().add(ok);
		
	}
	
	public static void main(String[] args)
	{
		ExpoJComboBox exampleComboBox = new ExpoJComboBox();
	}
		
}
