package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator extends JFrame
{
	private Libreria obj = new Libreria();
	private JTextField textField;
	double acumulador = 0.0, captar;
	
	public Calculator() 
	{
		setTitle("Calculator POO V 1.0");
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 21, 214, 39);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("1"));
			}
		});
		button1.setBounds(10, 86, 46, 38);
		getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("2"));
			}
		});
		button2.setBounds(66, 86, 46, 38);
		getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("3"));
			}
		});
		button3.setBounds(122, 86, 46, 39);
		getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("4"));
			}
		});
		button4.setBounds(10, 135, 46, 39);
		getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("5"));
			}
		});
		button5.setBounds(66, 135, 46, 39);
		getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("6"));
			}
		});
		button6.setBounds(122, 135, 46, 39);
		getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("7"));
			}
		});
		button7.setBounds(10, 185, 46, 39);
		getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("8"));
			}
		});
		button8.setBounds(66, 185, 46, 39);
		getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("9"));
			}
		});
		button9.setBounds(122, 185, 46, 39);
		getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("0"));
			}
		});
		button0.setBounds(10, 235, 46, 39);
		getContentPane().add(button0);
		
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(obj.concatenamiento("."));
			}
		});
		buttonPoint.setBounds(66, 235, 46, 39);
		getContentPane().add(buttonPoint);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""+obj.resultado(textField.getText()));
			}
		});
		buttonEquals.setBounds(122, 235, 46, 38);
		getContentPane().add(buttonEquals);
		
		JButton buttonClear = new JButton("Limpiar");
		buttonClear.setBounds(10, 285, 214, 39);
		getContentPane().add(buttonClear);
		
		JButton buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.suma(textField.getText());
				textField.setText("");
			}
		});
		buttonSum.setBounds(178, 86, 46, 39);
		getContentPane().add(buttonSum);
		
		JButton buttonRest = new JButton("-");
		buttonRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.resta(textField.getText());
			}
		});
		buttonRest.setBounds(178, 135, 46, 39);
		getContentPane().add(buttonRest);
		
		JButton buttonMult = new JButton("x");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.multiplicacion(textField.getText());
			}
		});
		buttonMult.setBounds(178, 185, 46, 39);
		getContentPane().add(buttonMult);
		
		JButton buttonDivision = new JButton("/");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.division(textField.getText());
			}
		});
		buttonDivision.setBounds(178, 235, 46, 39);
		getContentPane().add(buttonDivision);
		
		setVisible(true);
		setSize(250,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		
	}
}
