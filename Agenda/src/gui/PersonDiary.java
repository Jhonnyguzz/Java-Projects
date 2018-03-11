package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PersonDiary extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSaveChanges;
	private JMenuItem mntmLogOut;
	private JLabel lbl1;
	private JLabel lblUsername;
	private JLabel lbl2;
	private JLabel label;
	private JLabel lbl3;
	private JTable table;
	private JScrollPane scrollpane;
	private JLabel lbl4;
	private JTable table_1;
	private JScrollPane scrollpane_1;
	private JTextArea textArea;
	private JScrollPane scrollpane_2;
	private JButton btnSave;
	private JButton btnAddDiary;
	private JButton btnAddEvent;
	private JButton btnDel;
	private JButton btnDel_1;

	public PersonDiary() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 473);
		setTitle("Username");
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
		
		mntmSaveChanges = new JMenuItem("Guardar cambios");
		mnFile.add(mntmSaveChanges);
		
		mntmLogOut = new JMenuItem("Cerrar sesi\u00F3n");
		mnFile.add(mntmLogOut);
		
		lbl1 = new JLabel("Hola");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(21, 27, 55, 25);
		contentPane.add(lbl1);
		
		lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(71, 27, 182, 23);
		contentPane.add(lblUsername);
		
		lbl2 = new JLabel("Tus agendas:");
		lbl2.setBounds(21, 71, 78, 14);
		contentPane.add(lbl2);
		
		label = new JLabel("0");
		label.setBounds(109, 71, 27, 14);
		contentPane.add(label);
		
		lbl3 = new JLabel("en total");
		lbl3.setBounds(131, 71, 46, 14);
		contentPane.add(lbl3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Agendas","Descripción"}));
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(21, 97, 276, 90);
		contentPane.add(scrollpane);
		
		lbl4 = new JLabel("Eventos en esta agenda:");
		lbl4.setBounds(21, 253, 153, 14);
		contentPane.add(lbl4);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(null,new String[]{"Eventos"}));
		scrollpane_1 = new JScrollPane(table_1);
		scrollpane_1.setBounds(21, 278, 276, 125);
		contentPane.add(scrollpane_1);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollpane_2 = new JScrollPane(textArea);
		scrollpane_2.setBounds(315, 97, 335, 248);
		contentPane.add(scrollpane_2);
		
		btnSave = new JButton("Guardar");
		btnSave.setBounds(315, 380, 89, 23);
		contentPane.add(btnSave);
		
		btnAddDiary = new JButton("Add");
		btnAddDiary.setBounds(173, 67, 58, 23);
		contentPane.add(btnAddDiary);
		
		btnAddEvent = new JButton("Add");
		btnAddEvent.setBounds(166, 249, 65, 23);
		contentPane.add(btnAddEvent);
		
		btnDel = new JButton("Del");
		btnDel.setBounds(239, 67, 58, 23);
		contentPane.add(btnDel);
		
		btnDel_1 = new JButton("Del");
		btnDel_1.setBounds(236, 249, 55, 23);
		contentPane.add(btnDel_1);
	}

	public JMenuItem getMntmLogOut() {
		return mntmLogOut;
	}

	public void setMntmLogOut(JMenuItem mntmLogOut) {
		this.mntmLogOut = mntmLogOut;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JButton getBtnAddDiary() {
		return btnAddDiary;
	}

	public void setBtnAddDiary(JButton btnAddDiary) {
		this.btnAddDiary = btnAddDiary;
	}

	public JButton getBtnAddEvent() {
		return btnAddEvent;
	}

	public void setBtnAddEvent(JButton btnAddEvent) {
		this.btnAddEvent = btnAddEvent;
	}

	public JMenuItem getMntmSaveChanges() {
		return mntmSaveChanges;
	}

	public void setMntmSaveChanges(JMenuItem mntmSaveChanges) {
		this.mntmSaveChanges = mntmSaveChanges;
	}

	public JButton getBtnDel() {
		return btnDel;
	}

	public void setBtnDel(JButton btnDel) {
		this.btnDel = btnDel;
	}

	public JButton getBtnDel_1() {
		return btnDel_1;
	}

	public void setBtnDel_1(JButton btnDel_1) {
		this.btnDel_1 = btnDel_1;
	}
}
