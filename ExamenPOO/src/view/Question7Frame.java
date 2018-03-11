package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import utilities.ModelTable;

public class Question7Frame extends JFrame {

	private JPanel contentPane;	
	private JTable table;
	private JScrollPane scrollpanel;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;
	private JTextField textFieldId;
	private JButton btnAgregar;
	private JButton btnBorrar;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question7Frame frame = new Question7Frame();
					ModelTable xd = new ModelTable(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Question7Frame() 
	{
		setTitle("Frame para pregunta 7");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Nombre","Edad","Id"}));
		scrollpanel = new JScrollPane(table);
		scrollpanel.setBounds(5, 5, 426, 174);
		contentPane.add(scrollpanel);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(106, 190, 201, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setBounds(106, 221, 86, 20);
		contentPane.add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(106, 257, 86, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(15, 193, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(15, 224, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(15, 260, 46, 14);
		contentPane.add(lblId);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(103, 298, 89, 23);
		contentPane.add(btnAgregar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(219, 298, 89, 23);
		contentPane.add(btnBorrar);
		
		label = new JLabel("");
		label.setBounds(10, 364, 421, 35);
		contentPane.add(label);
	}
	public JButton getBtnAgregar()
	{
		return btnAgregar;
	}
	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldEdad() {
		return textFieldEdad;
	}

	public void setTextFieldEdad(JTextField textFieldEdad) {
		this.textFieldEdad = textFieldEdad;
	}

	public JTextField getTextFieldId() {
		return textFieldId;
	}

	public void setTextFieldId(JTextField textFieldId) {
		this.textFieldId = textFieldId;
	}

	public JTable getTable() 
	{
		return table;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
}
