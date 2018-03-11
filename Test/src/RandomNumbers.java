import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RandomNumbers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumbers frame = new RandomNumbers();
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
	public RandomNumbers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCat = new JButton("cat 1");
		btnCat.setBounds(30, 38, 89, 23);
		contentPane.add(btnCat);
		
		JButton btnNewButton = new JButton("cat 2");
		btnNewButton.setBounds(30, 72, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cat 3");
		btnNewButton_1.setBounds(30, 106, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("cat 4");
		btnNewButton_2.setBounds(30, 140, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("cat 5");
		btnNewButton_3.setBounds(30, 174, 89, 23);
		contentPane.add(btnNewButton_3);
		
		ArrayList<Integer> cat1 = new ArrayList<Integer>();
		ArrayList<Integer> cat2 = new ArrayList<Integer>();
		ArrayList<Integer> cat3 = new ArrayList<Integer>();
		ArrayList<Integer> cat4 = new ArrayList<Integer>();
		ArrayList<Integer> cat5 = new ArrayList<Integer>();
		
		Random x = new Random();
		
		for (int i = 0; i < 40; i++) {
			int tmp = x.nextInt(40) + 1;
			if (tmp >= 1 && tmp <=8)
				cat1.add(tmp);
			else if(tmp >= 9 && tmp <=16)
				cat2.add(tmp);
			else if(tmp >= 17 && tmp <=24)
				cat3.add(tmp);
			else if(tmp >= 25 && tmp <=32)
				cat4.add(tmp);
			else if(tmp >= 33 && tmp <=40)
				cat5.add(tmp);
		}
		
		System.out.println(cat1.size());
		System.out.println(cat2.size());
		System.out.println(cat3.size());
		System.out.println(cat4.size());
		System.out.println(cat5.size());
		
		btnCat.setBounds(30, 38, cat1.size()*20, 23);
		btnNewButton.setBounds(30, 72, cat2.size()*20, 23);
		btnNewButton_1.setBounds(30, 106, cat3.size()*20, 23);
		btnNewButton_2.setBounds(30, 140, cat4.size()*20, 23);
		btnNewButton_3.setBounds(30, 174, cat5.size()*20, 23);
	}
}
