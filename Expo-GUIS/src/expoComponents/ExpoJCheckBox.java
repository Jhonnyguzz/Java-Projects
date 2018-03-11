package expoComponents;

import javax.swing.*;

public class ExpoJCheckBox extends JFrame
{
	private JCheckBox cb1, cb2, cb3, cb4;
	private JLabel label1;
	
	public ExpoJCheckBox()
	{
		super("JCheckBox Example");
		this.jCheckBoxDefinition();
		this.setSize(240, 209);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

	private void jCheckBoxDefinition() 
	{
		label1 = new JLabel("Un simple Ejemplo");
		label1.setLocation(40, 33);
		label1.setSize(200, 20);
		
		cb1 = new JCheckBox("Triangulo");
		cb1.setBounds(40, 60, 100, 20);
		
		cb2 = new JCheckBox("Cuadrado");
		cb2.setBounds(40, 80, 88, 20);
		
		cb3 = new JCheckBox("Circulo");
		cb3.setBounds(40, 100, 76, 20);
		
		cb4 = new JCheckBox("Rectangulo");
		cb4.setBounds(40, 120, 124, 20);
		
		getContentPane().setLayout(null);
		getContentPane().add(cb1);
		getContentPane().add(cb2);
		getContentPane().add(cb3);
		getContentPane().add(cb4);
		getContentPane().add(label1);
	}
	
	public static void main(String[] args) 
	{
		ExpoJCheckBox exampleCheckBox = new ExpoJCheckBox();
	}
	
}
