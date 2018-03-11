package ejemploclase;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import expoComponents.ExpoJButton;

import Components.ButtonExample;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingDesigner extends JFrame {
	private JTextField textField;
	
	public SwingDesigner() {
		
		getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Boton 1");
		button1.addActionListener(new BtnBotonActionListener());
		button1.setBounds(279, 27, 89, 23);
		getContentPane().add(button1);
		
		textField = new JTextField();
		textField.setBounds(54, 30, 197, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 231, 268, 119);
		getContentPane().add(lblNewLabel);
		
		JButton btnBoton = new JButton("Boton 2");
		btnBoton.addActionListener(new BtnBotonActionListener());
		btnBoton.setBounds(125, 132, 89, 23);
		getContentPane().add(btnBoton);
		
		JButton btnNuevaPantalla = new JButton("Nueva pantalla");
		btnNuevaPantalla.addActionListener(new BtnNuevaPantallaActionListener());
		btnNuevaPantalla.setBounds(88, 192, 180, 23);
		getContentPane().add(btnNuevaPantalla);
		
		setSize(400,400);
		setLocation(300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		SwingDesigner sd = new SwingDesigner();
		
		
	}
	
	private class BtnBotonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Oprimieron boton 2 con clase por fuera");
		}
	}
	private class BtnNuevaPantallaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			ExpoJButton b = new ExpoJButton();
			setVisible(false);
			
	     
			
		}
	}
}
