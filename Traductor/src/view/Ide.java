package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import model.JavaLexer;
import model.JavaListenerApp;
import model.JavaParser;

public class Ide extends JFrame {

	/**
	 * 
	 */

	private String nameFileJava; // variable para controlar el acceso al archivo
									// Java
									// Y proceder a usar los listeners
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmGuardarComo;
	private JMenuItem mntmNuevo;
	private JMenuItem mntmGuardar;
	private JMenuItem mntmSalir;
	private JMenu mnEditar;
	private JMenuItem mntmDeshacer;
	private JMenuItem mntmRehacer;
	private JSeparator separator;
	private JMenuItem mntmCortar;
	private JMenuItem mntmCopiar;
	private JMenuItem mntmPegar;
	private JSeparator separator_1;
	private JMenuItem mntmEliminar;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JMenuItem mntmCerrar;
	private JSeparator separator_4;
	private JMenu mnProyecto;
	private JMenuItem mntmRevisar;
	private JMenuItem mntmTraducir;
	private JMenuItem mntmEjecutar;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDe;
	private JTextArea textAreaJava;
	private JTextArea textAreaPython;
	private JButton btnRevisar;
	private JButton btnTraducir;
	private JButton btnEjecutar;
	private JMenu mnArchivo;
	private JScrollPane scroll1;
	private JScrollPane scroll2;
	private JLabel lblArchivoJava;
	private JLabel lblArchivoPython;
	private JFileChooser getJava;
	private JLabel lblLinea;
	private JSeparator separator_5;
	private JCheckBoxMenuItem verRegla;
	private JLabel lblLinea2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ide frame = new Ide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ide() {
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Traductor UN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 550);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);

		mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> tmp = getJavaFile();
				
				textAreaJava.setText("");
				lblLinea.setText("<html>1</html>");
				// llamar funcion chooser
				for (String element : tmp) {
					// textAreaJava.setText(element);
					textAreaJava.append(element + "\n");
				}
				colorear(textAreaJava,"public");

			}
		});
		mnArchivo.add(mntmAbrir);

		separator_2 = new JSeparator();
		mnArchivo.add(separator_2);

		mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);

		separator_4 = new JSeparator();
		mnArchivo.add(separator_4);

		mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);

		mntmGuardarComo = new JMenuItem("Guardar como");
		mnArchivo.add(mntmGuardarComo);

		separator_3 = new JSeparator();
		mnArchivo.add(separator_3);

		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);

		mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		mntmDeshacer = new JMenuItem("Deshacer");
		mntmDeshacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaJava.setText("");
			}
		});
		mnEditar.add(mntmDeshacer);

		mntmRehacer = new JMenuItem("Rehacer");
		mnEditar.add(mntmRehacer);

		separator = new JSeparator();
		mnEditar.add(separator);

		mntmCortar = new JMenuItem("Cortar");
		mnEditar.add(mntmCortar);

		mntmCopiar = new JMenuItem("Copiar");
		mnEditar.add(mntmCopiar);

		mntmPegar = new JMenuItem("Pegar");
		mnEditar.add(mntmPegar);

		separator_1 = new JSeparator();
		mnEditar.add(separator_1);

		mntmEliminar = new JMenuItem("Eliminar");
		mnEditar.add(mntmEliminar);

		mnProyecto = new JMenu("Proyecto");
		menuBar.add(mnProyecto);

		mntmRevisar = new JMenuItem("Revisar");
		mnProyecto.add(mntmRevisar);

		mntmTraducir = new JMenuItem("Traducir");
		mnProyecto.add(mntmTraducir);

		mntmEjecutar = new JMenuItem("Ejecutar");
		mnProyecto.add(mntmEjecutar);
		
		separator_5 = new JSeparator();
		mnProyecto.add(separator_5);
		
		verRegla = new JCheckBoxMenuItem("Regla");
		verRegla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(verRegla.isSelected())
				{
					lblLinea.setVisible(true);
					lblLinea2.setVisible(true);
				}
				else
				{
					lblLinea.setVisible(false);
					lblLinea2.setVisible(false);
				}
			}
		});
		verRegla.setSelected(true);
		mnProyecto.add(verRegla);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAcercaDe = new JMenuItem("Acerca de");
		mnAyuda.add(mntmAcercaDe);

		textAreaJava = new JTextArea();
		textAreaJava.setForeground(new Color(0, 0, 0));
		textAreaJava.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				JTextArea editArea = (JTextArea) e.getSource();
	
				String tmp="";
				for (int i = 1; i <= editArea.getLineCount(); i++) 
				{
					tmp += String.valueOf(i)+"<br>";
				}
				lblLinea.setText("<html>" + tmp + "</html>");
			}
		});
		textAreaJava.setTabSize(4);
		textAreaJava.setFont(new Font("Consolas", Font.PLAIN, 13));
		scroll1 = new JScrollPane(textAreaJava);
		scroll1.setBounds(21, 70, 425, 335);
		contentPane.add(scroll1);

		lblLinea = new JLabel("<html>1</html>");
		lblLinea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLinea.setVerticalAlignment(SwingConstants.TOP);
		scroll1.setRowHeaderView(lblLinea);

		textAreaPython = new JTextArea();
		textAreaPython.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				JTextArea editArea = (JTextArea) e.getSource();
	
				String tmp="";
				for (int i = 1; i <= editArea.getLineCount(); i++) 
				{
					tmp += String.valueOf(i)+"<br>";
				}
				lblLinea2.setText("<html>" + tmp + "</html>");	
			}
		});
		textAreaPython.setTabSize(4);
		textAreaPython.setFont(new Font("Consolas", Font.PLAIN, 13));
		scroll2 = new JScrollPane(textAreaPython);
		scroll2.setBounds(553, 70, 434, 335);
		contentPane.add(scroll2);
		
		lblLinea2 = new JLabel("<html>1</html>");
		lblLinea2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLinea2.setVerticalAlignment(SwingConstants.TOP);
		scroll2.setRowHeaderView(lblLinea2);

		btnRevisar = new JButton("Revisar");
		btnRevisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANTLRInputStream input = null;
				try {
					input = new ANTLRFileStream(nameFileJava);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JavaLexer lexer = new JavaLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				JavaParser parser = new JavaParser(tokens);
				ParseTree tree = parser.compilationUnit();
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk(new JavaListenerApp(), tree);
			}
		});
		btnRevisar.setBounds(456, 130, 89, 23);
		contentPane.add(btnRevisar);

		btnTraducir = new JButton("Traducir");
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * por el momento el archivo ya está traducido al darle en
				 * revisar, así que lo que hace por el momento es abrir el
				 * archivo ya traducido y ponerlo en el JtextArea aunque no es
				 * la idea
				 */

				textAreaPython.setText("");
				mostrarTraduccion();

			}
		});
		btnTraducir.setBounds(456, 197, 89, 23);
		contentPane.add(btnTraducir);

		btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ejecutar archivo python, por defecto siempre se llama
				// toPython.py
				try {
					// String [] cmd = {"python","toPython.py"}; //Asegurarse de
					// tener configurado
					// el path en la máquina y python instalado
					// Process p;
					Runtime.getRuntime().exec("cmd.exe /c start cmd /k python toPython.py");
					// http://foro.elhacker.net/java/iquestcomo_abrir_ventana_tipo_consola_sin_necesidad_de_poner_java_jar-t360379.0.html
					// http://notodojava.tredoo.com/ejecutar-comando-mediante-cmd-run-command-using-cmd/
					// http://www.lawebdelprogramador.com/foros/Java/1395850-Ejecutar-comando-desde-Java.html
					// http://felinfo.blogspot.com.co/2009/12/ejecutar-comandos-linux-y-ms-dos-desde.html
					// http://lineadecodigo.com/java/como-ejecutar-un-comando-del-sistema-desde-java/

					// el ejor link fué el primero
				} catch (IOException ioe) {
					System.out.println(ioe);
				}
			}
		});
		btnEjecutar.setBounds(456, 267, 89, 23);
		contentPane.add(btnEjecutar);

		lblArchivoJava = new JLabel("");
		lblArchivoJava.setBounds(21, 34, 425, 14);
		contentPane.add(lblArchivoJava);

		lblArchivoPython = new JLabel("");
		lblArchivoPython.setBounds(553, 34, 434, 14);
		contentPane.add(lblArchivoPython);
	}

	/* Función chooser */
	public ArrayList<String> getJavaFile() {
		getJava = new JFileChooser();
		getJava.setFileFilter(new FileNameExtensionFilter("Archivos Java", "JAVA"));
		int a = getJava.showOpenDialog(null);
		File fileSelected = null;
		if (a == JFileChooser.APPROVE_OPTION) {
			fileSelected = getJava.getSelectedFile();
		}

		nameFileJava = fileSelected.getAbsolutePath();
		lblArchivoJava.setText(fileSelected.getName());

		if (!fileSelected.exists()) {
			System.out.println("No existe Archivo");
		}

		FileReader fileread;

		try {
			fileread = new FileReader(fileSelected);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error, no se pudo leer");
			return null;
		}

		BufferedReader br = new BufferedReader(fileread);
		ArrayList<String> list = new ArrayList<String>();

		try {
			String aux;

			while (true) {
				aux = br.readLine();

				if (aux != null) {
					list.add(aux);
				} else {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error, no se pudo leer");
		}

		try {
			br.close();
			fileread.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void mostrarTraduccion() {
		File f = new File("toPython.py");
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);

		ArrayList<String> list = new ArrayList<String>();
		String aux = null;
		while (true) {
			try {
				aux = br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (aux != null) {
				list.add(aux);
			} else {
				break;
			}
		}
		try {
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		lblArchivoPython.setText(f.getName());

		for (String element : list) {
			// textAreaJava.setText(element);
			textAreaPython.append(element + "\n");
		}

	}
	
	public void colorear(JTextArea area1, String texto) 
	{
        if (texto.length() >= 1) {
            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(new Color(149,0,85));
            Highlighter h = area1.getHighlighter();
            h.removeAllHighlights();
            String text = area1.getText();
            String caracteres = texto;
            Pattern p = Pattern.compile("(?i)" + caracteres);
            Matcher m = p.matcher(text);
            while (m.find()) {
                try {
                    h.addHighlight(m.start(), m.end(), highlightPainter);
                    
                } catch (BadLocationException ex) {
                    System.out.println("gg");
                }
            }
        } else {
            JOptionPane.showMessageDialog(area1, "la palabra a buscar no puede ser vacia");
        }
    }
	

	public JTextArea getTextAreaJava() {
		return textAreaJava;
	}

	public JTextArea getTextAreaPython() {
		return textAreaPython;
	}

	public JButton getBtnRevisar() {
		return btnRevisar;
	}

	public JButton getBtnTraducir() {
		return btnTraducir;
	}

	public JButton getBtnEjecutar() {
		return btnEjecutar;
	}

	public JMenu getMnArchivo() {
		return mnArchivo;
	}

	public JLabel getLblArchivoJava() {
		return lblArchivoJava;
	}

	public JLabel getLblArchivoPython() {
		return lblArchivoPython;
	}
	public JLabel getLblLinea() {
		return lblLinea;
	}
	public JCheckBoxMenuItem getVerRegla() {
		return verRegla;
	}
	public JLabel getLblLinea2() {
		return lblLinea2;
	}
}

