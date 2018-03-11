package com.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.data.Conexion;
import com.data.Data;

public class Student extends JFrame {

	private JPanel contentPane;
	private JLabel nombre;
	private JLabel nombre2;
	private JLabel apellido1;
	private JLabel apellido2;
	private JLabel documento;
	private JLabel telefono;
	private JLabel direccion;
	private JLabel edad;
	private JLabel fechan;
	private JLabel grado;
	private JLabel curso;
	private JLabel nota1;
	private JLabel nota2;
	private JLabel nota3;
	private JLabel nota4;
	private JLabel profesor;
	private JLabel horas;
	private JComboBox comboBox;
	private JTextArea observacion1;
	private JTextArea observacion2;
	private JTextArea observacion3;
	private JTextArea observacion4;
	private JScrollPane scroll1;
	private JScrollPane scroll2;
	private JScrollPane scroll3;
	private JScrollPane scroll4;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Student() {
		setResizable(false);
		setTitle("Bienvenid@ "+Data.name+" "+Data.lastName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tu informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 58, 273, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 27, 86, 14);
		panel.add(lblNombre);
		
		JLabel lblSegundoNombre = new JLabel("Segundo Nombre:");
		lblSegundoNombre.setBounds(10, 52, 117, 14);
		panel.add(lblSegundoNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 77, 86, 14);
		panel.add(lblApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setBounds(10, 102, 105, 14);
		panel.add(lblSegundoApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 127, 86, 14);
		panel.add(lblDocumento);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(10, 152, 86, 14);
		panel.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(10, 177, 86, 14);
		panel.add(lblDireccin);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 202, 86, 14);
		panel.add(lblEdad);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 227, 117, 14);
		panel.add(lblFechaDeNacimiento);
		
		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(10, 252, 86, 14);
		panel.add(lblGrado);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 277, 86, 14);
		panel.add(lblCurso);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Update frame = new Update();
				frame.setVisible(true);
			}
		});
		btnModificar.setBounds(87, 343, 89, 23);
		panel.add(btnModificar);
		
		nombre = new JLabel("nombre");
		nombre.setBounds(117, 27, 146, 14);
		panel.add(nombre);
		
		nombre2 = new JLabel("nombre2");
		nombre2.setBounds(117, 52, 146, 14);
		panel.add(nombre2);
		
		apellido1 = new JLabel("apellido1");
		apellido1.setBounds(117, 77, 146, 14);
		panel.add(apellido1);
		
		apellido2 = new JLabel("apellido2");
		apellido2.setBounds(116, 102, 147, 14);
		panel.add(apellido2);
		
		documento = new JLabel("documento");
		documento.setBounds(117, 127, 146, 14);
		panel.add(documento);
		
		telefono = new JLabel("telefono");
		telefono.setBounds(117, 152, 146, 14);
		panel.add(telefono);
		
		direccion = new JLabel("direccion");
		direccion.setBounds(117, 177, 146, 14);
		panel.add(direccion);
		
		edad = new JLabel("edad");
		edad.setBounds(117, 202, 146, 14);
		panel.add(edad);
		
		fechan = new JLabel("fechan");
		fechan.setBounds(117, 227, 146, 14);
		panel.add(fechan);
		
		grado = new JLabel("grado");
		grado.setBounds(117, 252, 46, 14);
		panel.add(grado);
		
		curso = new JLabel("curso");
		curso.setBounds(117, 277, 46, 14);
		panel.add(curso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Informes y notas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(293, 58, 410, 443);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--- Seleccione una opci\u00F3n ---", "C\u00E1lculo", "Espa\u00F1ol", "Filosof\u00EDa", "Qu\u00EDmica", "F\u00EDsica", "Ingl\u00E9s", "Religi\u00F3n", "Educaci\u00F3n F\u00EDsica", "Inform\u00E1tica", "Artes"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(10, 32, 98, 20);
		panel_1.add(comboBox);
		
		JLabel lblDesempeo = new JLabel("Bimestre 1");
		lblDesempeo.setBounds(10, 81, 77, 14);
		panel_1.add(lblDesempeo);
		
		JLabel lblNewLabel = new JLabel("Desempe\u00F1o:");
		lblNewLabel.setBounds(10, 106, 77, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblObservacin = new JLabel("Observaci\u00F3n:");
		lblObservacin.setBounds(10, 128, 77, 14);
		panel_1.add(lblObservacin);
		
		JLabel lblBimestre = new JLabel("Bimestre 2");
		lblBimestre.setBounds(220, 81, 77, 14);
		panel_1.add(lblBimestre);
		
		JLabel lblDesempeo_1 = new JLabel("Desempe\u00F1o:");
		lblDesempeo_1.setBounds(220, 106, 77, 14);
		panel_1.add(lblDesempeo_1);
		
		JLabel lblObservacin_1 = new JLabel("Observaci\u00F3n:");
		lblObservacin_1.setBounds(220, 128, 77, 14);
		panel_1.add(lblObservacin_1);
		
		JLabel lblBimestre_1 = new JLabel("Bimestre 3");
		lblBimestre_1.setBounds(10, 237, 77, 14);
		panel_1.add(lblBimestre_1);
		
		JLabel lblBimestre_2 = new JLabel("Bimestre 4");
		lblBimestre_2.setBounds(220, 237, 77, 14);
		panel_1.add(lblBimestre_2);
		
		JLabel lblDesempeo_2 = new JLabel("Desempe\u00F1o:");
		lblDesempeo_2.setBounds(10, 262, 77, 14);
		panel_1.add(lblDesempeo_2);
		
		JLabel lblObservacin_2 = new JLabel("Observaci\u00F3n:");
		lblObservacin_2.setBounds(10, 287, 77, 14);
		panel_1.add(lblObservacin_2);
		
		JLabel lblDesempeo_3 = new JLabel("Desempe\u00F1o:");
		lblDesempeo_3.setBounds(220, 262, 77, 14);
		panel_1.add(lblDesempeo_3);
		
		JLabel lblObservacin_3 = new JLabel("Observaci\u00F3n:");
		lblObservacin_3.setBounds(220, 287, 77, 14);
		panel_1.add(lblObservacin_3);
		
		JButton btnVerLogros = new JButton("Ver logros");
		btnVerLogros.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Statement st;
				ResultSet rs = null;
				String sql="select indicadorUno,indicadorDos,nombreLogro from logro where idAsignatura="+comboBox.getSelectedIndex();
				
				String logro="",indicador1="",indicador2="";
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						indicador1=rs.getString(1);
						indicador2=rs.getString(2);
						logro=rs.getString(3);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				Goals frame = new Goals();
				frame.getLogro().setText(logro);
				frame.getIndicador1().setText(indicador1);
				frame.getIndicador2().setText(indicador2);	
				frame.setVisible(true);

			}
		});
		btnVerLogros.setBounds(187, 31, 98, 23);
		panel_1.add(btnVerLogros);
		
		JLabel lblProfesorACargo = new JLabel("Profesor a cargo:");
		lblProfesorACargo.setBounds(10, 380, 143, 14);
		panel_1.add(lblProfesorACargo);
		
		JLabel lblHorasDeClase = new JLabel("Horas de clase en el bimestre:");
		lblHorasDeClase.setBounds(10, 405, 186, 14);
		panel_1.add(lblHorasDeClase);
		
		JButton btnVerFallas = new JButton("Ver Fallas");
		btnVerFallas.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Statement st;
				ResultSet rs = null;
				String sql="select fechaRetardo,idAsignatura from retardos where codigoEstudiante="+Data.id;
				
				ArrayList<String> fechasRetardos = new ArrayList<String>();
				ArrayList<Integer> idAsignaturas = new ArrayList<Integer>();
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						fechasRetardos.add(rs.getString(1));
						idAsignaturas.add(rs.getInt(2));
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Fallas frame = new Fallas();
				
				Object filas[][] = new Object[][]{}; 
				String columnas[] = new String[]{"IdAsignatura","Nombre Asignatura","Fecha"};
				DefaultTableModel model = new DefaultTableModel(filas,columnas);
				frame.getTable().setModel(model);
				
				Object tmp[] = new Object[3];
				
				for(int i=0;i<fechasRetardos.size();i++)
				{
					tmp[0]=idAsignaturas.get(i);
					if(idAsignaturas.get(i)==1)
					{
						tmp[1]="Cálculo";
					}
					if(idAsignaturas.get(i)==2)
					{
						tmp[1]="Español";
					}
					if(idAsignaturas.get(i)==3)
					{
						tmp[1]="Filosofía";
					}
					if(idAsignaturas.get(i)==4)
					{
						tmp[1]="Química";
					}
					if(idAsignaturas.get(i)==5)
					{
						tmp[1]="Física";
					}
					if(idAsignaturas.get(i)==6)
					{
						tmp[1]="Inglés";
					}
					if(idAsignaturas.get(i)==7)
					{
						tmp[1]="Religión";
					}
					if(idAsignaturas.get(i)==8)
					{
						tmp[1]="Educación Física";
					}
					if(idAsignaturas.get(i)==9)
					{
						tmp[1]="Informática";
					}
					if(idAsignaturas.get(i)==10)
					{
						tmp[1]="Artes";
					}
					tmp[2]=fechasRetardos.get(i);
					
				
					model.addRow(tmp); // pilas, añadir arreglo de Object unidimensional, no bidimensional
				}
				frame.setVisible(true);
			}
		});
		btnVerFallas.setBounds(295, 31, 105, 23);
		panel_1.add(btnVerFallas);
		
		nota1 = new JLabel("");
		nota1.setBounds(99, 106, 97, 14);
		panel_1.add(nota1);
		
		nota2 = new JLabel("");
		nota2.setBounds(303, 106, 97, 14);
		panel_1.add(nota2);
		
		nota3 = new JLabel("");
		nota3.setBounds(99, 262, 97, 14);
		panel_1.add(nota3);
		
		nota4 = new JLabel("");
		nota4.setBounds(311, 262, 77, 14);
		panel_1.add(nota4);
		
		profesor = new JLabel("");
		profesor.setBounds(199, 380, 201, 14);
		panel_1.add(profesor);
		
		horas = new JLabel("");
		horas.setBounds(202, 405, 83, 14);
		panel_1.add(horas);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Data.index=comboBox.getSelectedIndex();
				int materia=comboBox.getSelectedIndex();
				
				Statement st;
				ResultSet rs = null;
				String sql="select * from calificaciones where idEstudiante="+Data.id+" and idAsignatura="+materia;
				
				String[] nota = new String[4];
				String[] observacion = new String[4];
				int idProfesor = 0;
				int i=0;

				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						nota[i]=rs.getString(2);
						observacion[i]=rs.getString(3);
						idProfesor=rs.getInt(6);
						i++;
						
						if(i==4)
						{
							//Este if es porque me está arrojando excepcion este
							//ciclo y no se por qué, asi que lo protejo y luego miro
							//que está pasando, algun día lo haré...
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				sql = "select nombreProfesor, apellido from profesor where idProfesor="+idProfesor;
				String nombre="",apellido="";
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						nombre=rs.getString(1);
						apellido=rs.getString(2);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				nota1.setText(nota[0]);
				nota2.setText(nota[1]);
				nota3.setText(nota[2]);
				nota4.setText(nota[3]);
				observacion1.setText(observacion[0]);
				observacion2.setText(observacion[1]);
				observacion3.setText(observacion[2]);
				observacion4.setText(observacion[3]);
				
				profesor.setText(nombre+" "+apellido);
				
				sql = "select horasClaseBimestre from asignatura where idProfesor="+idProfesor;
				int horasClase=0;
				
				try {
					st = Conexion.getConexion().createStatement();
					rs=st.executeQuery(sql);
					
					while(rs.next())
					{
						horasClase=rs.getInt(1);;
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				horas.setText(String.valueOf(horasClase));
			}
		});
		btnBuscar.setBounds(118, 31, 59, 23);
		panel_1.add(btnBuscar);
		
		observacion1 = new JTextArea();
		observacion1.setEditable(false);
		scroll1 = new JScrollPane(observacion1);
		scroll1.setBounds(10, 144, 186, 82);
		panel_1.add(scroll1);
		
		observacion2 = new JTextArea();
		observacion2.setEditable(false);
		scroll2 = new JScrollPane(observacion2);
		scroll2.setBounds(220, 144, 180, 82);
		panel_1.add(scroll2);
		
		observacion3 = new JTextArea();
		observacion3.setEditable(false);
		scroll3 = new JScrollPane(observacion3);
		scroll3.setBounds(10, 303, 186, 66);
		panel_1.add(scroll3);
		
		observacion4 = new JTextArea();
		observacion4.setEditable(false);
		scroll4 = new JScrollPane(observacion4);
		scroll4.setBounds(220, 303, 180, 66);
		panel_1.add(scroll4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 713, 21);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmSalir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
			}
		});
		mnArchivo.add(mntmSalir);
	}
	
	public JLabel getNombre() {
		return nombre;
	}
	public JLabel getNombre2() {
		return nombre2;
	}

	public JLabel getApellido1() {
		return apellido1;
	}

	public JLabel getApellido2() {
		return apellido2;
	}

	public JLabel getDocumento() {
		return documento;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public JLabel getEdad() {
		return edad;
	}

	public JLabel getFechan() {
		return fechan;
	}

	public JLabel getGrado() {
		return grado;
	}

	public JLabel getCurso() {
		return curso;
	}

	public JLabel getNota1() {
		return nota1;
	}

	public JLabel getNota2() {
		return nota2;
	}

	public JLabel getNota3() {
		return nota3;
	}

	public JLabel getNota4() {
		return nota4;
	}

	public JTextArea getObservacion1() {
		return observacion1;
	}

	public JTextArea getObservacion2() {
		return observacion2;
	}

	public JTextArea getObservacion3() {
		return observacion3;
	}

	public JTextArea getObservacion4() {
		return observacion4;
	}

	public JLabel getProfesor() {
		return profesor;
	}

	public JLabel getHoras() {
		return horas;
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
}
