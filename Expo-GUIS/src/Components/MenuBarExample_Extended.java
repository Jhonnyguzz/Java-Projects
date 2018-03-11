package Components;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

// Class implements three different types of listener.
public class MenuBarExample_Extended implements  ActionListener, ItemListener{

    JTextArea whitebox;
    JCheckBoxMenuItem cake, sorbet;
    
    public Container createContentPane()
    {
        whitebox = new JTextArea();
        whitebox.setEditable(false);
        whitebox.setLineWrap(true);
        whitebox.setWrapStyleWord(true);
        whitebox.setMinimumSize(new Dimension(300, 200));
        whitebox.setPreferredSize(new Dimension(300, 200));
        whitebox.setMaximumSize(new Dimension(300, 200));

        JPanel totalGUI = new JPanel();
        totalGUI.add(whitebox);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public JMenuBar createMenuBar()
    {
        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();

        //Add a JMenu
        JMenu starter = new JMenu("Starters");
        menuBar.add(starter);

        // Now we want to fill the menu.
        // This has every type of widget in the MenuBar
        // and has Event Listeners attached to each.
          
        JMenuItem soup = new JMenuItem("Soup");
        soup.addActionListener(this);

        JMenu steak = new JMenu("Steak");
           
        JMenuItem rare = new JMenuItem("Rare");
        rare.addActionListener(this);
        JMenuItem welldone = new JMenuItem("Well Done");
        welldone.addActionListener(this);
        steak.add(rare);
        steak.add(welldone);

        JRadioButtonMenuItem chips = new JRadioButtonMenuItem("Chips");
        chips.addActionListener(this);
        JRadioButtonMenuItem bp = new JRadioButtonMenuItem("Baked Potato");
        bp.addActionListener(this);

        ButtonGroup sides = new ButtonGroup();
        sides.add(chips);
        sides.add(bp);

        cake = new JCheckBoxMenuItem("Cake");
        cake.addItemListener(this);
        sorbet = new JCheckBoxMenuItem("Sorbet");
        sorbet.addItemListener(this);

        starter.add(soup);
        starter.addSeparator();
        starter.add(steak);
        starter.addSeparator();
        starter.add(chips);
        starter.add(bp);
        starter.addSeparator();
        starter.add(cake);
        starter.add(sorbet);

        return menuBar;
    }

    // Deals with the Action Events.
    public void actionPerformed(ActionEvent e)
    {
        whitebox.append(e.getActionCommand() + " Selected \n");
    }

    // Deals with the Item Events.
    public void itemStateChanged(ItemEvent e)
    {     
        if(e.getSource() == cake)
        {
            whitebox.append("Cake Clicked\n");
        }
        else if(e.getSource() == sorbet)
        {
            whitebox.append("Sorbet Clicked\n");
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JMenuBar [=]");

        //Create and set up the ContentPane and MenuBar
        MenuBarExample_Extended demo = new MenuBarExample_Extended();
        
        frame.setContentPane(demo.createContentPane());
        frame.setJMenuBar(demo.createMenuBar());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}