package layouts;
import javax.swing.*;
import java.awt.*;

public class ExpoFlowLayout extends JFrame{
	
	public ExpoFlowLayout() {
		
getContentPane().setLayout(new FlowLayout());
		
		JButton btnBotonIzq = new JButton("Boton Izq");
		JButton btnBotonTop = new JButton("Boton Arriba");
		JRadioButton rdbtnEleccinDerecha = new JRadioButton("Elecci\u00F3n Der");
		JButton btnBotonAbajo = new JButton("Boton Abajo");
		JTextArea txtrAreaDeTexto = new JTextArea();
		txtrAreaDeTexto.setText("Area de Texto");
		
		JButton btnAdd1 = new JButton("Boton Adicional 1");
		JButton btnAdd2 = new JButton("Boton Adicional 2");
		JButton btnAdd3 = new JButton("Boton Adicional 3");
		JButton btnAdd4 = new JButton("Boton Adicional 4");
		JButton btnAdd5 = new JButton("Boton Adicional 5");
		
		getContentPane().add(btnBotonIzq);
		getContentPane().add(btnBotonTop);
		getContentPane().add(rdbtnEleccinDerecha);
		getContentPane().add(btnBotonAbajo);
		getContentPane().add(txtrAreaDeTexto);
		
		getContentPane().add(btnAdd1);
		getContentPane().add(btnAdd2);
		getContentPane().add(btnAdd3);
		getContentPane().add(btnAdd4);
		getContentPane().add(btnAdd5);
		
		this.setSize(500,300);
		this.setResizable(false);
		setVisible(true);	
	}
	public static void main(String[] args) 
	{
		ExpoFlowLayout flow = new ExpoFlowLayout();
		
	}
}
