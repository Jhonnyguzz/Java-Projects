package expoComponents;

import java.awt.Color;

import javax.swing.*;


public class ExpoJLabel extends JFrame
{
	private JLabel labelExample;
	
	public ExpoJLabel()
	{
		super();
		this.setTitle("JLabel Example 1.0");
		jLabelDefinition();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100);
		this.setVisible(true);
	}
	
	public void jLabelDefinition()
	{
		labelExample = new JLabel("Hello friends this is POO with Niquefa XD");
//		labelExample.setLocation(20, 20);
		labelExample.setSize(50, 20);
		labelExample.setBackground(Color.cyan);
		labelExample.setHorizontalAlignment(0);
		this.add(labelExample);
	}
	
	public static void main(String[] args) 
	{
		ExpoJLabel Label = new ExpoJLabel();
	}
	
}
