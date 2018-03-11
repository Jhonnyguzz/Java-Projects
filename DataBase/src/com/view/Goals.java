package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Goals extends JFrame {

	private JPanel contentPane;
	private JTextArea logro;
	private JTextArea indicador1;
	private JTextArea indicador2;
	private JScrollPane scrolllogro;
	private JScrollPane scrollindicador1;
	private JScrollPane scrollindicador2;
	private JLabel lblIndicador;
	private JLabel lblIndicador_1;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Goals() {
		setResizable(false);
		setTitle("Logros e indicadores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 516, 340);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogro = new JLabel("Logro:");
		lblLogro.setBounds(27, 27, 81, 28);
		contentPane.add(lblLogro);
			
		logro = new JTextArea();
		logro.setEditable(false);
		scrolllogro = new JScrollPane(logro);
		scrolllogro.setBounds(99, 29, 362, 61);
		contentPane.add(scrolllogro);		
		
		lblIndicador = new JLabel("Indicador 1:");
		lblIndicador.setBounds(27, 128, 81, 14);
		contentPane.add(lblIndicador);
		
		indicador1 = new JTextArea();
		indicador1.setEditable(false);
		scrollindicador1 = new JScrollPane(indicador1);
		scrollindicador1.setBounds(99, 123, 362, 38);
		contentPane.add(scrollindicador1);
		
		lblIndicador_1 = new JLabel("Indicador 2:");
		lblIndicador_1.setBounds(27, 190, 81, 14);
		contentPane.add(lblIndicador_1);
		
		indicador2 = new JTextArea();
		indicador2.setEditable(false);
		scrollindicador2 = new JScrollPane(indicador2);
		scrollindicador2.setBounds(99, 185, 362, 38);
		contentPane.add(scrollindicador2);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		btnSalir.setBounds(218, 251, 89, 23);
		contentPane.add(btnSalir);
		
	}

	public JTextArea getLogro() {
		return logro;
	}

	public JTextArea getIndicador1() {
		return indicador1;
	}

	public JTextArea getIndicador2() {
		return indicador2;
	}
}
