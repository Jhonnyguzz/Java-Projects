package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AddDiary extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField textField;
	private JLabel lbl2;
	private JTextArea textArea;
	private JButton btnAdd;
	
	public AddDiary() 
	{
		setResizable(false);
		setTitle("Agregar agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 284);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("Nombre:");
		lbl1.setBounds(25, 25, 46, 14);
		contentPane.add(lbl1);
		
		textField = new JTextField();
		textField.setBounds(101, 22, 219, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lbl2 = new JLabel("Descripci\u00F3n:");
		lbl2.setBounds(25, 63, 76, 14);
		contentPane.add(lbl2);
		
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(101, 58, 219, 137);
		contentPane.add(scrollPane);
		
		btnAdd = new JButton("Agregar");
		btnAdd.setBounds(163, 206, 89, 23);
		contentPane.add(btnAdd);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
}
