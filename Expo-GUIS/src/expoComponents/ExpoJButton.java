package expoComponents;

import java.awt.FlowLayout;

import javax.swing.*;

public class ExpoJButton extends JFrame
{
	private JButton aceptar;
	private JButton cancelar;
	
	public ExpoJButton() 
	{
		super("JButton Example 1.0");
		getContentPane().setLayout(new FlowLayout());
		this.jButtonDefinition();
		this.setSize(400, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
	}
	
	public void jButtonDefinition()
	{
		aceptar = new JButton("Aceptar");
		cancelar = new JButton("Cancelar");
		getContentPane().add(aceptar);
		this.add(cancelar);
	}
	
	public static void main(String[] args)
	{
		ExpoJButton button = new ExpoJButton();
	}
	
	

}
