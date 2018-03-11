package expoComponents;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
public class ExpoJPasswordField extends JFrame
{
	private JLabel labelPasswordField;
	private JPasswordField examplePasswordField;
	
	public ExpoJPasswordField()
	{
		super("TextField Example 1.0");
		this.jTextFieldDefinition();
		this.setSize(400, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
	}
	private void jTextFieldDefinition() 
	{
		labelPasswordField = new JLabel("Hello i'm a PasswordField ->");
//		labelTextField.setBounds(x, y, width, height);
		labelPasswordField.setBounds(18, 23, 163, 14);
		
		examplePasswordField = new JPasswordField();
//		exampleTextField.setBounds(173, 20, 183, 20);
		examplePasswordField.setLocation(191, 20);
		examplePasswordField.setSize(183,20);
//		examplePasswordField.setEchoChar(%);
		
		getContentPane().setLayout(null);
		getContentPane().add(labelPasswordField);
		getContentPane().add(examplePasswordField);
	}
	
	public static void main(String[] args)
	{
		ExpoJPasswordField examplePassword = new ExpoJPasswordField();
	}

}
