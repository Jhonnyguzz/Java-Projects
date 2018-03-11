import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class EjemploJTable
{
	public static void main(String[] args)
	{
		NuevaVentana ventana=new NuevaVentana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setResizable(false);
		
	}
}
class NuevaVentana extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NuevaVentana()
	{
		setTitle("Prueba Tabla");
		setSize(ancho,largo);
		NuevoPanel lamina=new NuevoPanel();
		add(lamina);
			
	}
	public static final int ancho=270;
	public static final int largo=340;
}
class NuevoPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lb1=new JLabel("Ingresar Nombre");
	JTextField txtNombre=new JTextField();
	JLabel lb2=new JLabel("Ingresar Apellido");
	JTextField txtApellido=new JTextField();
	JLabel lb3=new JLabel("Ingresar Edad");
	JTextField txtEdad=new JTextField();
	JButton btnAgregar=new JButton("Agregar");
	JButton btnLimpiar=new JButton("Limpiar");
	DefaultTableModel modelo=new DefaultTableModel();
	{
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("edad");
	
	}
	JTable tabla=new JTable(modelo);
	JScrollPane scroll=new JScrollPane(tabla);
	public NuevoPanel()
	{
		setLayout(null);
		add(lb1);
		lb1.setBounds(10,20,100,20);
		add(txtNombre);
		txtNombre.setBounds(120,20,120,20);
		add(lb2);
		lb2.setBounds(10,50,100,20);
		add(txtApellido);
		txtApellido.setBounds(120,50,120,20);
		add(lb3);
		lb3.setBounds(10,80,100,20);
		add(txtEdad);
		txtEdad.setBounds(120,80,120,20);
		add(scroll);
		scroll.setBounds(10,110,240,140);
		add(btnAgregar);
		btnAgregar.setBounds(20,280,100,20);
		add(btnLimpiar);
		btnLimpiar.setBounds(130,280,100,20);
		
		NuevaEscucha oyente=new NuevaEscucha();
		btnAgregar.addActionListener(oyente);
		NuevaEscucha1 oyente1=new NuevaEscucha1();
		btnLimpiar.addActionListener(oyente1);
	}
	class NuevaEscucha implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object [] fila = new Object[3];
			String nom=txtNombre.getText();
			String ape=txtApellido.getText();
			int ed=Integer.parseInt(txtEdad.getText());
			fila[0] = nom;
			fila[1] = ape;
			fila[2]	= ed;
			modelo.addRow ( fila );
			
		}
	}
	class NuevaEscucha1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			txtNombre.setText("");
			txtApellido.setText("");
			txtEdad.setText("");
			
		}	
	}
}