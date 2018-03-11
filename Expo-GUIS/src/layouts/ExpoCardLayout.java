package layouts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExpoCardLayout extends JFrame{
	
	JButton btnBotonIzq , btnBotonTop, btnBotonAbajo, btnBotonArriba, btnPanel1, btnPanel2, btnPanel3;
	JRadioButton rdbtnEleccinDerecha;
	JTextArea txtrAreaDeTexto;
	
	public ExpoCardLayout() {
		
		final JPanel panel = new JPanel(new CardLayout());
		JPanel insidePanel1 = new JPanel();
		JPanel insidePanel2 = new JPanel();
		JPanel insidePanel3 = new JPanel();
		
		JButton btnBotonIzq = new JButton("Boton Izq");
		btnBotonIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CardLayout cl = (CardLayout)(panel.getLayout());
			    cl.show(panel,"Panel_1");
				
			}
		});
		JButton btnBotonTop = new JButton("Boton Arriba");
		btnBotonTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cl = (CardLayout)(panel.getLayout());
			    cl.show(panel,"Panel_2");
				
			}
		});
		JButton btnBotonAbajo = new JButton("Boton Abajo");
		btnBotonAbajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CardLayout cl = (CardLayout)(panel.getLayout());
			    cl.show(panel,"Panel_3");
				
			}
		});
		JButton btnPanel1 = new JButton("Boton en panel 1");
		JButton btnPanel2 = new JButton("Boton en panel 2");
		JButton btnPanel3 = new JButton("Boton en panel 3");
		JRadioButton rdbtnEleccinDerecha = new JRadioButton("Elecci\u00F3n Der");
		JTextArea txtrAreaDeTexto = new JTextArea();
		txtrAreaDeTexto.setText("Area de Texto");
		
		insidePanel1.add(btnPanel1);
		insidePanel2.add(btnPanel2);
		insidePanel3.add(btnPanel3);
		panel.add(insidePanel1,"Panel_1");
		panel.add(insidePanel2,"Panel_2");
		panel.add(insidePanel3,"Panel_3");
		getContentPane().add(btnBotonIzq, BorderLayout.WEST);
		getContentPane().add(btnBotonTop, BorderLayout.NORTH);
		getContentPane().add(rdbtnEleccinDerecha, BorderLayout.EAST);
		getContentPane().add(btnBotonAbajo, BorderLayout.SOUTH);
		getContentPane().add(panel, BorderLayout.CENTER); 
		
		this.setSize(500,300);
		this.setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		ExpoCardLayout card = new ExpoCardLayout();
	}
	
}
