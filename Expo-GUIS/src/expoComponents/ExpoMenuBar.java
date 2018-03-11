package expoComponents;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

// Class implements three different types of listener.

public class ExpoMenuBar {

    public JPanel createContentPane()
    {
        JPanel totalGUI = new JPanel();
        totalGUI.setBackground(Color.white);
        totalGUI.setMinimumSize(new Dimension(300, 200));
        totalGUI.setPreferredSize(new Dimension(300, 200));
        totalGUI.setMaximumSize(new Dimension(300, 200));
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public JMenuBar createMenuBar()
    {
        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();

        //Add a JMenu
        JMenu starter = new JMenu("Starters");
        JMenu maincourse = new JMenu("Main Courses");
        JMenu desserts = new JMenu("Desserts"); 

        menuBar.add(starter);
        menuBar.add(maincourse);
        menuBar.add(desserts);
        
        // Now we want to fill each of the menus.
        // Starters. This is a simple Menu, with three MenuItems.
        
        JMenuItem soup = new JMenuItem("Soup");
        JMenuItem pate = new JMenuItem("Pate");
        JMenuItem salad = new JMenuItem("Salad");
        
        starter.add(soup);
        starter.add(pate);
        starter.add(salad);
		
        // Main Courses
        // This menu is a little more complex.
        // We have a sub-menu within the menu,
        // and have put in a radio-button group for the sideorders.
        // There is also a Separator down there in line 74
		
        JMenuItem fish =  new JMenuItem("Haddock");
		
        JMenu steak = new JMenu("Steak");
        JMenuItem rare = new JMenuItem("Rare");
        JMenuItem welldone = new JMenuItem("Well Done");
        steak.add(rare);
        steak.add(welldone);
		
        JMenuItem pie = new JMenuItem("Pie");
		
        ButtonGroup sides = new ButtonGroup();
        JRadioButtonMenuItem chips = new JRadioButtonMenuItem("Chips");
        JRadioButtonMenuItem bp = new JRadioButtonMenuItem("Baked Potato");
        JRadioButtonMenuItem vege = new JRadioButtonMenuItem("Vegetables");
		
        sides.add(chips);
        sides.add(bp);
        sides.add(vege);
		
        maincourse.add(fish);
        maincourse.add(steak);
        maincourse.add(pie);
        maincourse.addSeparator();
        maincourse.add(chips);
        maincourse.add(bp);
        maincourse.add(vege);
				  
        // Desserts
        // This is to display the CheckBoxMenuItem
        // and another SubMenu with more CheckBoxes in it.
		
        JCheckBoxMenuItem cake = new JCheckBoxMenuItem("Cake");
        JCheckBoxMenuItem sorbet = new JCheckBoxMenuItem("Sorbet");
        JMenu icecream = new JMenu("Ice Cream");
        JCheckBoxMenuItem choc = new JCheckBoxMenuItem("Chocolate");
        JCheckBoxMenuItem vani = new JCheckBoxMenuItem("Vanilla");
        icecream.add(choc);
        icecream.add(vani);
		
        desserts.add(cake);
        desserts.add(sorbet);
        desserts.add(icecream);
	   
        return menuBar;
    }

    private static void createAndShowGUI() {

       // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JMenuBar [=]");

        //Create and set up the content pane.
        ExpoMenuBar demo = new ExpoMenuBar();
        frame.setContentPane(demo.createContentPane());
        // We now also set the MenuBar of the Frame to our MenuBar 
        frame.setJMenuBar(demo.createMenuBar());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}