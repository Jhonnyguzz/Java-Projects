package com.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.data.Conexion;
import com.data.Data;

public class Teacher extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollpanel;
	private JLabel lblCurso_1;
	private JLabel lblNombre_1;
	private JLabel lblFecha;
	private JLabel lblEdad_1;
	private JLabel lblApellido_1;
	private JLabel lblDocumento_1;
	private JLabel lblGrado_1;
	private JLabel lblCategoria;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Teacher() {
		setResizable(false);
		setTitle("Bienvenid@ "+Data.name+" "+Data.lastName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 406);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tu informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 37, 273, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 27, 86, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 52, 86, 14);
		panel.add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 77, 86, 14);
		panel.add(lblDocumento);
		
		JLabel categoria = new JLabel("Categor\u00EDa:");
		categoria.setBounds(10, 102, 86, 14);
		panel.add(categoria);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 177, 86, 14);
		panel.add(lblEdad);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 202, 131, 14);
		panel.add(lblFechaDeNacimiento);
		
		JLabel lblGrado = new JLabel("Grado a cargo:");
		lblGrado.setBounds(10, 127, 86, 14);
		panel.add(lblGrado);
		
		JLabel lblCurso = new JLabel("Curso a cargo:");
		lblCurso.setBounds(10, 152, 86, 14);
		panel.add(lblCurso);
		
		lblNombre_1 = new JLabel("nombre");
		lblNombre_1.setBounds(106, 27, 157, 14);
		panel.add(lblNombre_1);
		
		lblApellido_1 = new JLabel("apellido");
		lblApellido_1.setBounds(106, 52, 157, 14);
		panel.add(lblApellido_1);
		
		lblDocumento_1 = new JLabel("documento");
		lblDocumento_1.setBounds(106, 77, 157, 14);
		panel.add(lblDocumento_1);
		
		lblCategoria = new JLabel("categoria");
		lblCategoria.setBounds(106, 102, 157, 14);
		panel.add(lblCategoria);
		
		lblGrado_1 = new JLabel("grado");
		lblGrado_1.setBounds(106, 127, 157, 14);
		panel.add(lblGrado_1);
		
		lblCurso_1 = new JLabel("curso");
		lblCurso_1.setBounds(106, 152, 157, 14);
		panel.add(lblCurso_1);
		
		lblEdad_1 = new JLabel("edad");
		lblEdad_1.setBounds(106, 177, 157, 14);
		panel.add(lblEdad_1);
		
		lblFecha = new JLabel("fecha");
		lblFecha.setBounds(129, 202, 134, 14);
		panel.add(lblFecha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Estudiantes activos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(293, 37, 420, 309);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(null,new String[]{"Documento","Nombre completo","Grado","Curso"}));
		scrollpanel = new JScrollPane(table);
		scrollpanel.setBounds(10, 23, 400, 196);
		panel_1.add(scrollpanel);
		
		JButton btnVerTodos = new JButton("Ver todos");
		btnVerTodos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				ArrayList<String> nombreArray = new ArrayList<String>(); 
				ArrayList<String> cursoArray = new ArrayList<String>();
				ArrayList<String> documentoArray = new ArrayList<String>();
				ArrayList<String> gradoArray = new ArrayList<String>();
				
				Statement st;
				ResultSet rs = null;
				String sql="select documentoid,primerNombre,segundoNombre,primerApellido,segundoApellido,grado,curso from estudiante";
				
				long documento=0;
				String nombre1="",nombre2="",apellido1="",apellido2="";
				int grado=0;
				String curso="";
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						documento=rs.getLong(1);
						nombre1=rs.getString(2);
						nombre2=rs.getString(3);
						apellido1=rs.getString(4);
						apellido2=rs.getString(5);
						grado=rs.getInt(6);
						curso=rs.getString(7);
						
						documentoArray.add(String.valueOf(documento));
						nombreArray.add(nombre1+" "+nombre2+" "+apellido1+" "+apellido2);
						gradoArray.add(String.valueOf(grado));
						cursoArray.add(curso);	
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Object filas[][] = new Object[][]{}; 
				String columnas[] = new String[]{"Documento","Nombre completo","Grado","Curso"};
				DefaultTableModel model = new DefaultTableModel(filas,columnas);
				table.setModel(model);
				
				Object tmp[] = new Object[4];
				
				for(int i=0;i<documentoArray.size();i++)
				{
					
					tmp[0]=documentoArray.get(i);
					tmp[1]=nombreArray.get(i);
					tmp[2]=gradoArray.get(i);
					tmp[3]=cursoArray.get(i);
							
					model.addRow(tmp);
				}
				
			}
		});
		btnVerTodos.setBounds(10, 254, 105, 23);
		panel_1.add(btnVerTodos);
		
		JButton btnVerMayores = new JButton("Ver mayores");
		btnVerMayores.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> nombreArray = new ArrayList<String>(); 
				ArrayList<String> cursoArray = new ArrayList<String>();
				ArrayList<String> documentoArray = new ArrayList<String>();
				ArrayList<String> gradoArray = new ArrayList<String>();
				
				Statement st;
				ResultSet rs = null;
				String sql="select documentoid,primerNombre,segundoNombre,primerApellido,segundoApellido,grado,curso from estudiante where edad>=18";
				
				long documento=0;
				String nombre1="",nombre2="",apellido1="",apellido2="";
				int grado=0;
				String curso="";
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						documento=rs.getLong(1);
						nombre1=rs.getString(2);
						nombre2=rs.getString(3);
						apellido1=rs.getString(4);
						apellido2=rs.getString(5);
						grado=rs.getInt(6);
						curso=rs.getString(7);
						
						documentoArray.add(String.valueOf(documento));
						nombreArray.add(nombre1+" "+nombre2+" "+apellido1+" "+apellido2);
						gradoArray.add(String.valueOf(grado));
						cursoArray.add(curso);	
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Object filas[][] = new Object[][]{}; 
				String columnas[] = new String[]{"Documento","Nombre completo","Grado","Curso"};
				DefaultTableModel model = new DefaultTableModel(filas,columnas);
				table.setModel(model);
				
				Object tmp[] = new Object[4];
				
				for(int i=0;i<documentoArray.size();i++)
				{
					
					tmp[0]=documentoArray.get(i);
					tmp[1]=nombreArray.get(i);
					tmp[2]=gradoArray.get(i);
					tmp[3]=cursoArray.get(i);
							
					model.addRow(tmp);
				}
			}
		});
		btnVerMayores.setBounds(125, 254, 112, 23);
		panel_1.add(btnVerMayores);
		
		JButton btnVerMenores = new JButton("Ver menores");
		btnVerMenores.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> nombreArray = new ArrayList<String>(); 
				ArrayList<String> cursoArray = new ArrayList<String>();
				ArrayList<String> documentoArray = new ArrayList<String>();
				ArrayList<String> gradoArray = new ArrayList<String>();
				
				Statement st;
				ResultSet rs = null;
				String sql="select documentoid,primerNombre,segundoNombre,primerApellido,segundoApellido,grado,curso from estudiante where edad<18";
				
				long documento=0;
				String nombre1="",nombre2="",apellido1="",apellido2="";
				int grado=0;
				String curso="";
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						documento=rs.getLong(1);
						nombre1=rs.getString(2);
						nombre2=rs.getString(3);
						apellido1=rs.getString(4);
						apellido2=rs.getString(5);
						grado=rs.getInt(6);
						curso=rs.getString(7);
						
						documentoArray.add(String.valueOf(documento));
						nombreArray.add(nombre1+" "+nombre2+" "+apellido1+" "+apellido2);
						gradoArray.add(String.valueOf(grado));
						cursoArray.add(curso);	
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Object filas[][] = new Object[][]{}; 
				String columnas[] = new String[]{"Documento","Nombre completo","Grado","Curso"};
				DefaultTableModel model = new DefaultTableModel(filas,columnas);
				table.setModel(model);
				
				Object tmp[] = new Object[4];
				
				for(int i=0;i<documentoArray.size();i++)
				{
					
					tmp[0]=documentoArray.get(i);
					tmp[1]=nombreArray.get(i);
					tmp[2]=gradoArray.get(i);
					tmp[3]=cursoArray.get(i);
							
					model.addRow(tmp);
				}
			}
		});
		btnVerMenores.setBounds(247, 254, 117, 23);
		panel_1.add(btnVerMenores);
		
	}
	public JLabel getLblCurso_1() {
		return lblCurso_1;
	}
	public JLabel getLblNombre_1() {
		return lblNombre_1;
	}
	public JLabel getLblFecha() {
		return lblFecha;
	}
	public JLabel getLblEdad_1() {
		return lblEdad_1;
	}
	public JLabel getLblApellido_1() {
		return lblApellido_1;
	}
	public JLabel getLblDocumento_1() {
		return lblDocumento_1;
	}
	public JLabel getLblGrado_1() {
		return lblGrado_1;
	}
	public JLabel getLblCategoria() {
		return lblCategoria;
	}
}
