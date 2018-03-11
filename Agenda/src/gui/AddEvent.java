package gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class AddEvent extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField txtDd;
	private JLabel label;
	private JTextField txtMm;
	private JLabel label_1;
	private JTextField txtYyyy;
	private JLabel lbl2;
	private JButton btnAdd;
	private JComboBox<String> comboBox;
	private JLabel lbl3;
	private JLabel lbl4;
	private JTextField textField;
	private JLabel lbl5;
	private JTextField textField_1;
	private JLabel lbl6;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lbl7;
	private JLabel lbl8;
	private JTextField textField_4;
	private JLabel lblX;
	private JLabel lblY;
	private JTextField textField_5;
	private JLabel lbl10;
	private JTextArea textArea;
	private JScrollPane scrollpane;
	private JLabel lbl9;
	private JTextField textField_6;
	private JLabel lbl_01;
	private JTextArea textArea_1;
	private JScrollPane scrollpane1;
	
	private JPanel panelParty;
	private JPanel panelReunion;
	private JPanel panelPlace1;
	private JPanel panelPlace2;
	private JPanel panelReminder;

	public AddEvent() 
	{
		setTitle("Agregar evento");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("Fecha:");
		lbl1.setBounds(21, 23, 46, 14);
		contentPane.add(lbl1);
		
		txtDd = new JTextField();
		txtDd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDd.setText("DD");
		txtDd.setBounds(63, 20, 46, 20);
		contentPane.add(txtDd);
		txtDd.setColumns(10);
		
		label = new JLabel("/");
		label.setBounds(112, 23, 18, 14);
		contentPane.add(label);
		
		txtMm = new JTextField();
		txtMm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMm.setText("MM");
		txtMm.setBounds(122, 20, 46, 20);
		contentPane.add(txtMm);
		txtMm.setColumns(10);
		
		label_1 = new JLabel("/");
		label_1.setBounds(175, 23, 18, 14);
		contentPane.add(label_1);
		
		txtYyyy = new JTextField();
		txtYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtYyyy.setText("YYYY");
		txtYyyy.setBounds(185, 20, 46, 20);
		contentPane.add(txtYyyy);
		txtYyyy.setColumns(10);
		
		lbl2 = new JLabel("(N\u00FAmeros enteros)");
		lbl2.setBounds(241, 23, 109, 14);
		contentPane.add(lbl2);
		
		btnAdd = new JButton("Agregar");
		btnAdd.setBounds(151, 563, 89, 23);
		contentPane.add(btnAdd);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"<Seleccione>", "Reuni\u00F3n", "Fiesta", "Recordatorio"}));
		comboBox.setBounds(131, 64, 100, 20);
		contentPane.add(comboBox);
		
		lbl3 = new JLabel("Tipo de evento:");
		lbl3.setBounds(21, 67, 88, 14);
		contentPane.add(lbl3);
		
		//inicio panelReunion
		panelReunion = new JPanel();
		panelReunion.setBorder(new TitledBorder(null, "Reuni\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelReunion.setBounds(21, 104, 346, 410);
		contentPane.add(panelReunion);
		panelReunion.setLayout(null);
		
		lbl4 = new JLabel("Invitados (Separados por comas)");
		lbl4.setBounds(10, 25, 211, 14);
		panelReunion.add(lbl4);
		
		textField = new JTextField();
		textField.setBounds(10, 46, 326, 20);
		panelReunion.add(textField);
		textField.setColumns(10);
		
		lbl5 = new JLabel("Vestimenta adecuada:");
		lbl5.setBounds(10, 69, 167, 14);
		panelReunion.add(lbl5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 94, 326, 20);
		panelReunion.add(textField_1);
		textField_1.setColumns(10);
		//fin panel
		
		//inicio panel place
		panelPlace1 = new JPanel();
		panelPlace1.setBorder(new TitledBorder(null, "Lugar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlace1.setBounds(10, 125, 326, 274);
		panelReunion.add(panelPlace1);
		panelPlace1.setLayout(null);
		
		lbl6 = new JLabel("Direcci\u00F3n:");
		lbl6.setBounds(10, 28, 61, 14);
		panelPlace1.add(lbl6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 25, 221, 20);
		panelPlace1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 56, 221, 20);
		panelPlace1.add(textField_3);
		textField_3.setColumns(10);
		
		lbl7 = new JLabel("Nombre:");
		lbl7.setBounds(10, 59, 61, 14);
		panelPlace1.add(lbl7);
		
		lbl8 = new JLabel("Cordenadas:");
		lbl8.setBounds(10, 84, 73, 14);
		panelPlace1.add(lbl8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 81, 44, 20);
		panelPlace1.add(textField_4);
		textField_4.setColumns(10);
		
		lblX = new JLabel("x:");
		lblX.setBounds(84, 84, 19, 14);
		panelPlace1.add(lblX);
		
		lblY = new JLabel("y:");
		lblY.setBounds(158, 84, 27, 14);
		panelPlace1.add(lblY);
		
		textField_5 = new JTextField();
		textField_5.setBounds(178, 81, 52, 20);
		panelPlace1.add(textField_5);
		textField_5.setColumns(10);
		
		lbl10 = new JLabel("Descripci\u00F3n: (Separelos por coma)");
		lbl10.setBounds(10, 109, 220, 14);
		panelPlace1.add(lbl10);
		
		textArea = new JTextArea();
		scrollpane = new JScrollPane(textArea);
		scrollpane.setBounds(10, 134, 306, 129);
		panelPlace1.add(scrollpane);
		
		lbl9 = new JLabel("(Enteros)");
		lbl9.setBounds(243, 87, 46, 14);
		panelPlace1.add(lbl9);
		//fin panelPlace1

		
		
		
		
		
		//inicio panelParty
		panelParty = new JPanel();
		panelParty.setBorder(new TitledBorder(null, "Fiesta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelParty.setBounds(21, 104, 346, 448);
		panelParty.setVisible(false);
		contentPane.add(panelParty);
		panelParty.setLayout(null);
		
		lbl4 = new JLabel("Invitados (Separados por comas)");
		lbl4.setBounds(10, 25, 167, 14);
		panelParty.add(lbl4);
		
		textField = new JTextField();
		textField.setBounds(10, 46, 326, 20);
		panelParty.add(textField);
		textField.setColumns(10);
		
		lbl5 = new JLabel("Vestimenta adecuada:");
		lbl5.setBounds(10, 69, 167, 14);
		panelParty.add(lbl5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 94, 326, 20);
		panelParty.add(textField_1);
		textField_1.setColumns(10);
		
		lbl_01 = new JLabel("Presupuesto destinado: (Entero)");
		lbl_01.setBounds(10, 125, 191, 14);
		panelParty.add(lbl_01);
		
		textField_6 = new JTextField();
		textField_6.setBounds(178, 125, 158, 20);
		panelParty.add(textField_6);
		textField_6.setColumns(10);
		//fin panelParty
		
		
		//inicio panelPlace2
		panelPlace2 = new JPanel();
		panelPlace2.setBorder(new TitledBorder(null, "Lugar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlace2.setBounds(10, 163, 326, 274);
		panelPlace2.setVisible(false);
		panelParty.add(panelPlace2);
		panelPlace2.setLayout(null);
		
		lbl6 = new JLabel("Direcci\u00F3n:");
		lbl6.setBounds(10, 28, 61, 14);
		panelPlace2.add(lbl6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 25, 221, 20);
		panelPlace2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 56, 221, 20);
		panelPlace2.add(textField_3);
		textField_3.setColumns(10);
		
		lbl7 = new JLabel("Nombre:");
		lbl7.setBounds(10, 59, 61, 14);
		panelPlace2.add(lbl7);
		
		lbl8 = new JLabel("Cordenadas:");
		lbl8.setBounds(10, 84, 73, 14);
		panelPlace2.add(lbl8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 81, 44, 20);
		panelPlace2.add(textField_4);
		textField_4.setColumns(10);
		
		lblX = new JLabel("x:");
		lblX.setBounds(84, 84, 19, 14);
		panelPlace2.add(lblX);
		
		lblY = new JLabel("y:");
		lblY.setBounds(158, 84, 27, 14);
		panelPlace2.add(lblY);
		
		textField_5 = new JTextField();
		textField_5.setBounds(178, 81, 52, 20);
		panelPlace2.add(textField_5);
		textField_5.setColumns(10);
		
		lbl10 = new JLabel("Descripci\u00F3n: (Separelos por coma)");
		lbl10.setBounds(10, 109, 175, 14);
		panelPlace2.add(lbl10);
		
		textArea = new JTextArea();
		scrollpane = new JScrollPane(textArea);
		scrollpane.setBounds(10, 134, 306, 129);
		panelPlace2.add(scrollpane);
		
		lbl9 = new JLabel("(Enteros)");
		lbl9.setBounds(243, 87, 46, 14);
		panelPlace2.add(lbl9);
		//fin panelPlace2
		
		
		
		//Inicio panelReminder
		panelReminder = new JPanel();
		panelReminder.setBorder(new TitledBorder(null, "Recordatorio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelReminder.setBounds(21, 111, 335, 438);
		panelReminder.setVisible(false);
		contentPane.add(panelReminder);
		panelReminder.setLayout(null);
		
		textArea_1 = new JTextArea();
		scrollpane1 = new JScrollPane(textArea_1);
		scrollpane1.setBounds(10, 24, 315, 403);
		panelReminder.add(scrollpane1);
		//Fin panelReminder
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

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
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

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public void setTextArea_1(JTextArea textArea_1) {
		this.textArea_1 = textArea_1;
	}

	public JPanel getPanelParty() {
		return panelParty;
	}

	public void setPanelParty(JPanel panelParty) {
		this.panelParty = panelParty;
	}

	public JPanel getPanelReunion() {
		return panelReunion;
	}

	public void setPanelReunion(JPanel panelReunion) {
		this.panelReunion = panelReunion;
	}

	public JPanel getPanelPlace1() {
		return panelPlace1;
	}

	public void setPanelPlace1(JPanel panelPlace1) {
		this.panelPlace1 = panelPlace1;
	}

	public JPanel getPanelPlace2() {
		return panelPlace2;
	}

	public void setPanelPlace2(JPanel panelPlace2) {
		this.panelPlace2 = panelPlace2;
	}

	public JPanel getPanelReminder() {
		return panelReminder;
	}

	public void setPanelReminder(JPanel panelReminder) {
		this.panelReminder = panelReminder;
	}
}