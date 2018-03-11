package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Estudiante extends JFrame {
	public Estudiante() {
		super("Estudiante");
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(28, 36, 137, 20);
		getContentPane().add(comboBox);
		
		add(comboBox);
        comboBox.addItem("Calculo");
        comboBox.addItem("Español");
        comboBox.addItem("Filosofia");
        comboBox.addItem("Quimica");
        comboBox.addItem("Fisica");
        comboBox.addItem("Ingles");
        comboBox.addItem("Religion");
        comboBox.addItem("Educación Fisica");
        comboBox.addItem("Informatica");
        
		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(28, 11, 89, 14);
		getContentPane().add(lblAsignatura);
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


}
