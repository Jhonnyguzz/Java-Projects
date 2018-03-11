package layouts;
import javax.swing.*;
import java.awt.*;

public class ExpoGridLayout extends JFrame{
	
	public ExpoGridLayout() {
		
		getContentPane().setLayout(new GridLayout(3,3));
		
		JButton btnBotonIzq = new JButton("Boton Izq");
		JButton btnBotonTop = new JButton("Boton Arriba");
		JRadioButton rdbtnEleccinDerecha = new JRadioButton("Elecci\u00F3n Der");
		JButton btnBotonAbajo = new JButton("Boton Abajo");
		JTextArea txtrAreaDeTexto = new JTextArea();
		txtrAreaDeTexto.setText("Area de Texto");
		
		getContentPane().add(btnBotonIzq);
		getContentPane().add(btnBotonTop);
		getContentPane().add(rdbtnEleccinDerecha);
		getContentPane().add(btnBotonAbajo);
		getContentPane().add(txtrAreaDeTexto);
		
		this.setSize(500,300);
		this.setResizable(false);
		setVisible(true);	
	}
	public static void main(String[] args) 
	{
		ExpoGridLayout grid = new ExpoGridLayout();
	}
}
