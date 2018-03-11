package expoComponents;

import java.awt.FlowLayout;

import javax.swing.*;

public class ExpoJRadioButton extends JFrame
{
	private JTextField texto;
	private JRadioButton negrita, cursiva, ambos, plano;
	private JRadioButton negrita2, cursiva2, ambos2, plano2;
	private ButtonGroup grupo;
	
	public ExpoJRadioButton()
	{
		super("JRadioButtom Example");
		this.jRadioButtonDefinition();
		this.setSize(382, 208);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void jRadioButtonDefinition()
	{
		texto = new JTextField(40);
		texto.setBounds(10, 21, 326, 20);
		
		negrita = new JRadioButton("Negrita");
		negrita.setBounds(10, 48, 80, 23);
		cursiva = new JRadioButton("Curisva");
		cursiva.setBounds(91, 48, 82, 23);
		ambos =  new JRadioButton("Ambos");
		ambos.setBounds(175, 48, 80, 23);
		plano = new JRadioButton("Plano");
		plano.setBounds(267, 48, 69, 23);
		grupo = new ButtonGroup();
		
		getContentPane().setLayout(null);
		
		getContentPane().add(texto);
		getContentPane().add(negrita);
		getContentPane().add(cursiva);
		getContentPane().add(ambos);
		getContentPane().add(plano);
		
		negrita2 = new JRadioButton("Negrita2");
		negrita2.setBounds(10, 120, 80, 23);
		cursiva2 = new JRadioButton("Curisva2");
		cursiva2.setBounds(96, 120, 77, 23);
		ambos2 =  new JRadioButton("Ambos2");
		ambos2.setBounds(175, 120, 73, 23);
		plano2 = new JRadioButton("Plano2");
		plano2.setBounds(250, 120, 93, 23);
		getContentPane().add(negrita2);
		getContentPane().add(cursiva2);
		getContentPane().add(ambos2);
		getContentPane().add(plano2);
		
		grupo.add(negrita);
		grupo.add(cursiva);
		grupo.add(ambos);
		grupo.add(plano);
	}
	
	public static void main(String[] args) 
	{
		ExpoJRadioButton exampleRadio = new ExpoJRadioButton();
	}
}

