package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fallas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollpanel;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Fallas() {
		setResizable(false);
		setTitle("Fallas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 401, 338);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"IdAsignatura","Nombre Asignatura","Fecha"}));
		scrollpanel = new JScrollPane(table);
		scrollpanel.setBounds(5, 5, 380, 219);
		contentPane.add(scrollpanel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
			}
		});
		btnSalir.setBounds(154, 255, 89, 23);
		contentPane.add(btnSalir);
	}

	public JTable getTable() {
		return table;
	}

}
