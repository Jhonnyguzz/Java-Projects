package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utilities.ModelTable;

public class BeginHereOnlyMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeginHereOnlyMain frame = new BeginHereOnlyMain();
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
	public BeginHereOnlyMain() {
		setTitle("Frame Principal Examen Final POO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cada Bot\u00F3n Corresponde a Una pregunta del Examen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 422, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton runQuestion3 = new JButton("Correr Pregunta 3");
		runQuestion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try {
							Question3Frame frame = new Question3Frame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		runQuestion3.setBounds(34, 48, 350, 23);
		panel.add(runQuestion3);
		
		JButton runQuestion4 = new JButton("Correr Pregunta 4");
		runQuestion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try {
							Question4Frame frame = new Question4Frame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		runQuestion4.setBounds(34, 82, 350, 23);
		panel.add(runQuestion4);
		
		JButton runQuestion5 = new JButton("Correr Pregunta 5");
		runQuestion5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try {
							Question5Frame frame = new Question5Frame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		runQuestion5.setBounds(34, 116, 350, 23);
		panel.add(runQuestion5);
		
		JButton runQuestion6 = new JButton("Correr Pregunta 6");
		runQuestion6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try {
							Question6Frame frame = new Question6Frame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		runQuestion6.setBounds(34, 150, 350, 23);
		panel.add(runQuestion6);
		
		JButton runQuestion7 = new JButton("Correr Pregunta 7");
		runQuestion7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable(){
					public void run(){
						try {
							Question7Frame frame = new Question7Frame();
							ModelTable xd = new ModelTable(frame);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		runQuestion7.setBounds(34, 184, 350, 23);
		panel.add(runQuestion7);
		this.setResizable(false);
	}
}
