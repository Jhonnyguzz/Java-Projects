package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import controller.App;

public class MainFrame extends JFrame {

	public MainFrame(){
		
		super("Notas");
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if(textField.getText().equals("root")){
			 App.getInstance().ConexiónBD();
			 }
			}
		});
		
		btnNewButton.setBounds(157, 204, 142, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(157, 121, 142, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
	
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(157, 96, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(157, 152, 62, 14);
		getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 173, 142, 20);
		getContentPane().add(passwordField);
		
		new String(passwordField.getPassword());
				
	}
	
	
	public void cerrar() {
		setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent we){
				JOptionPane.showConfirmDialog(null,"¿Desea salir?", "Salir",JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
		});
	}
	
	
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private JPasswordField passwordField;
}
