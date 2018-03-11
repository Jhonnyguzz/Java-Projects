package gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddPerson extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtDd;
	private JTextField txtMm;
	private JTextField txtYyyy;
	private JButton btnAdd;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel label;
	private JLabel label_1;
	private JPasswordField passwordField;
	private JLabel lbl9;

	public AddPerson() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 477);
		setTitle("Agregar persona");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(161, 41, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 72, 174, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 103, 174, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(161, 134, 174, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 201, 174, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 232, 174, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(161, 265, 174, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		btnAdd = new JButton("Agregar");
		btnAdd.setBounds(124, 405, 89, 23);
		contentPane.add(btnAdd);
		
		lbl1 = new JLabel("Primer nombre:");
		lbl1.setBounds(21, 44, 130, 14);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("Segundo nombre:");
		lbl2.setBounds(21, 75, 118, 14);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("Primer apellido:");
		lbl3.setBounds(21, 106, 130, 14);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("Segundo apellido:");
		lbl4.setBounds(21, 137, 130, 14);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("Fecha de nacimiento:");
		lbl5.setBounds(21, 168, 130, 14);
		contentPane.add(lbl5);

		txtDd = new JTextField();
		txtDd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDd.setText("DD");
		txtDd.setBounds(161, 170, 46, 20);
		contentPane.add(txtDd);
		txtDd.setColumns(10);
		
		label = new JLabel("/");
		label.setBounds(213, 176, 18, 14);
		contentPane.add(label);
		
		txtMm = new JTextField();
		txtMm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMm.setText("MM");
		txtMm.setBounds(221, 170, 46, 20);
		contentPane.add(txtMm);
		txtMm.setColumns(10);
		
		label_1 = new JLabel("/");
		label_1.setBounds(270, 176, 18, 14);
		contentPane.add(label_1);
		
		txtYyyy = new JTextField();
		txtYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtYyyy.setText("YYYY");
		txtYyyy.setBounds(289, 170, 46, 20);
		contentPane.add(txtYyyy);
		txtYyyy.setColumns(10);
		
		lbl6 = new JLabel("Correo electr\u00F3nico:");
		lbl6.setBounds(21, 204, 130, 14);
		contentPane.add(lbl6);
		
		lbl7 = new JLabel("Documento:");
		lbl7.setBounds(21, 235, 130, 14);
		contentPane.add(lbl7);
		
		lbl8 = new JLabel("Username:");
		lbl8.setBounds(21, 268, 118, 14);
		contentPane.add(lbl8);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 296, 174, 20);
		contentPane.add(passwordField);
		
		lbl9 = new JLabel("Password:");
		lbl9.setBounds(21, 299, 118, 14);
		contentPane.add(lbl9);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	public JTextField getTxtDd() {
		return txtDd;
	}

	public void setTxtDd(JTextField txtDd) {
		this.txtDd = txtDd;
	}

	public JTextField getTxtMm() {
		return txtMm;
	}

	public void setTxtMm(JTextField txtMm) {
		this.txtMm = txtMm;
	}

	public JTextField getTxtYyyy() {
		return txtYyyy;
	}

	public void setTxtYyyy(JTextField txtYyyy) {
		this.txtYyyy = txtYyyy;
	}
}
