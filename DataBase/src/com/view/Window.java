package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.data.Conexion;
import com.data.Data;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Window extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField password;
	private JButton btnIngresar;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	public Window() 
	{
		setResizable(false);
		setTitle("IPARM - Base de datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 277);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Data.option=2;
			}
		});
		buttonGroup.add(rdbtnProfesor);
		rdbtnProfesor.setBounds(236, 137, 109, 23);
		contentPane.add(rdbtnProfesor);
		
		usuario = new JTextField();
		usuario.setBounds(145, 65, 198, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(Data.option==1)
				{
					String id = usuario.getText();
					String user = usuario.getText();
					String pass = new String(password.getPassword());
				
					Data.id=id;
					Data.user=user;
					Data.pass=pass;
				
					Conexion cn = new Conexion("root",pass); //pass 1234
					boolean x=cn.makeConexion();
					if(x==true)
					{
						Statement st;
						ResultSet rs = null;
						String sql="select * from estudiante where codigoEstudiante="+id;
					
						long documentoid = 0;
						String primerNombre = null;
						String segundoNombre = null;
						String primerApellido = null;
						String segundoApellido = null;
						long telefono = 0;
						String direccion = null;
						int edad = 0;
						String fechaNacimiento = null;
						int grado = 0;
						String curso= null;
		
						try {
							st = Conexion.getConexion().createStatement();
							rs=st.executeQuery(sql);
						
							while(rs.next())
							{
								documentoid=rs.getLong(2);
								primerNombre=rs.getString(3);
								Data.name=rs.getString(3);
								segundoNombre=rs.getString(4);
								primerApellido=rs.getString(5);
								Data.lastName=rs.getString(5);
								segundoApellido=rs.getString(6);
								telefono=rs.getLong(7);
								direccion=rs.getString(8);
								edad=rs.getInt(9);
								fechaNacimiento=rs.getString(10);
								grado=rs.getInt(11);
								curso=rs.getString(12);
							}
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						//inicio del segundo Jframe
					
						Student frame = new Student();
						frame.getNombre().setText(primerNombre);
						frame.getNombre2().setText(segundoNombre);
						frame.getApellido1().setText(primerApellido);
						frame.getApellido2().setText(segundoApellido);
						frame.getDocumento().setText(String.valueOf(documentoid));
						frame.getTelefono().setText(String.valueOf(telefono));
						frame.getDireccion().setText(direccion);
						frame.getEdad().setText(String.valueOf(edad));
						frame.getFechan().setText(fechaNacimiento);
						frame.getGrado().setText(String.valueOf(grado));
						frame.getCurso().setText(curso);
						frame.setVisible(true);

					}
					else
					{
						JOptionPane.showMessageDialog(null,"El usuario o la contraseña son incorrectos", "Alerta", 1);
					}
				}
				if(Data.option==2)
				{
					String id = usuario.getText();
					String user = usuario.getText();
					String pass = new String(password.getPassword());
				
					Data.id=id;
					Data.user=user;
					Data.pass=pass;
				
					Conexion cn = new Conexion("root",pass); //pass 1234
					boolean x=cn.makeConexion();
					if(x==true)
					{
						Statement st;
						ResultSet rs = null;
						String sql="select * from profesor where idProfesor="+id;
						
						long documento=0;
						String nombreProfesor="";
						String apellido="";
						String categoria="";
						int grado=0;
						String curso="";
						int edad=0;
						String fechaNacimiento="";
						
						try {
							st = Conexion.getConexion().createStatement();
							rs=st.executeQuery(sql);
						
							while(rs.next())
							{
								documento=rs.getLong(2);
								nombreProfesor=rs.getString(3);
								Data.name=rs.getString(3);
								apellido=rs.getString(4);
								Data.lastName=rs.getString(4);
								categoria=rs.getString(5);
								grado=rs.getInt(6);
								curso=rs.getString(7);
								edad=rs.getInt(8);
								fechaNacimiento=rs.getString(9);
							}
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						Teacher frame = new Teacher();
						frame.getLblCurso_1().setText(curso);
						frame.getLblNombre_1().setText(nombreProfesor);
						frame.getLblFecha().setText(fechaNacimiento);
						frame.getLblEdad_1().setText(String.valueOf(edad));
						frame.getLblApellido_1().setText(apellido);
						frame.getLblDocumento_1().setText(String.valueOf(documento));
						frame.getLblGrado_1().setText(String.valueOf(grado));
						frame.getLblCategoria().setText(categoria);				
						frame.setVisible(true);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"El usuario o la contraseña son incorrectos", "Alerta", 1);
					}
				}
			}	
				
		});
		btnIngresar.setBounds(182, 179, 84, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblUsuario = new JLabel("ID Usuario");
		lblUsuario.setBounds(51, 68, 84, 14);
		contentPane.add(lblUsuario);
		
		password = new JPasswordField();
		password.setBounds(145, 96, 198, 20);
		contentPane.add(password);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(51, 99, 100, 14);
		contentPane.add(lblContrasea);
		
		JRadioButton rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setSelected(true);
		rdbtnAlumno.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Data.option=1;
			}
		});
		buttonGroup.add(rdbtnAlumno);
		rdbtnAlumno.setBounds(145, 137, 89, 23);
		contentPane.add(rdbtnAlumno);
	}
	public JButton getBtnIngresar() {
		return btnIngresar;
	}
}
