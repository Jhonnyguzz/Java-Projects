package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Principal extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnEdit;
	private JMenuItem mntmAddPerson;
	private JMenuItem mntmDeletePerson;
	private JTable table;
	private JScrollPane scrollpane;
	private JLabel lblWelcome;
	private JLabel lbl1;
	private JLabel label2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JPanel panel;
	private JLabel lblUsername;
	private JTextField textField;
    private JLabel lblPassword;
    private JPasswordField passwordField;
	private JButton btnSingIn;
	
	public Principal() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 412);
		setTitle("Agenda");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("Archivo");
		menuBar.add(mnFile);
		
		mntmOpen = new JMenuItem("Abrir BD");
		mnFile.add(mntmOpen);
		
		mntmSave = new JMenuItem("Guardar BD");
		mnFile.add(mntmSave);
		
		mntmExit = new JMenuItem("Salir");
		mnFile.add(mntmExit);
		
		mnEdit = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdit);
		
		mntmAddPerson = new JMenuItem("Agregar persona");
		mnEdit.add(mntmAddPerson);
		
		mntmDeletePerson = new JMenuItem("Borrar persona");
		mnEdit.add(mntmDeletePerson);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Nombre","Username"}));
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(27, 145, 348, 184);
		contentPane.add(scrollpane);
		
		lblWelcome = new JLabel("Bienvenido!");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcome.setBounds(27, 21, 115, 43);
		contentPane.add(lblWelcome);
		
		lbl1 = new JLabel("Actualmente hay ");
		lbl1.setBounds(27, 62, 99, 14);
		contentPane.add(lbl1);
		
		label2 = new JLabel("0");
		label2.setBounds(136, 62, 20, 14);
		contentPane.add(label2);
		
		lbl3 = new JLabel("personas registradas");
		lbl3.setBounds(156, 62, 147, 14);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("Por favor carge una base de datos");
		lbl4.setBounds(27, 87, 248, 14);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("(Serializaci\u00F3n) o agrege una persona");
		lbl5.setBounds(27, 105, 248, 14);
		contentPane.add(lbl5);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ingresar al sistema!", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(385, 54, 255, 275);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 41, 59, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(22, 68, 221, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 104, 74, 14);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(22, 129, 221, 20);
		panel.add(passwordField);
		
		btnSingIn = new JButton("Ingresar");
		btnSingIn.setBounds(22, 173, 89, 23);
		panel.add(btnSingIn);
	}
	public JMenu getMnFile() 
	{
		return mnFile;
	}
	public void setMnFile(JMenu mnFile) 
	{
		this.mnFile = mnFile;
	}
	public JMenuItem getMntmOpen() 
	{
		return mntmOpen;
	}
	public void setMntmOpen(JMenuItem mntmOpen) 
	{
		this.mntmOpen = mntmOpen;
	}
	public JMenuItem getMntmSave() 
	{
		return mntmSave;
	}
	public void setMntmSave(JMenuItem mntmSave) 
	{
		this.mntmSave = mntmSave;
	}
	public JMenuItem getMntmExit() 
	{
		return mntmExit;
	}
	public void setMntmExit(JMenuItem mntmExit) 
	{
		this.mntmExit = mntmExit;
	}
	public JMenu getMnEdit() 
	{
		return mnEdit;
	}
	public void setMnEdit(JMenu mnEdit) 
	{
		this.mnEdit = mnEdit;
	}
	public JMenuItem getMntmAddPerson() 
	{
		return mntmAddPerson;
	}
	public void setMntmAddPerson(JMenuItem mntmAddPerson) 
	{
		this.mntmAddPerson = mntmAddPerson;
	}
	public JMenuItem getMntmDeletePerson() 
	{
		return mntmDeletePerson;
	}
	public void setMntmDeletePerson(JMenuItem mntmDeletePerson) 
	{
		this.mntmDeletePerson = mntmDeletePerson;
	}
	public JTable getTable() 
	{
		return table;
	}
	public void setTable(JTable table) 
	{
		this.table = table;
	}
	public JScrollPane getScrollpane() 
	{
		return scrollpane;
	}
	public void setScrollpane(JScrollPane scrollpane) 
	{
		this.scrollpane = scrollpane;
	}
	public JLabel getLblWelcome() 
	{
		return lblWelcome;
	}
	public void setLblWelcome(JLabel lblWelcome) 
	{
		this.lblWelcome = lblWelcome;
	}
	public JLabel getLbl1() 
	{
		return lbl1;
	}
	public void setLbl1(JLabel lbl1) 
	{
		this.lbl1 = lbl1;
	}
	public JLabel getLabel2() 
	{
		return label2;
	}
	public void setLabel2(JLabel label2) 
	{
		this.label2 = label2;
	}
	public JLabel getLbl3() 
	{
		return lbl3;
	}
	public void setLbl3(JLabel lbl3) 
	{
		this.lbl3 = lbl3;
	}
	public JLabel getLbl4() 
	{
		return lbl4;
	}
	public void setLbl4(JLabel lbl4) 
	{
		this.lbl4 = lbl4;
	}
	public JLabel getLbl5() 
	{
		return lbl5;
	}
	public void setLbl5(JLabel lbl5) 
	{
		this.lbl5 = lbl5;
	}
	public JLabel getLblUsername() 
	{
		return lblUsername;
	}
	public void setLblUsername(JLabel lblUsername) 
	{
		this.lblUsername = lblUsername;
	}
	public JTextField getTextField() 
	{
		return textField;
	}
	public void setTextField(JTextField textField) 
	{
		this.textField = textField;
	}
	public JLabel getLblPassword() 
	{
		return lblPassword;
	}
	public void setLblPassword(JLabel lblPassword) 
	{
		this.lblPassword = lblPassword;
	}
	public JPasswordField getPasswordField() 
	{
		return passwordField;
	}
	public void setPasswordField(JPasswordField passwordField) 
	{
		this.passwordField = passwordField;
	}
	public JButton getBtnSingIn() 
	{
		return btnSingIn;
	}
	public void setBtnSingIn(JButton btnSingIn) 
	{
		this.btnSingIn = btnSingIn;
	}
}