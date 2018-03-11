import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollpanel;

	public Tabla() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Nombre","Edad","Id"}));
		scrollpanel = new JScrollPane(table);
		contentPane.add(scrollpanel);
	}
	public JTable getTable() 
	{
		return table;
	}
}
