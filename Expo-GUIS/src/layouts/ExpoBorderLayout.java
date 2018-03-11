package layouts;

import javax.swing.*;
import java.awt.*;

public class ExpoBorderLayout extends JFrame{
	
	public ExpoBorderLayout() {
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnBotonIzq = new JButton("Boton Izq");
		JButton btnBotonTop = new JButton("Boton Arriba");
		JRadioButton rdbtnEleccinDerecha = new JRadioButton("Elecci\u00F3n Der");
		JButton btnBotonAbajo = new JButton("Boton Abajo");
		JTextArea txtrAreaDeTexto = new JTextArea();
		txtrAreaDeTexto.setText("Area de Texto");
		
		getContentPane().add(btnBotonIzq, BorderLayout.WEST);
		getContentPane().add(btnBotonTop, BorderLayout.NORTH);
		getContentPane().add(rdbtnEleccinDerecha, BorderLayout.EAST);
		getContentPane().add(btnBotonAbajo, BorderLayout.SOUTH);
		getContentPane().add(txtrAreaDeTexto, BorderLayout.CENTER);
		
		this.setSize(500,300);
		this.setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		ExpoBorderLayout border = new ExpoBorderLayout();
	}
}
