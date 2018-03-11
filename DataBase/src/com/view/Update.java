package com.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.data.Conexion;
import com.data.Data;

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField telefono;
	private JTextField direcc;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Update() {
		setResizable(false);
		setTitle("Modificar datos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 374, 218);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(27, 48, 59, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(27, 73, 85, 14);
		contentPane.add(lblDireccin);
		
		telefono = new JTextField();
		telefono.setBounds(114, 45, 158, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		direcc = new JTextField();
		direcc.setBounds(114, 70, 158, 20);
		contentPane.add(direcc);
		direcc.setColumns(10);
		
		JButton btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Statement st;
				
				String direccion=getDirecc().getText();
				String telefono=getTelefono().getText();
				
				long tel=Long.parseLong(telefono);
				
				String sql="update estudiante set telefono='"+tel+"',direccion='"+direccion+"' where codigoEstudiante="+Data.id;
					
				try {
					st = Conexion.getConexion().createStatement();
					int confirmar=st.executeUpdate(sql);
					if(confirmar==1)
					{
						System.out.println("Modificación hecha");
					}
					else 
					{
						System.out.println("Error");
					}

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
		});
		btnGuardarCambios.setBounds(27, 133, 155, 23);
		contentPane.add(btnGuardarCambios);
		
		JButton btnNewButton = new JButton("Salir sin guardar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
			}
		});
		btnNewButton.setBounds(192, 133, 141, 23);
		contentPane.add(btnNewButton);
	}

	public JTextField getTelefono() {
		return telefono;
	}

	public JTextField getDirecc() {
		return direcc;
	}
}
