package Components;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

public class TextAreaControl extends JFrame implements ActionListener
{
	JTextArea texto;
	
	public TextAreaControl()
	{
		super("Editor de textos");
		
		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("Serif",Font.BOLD,12));
		
		JButton button = new JButton("Abrir Archivo");
		button.setFont(new Font("Serif",Font.PLAIN,26));
		button.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER,scroll);
		c.add(BorderLayout.SOUTH,button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) 
	{
		new TextAreaControl();
	}


	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(this);
		File file = chooser.getSelectedFile();
		try
		{
			Path path = Paths.get(file.getAbsolutePath());
			System.out.println(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(path));
			texto.setText(retorno);
		}catch(Exception error)
		{
			JOptionPane.showMessageDialog(this,"No sonseguimos cerrrar su archivo");
		}
		
		
		
	}

}
