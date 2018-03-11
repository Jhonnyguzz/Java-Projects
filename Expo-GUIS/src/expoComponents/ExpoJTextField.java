package expoComponents;

import java.awt.FlowLayout;

import javax.swing.*;

public class ExpoJTextField extends JFrame
{
	private JLabel labelTextField;
	private JTextField exampleTextField;
	
	
	public ExpoJTextField()
	{
		super("TextField Example 1.0");
		this.jTextFieldDefinition();
		this.setSize(400, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
		
	}

	private void jTextFieldDefinition() 
	{
		labelTextField = new JLabel("Hello i'm a TextField ->");
//		labelTextField.setBounds(x, y, width, height);
		labelTextField.setBounds(41, 23, 145, 14);
		
		exampleTextField = new JTextField();
//		exampleTextField.setBounds(173, 20, 183, 20);
		exampleTextField.setLocation(173, 20);
		exampleTextField.setSize(183,20);
		
		getContentPane().setLayout(null);
		getContentPane().add(labelTextField);
		getContentPane().add(exampleTextField);
	}
	
	public static void main(String[] args)
	{
		ExpoJTextField example = new ExpoJTextField();
	}
}
