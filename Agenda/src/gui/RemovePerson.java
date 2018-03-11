package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class RemovePerson extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollpane;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JPasswordField passwordField;
	private JButton btnDelete;

	public RemovePerson() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 385);
		setTitle("Borrar persona");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Nombre","Username"}));
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 77, 348, 184);
		contentPane.add(scrollpane);	
		
		lbl1 = new JLabel("Seleccione la persona a borrar, escriba la contrase\u00F1a, y luego");
		lbl1.setBounds(10, 25, 383, 19);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel(" presione el boton borrar");
		lbl2.setBounds(10, 45, 185, 14);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("Contrase\u00F1a:");
		lbl3.setBounds(10, 279, 82, 14);
		contentPane.add(lbl3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 276, 159, 17);
		contentPane.add(passwordField);
		
		btnDelete = new JButton("Borrar");
		btnDelete.setBounds(133, 313, 89, 23);
		contentPane.add(btnDelete);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
}
