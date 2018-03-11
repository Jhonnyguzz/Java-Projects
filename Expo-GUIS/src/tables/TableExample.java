package tables;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TableExample
{
    public Container createContentPane()
    {
        String[] title = {"Continent", "Country", "Player", "Position"};
        Object[][] playerdata = {       
        {"America", "United States", "Sterling Davis" , "Forward"},
        {"Europe", "Germany", "Moritz Wohlers", "Forward/Centre"},
        {"Europe", "United Kingdom", "Ross Hutton", "Centre"},
        {"Europe", "Belgium", "Hugo Sterk", "Guard"},
        {"Europe", "United Kingdom", "Andy Pearson", "Forward"},
        {"America", "United States", "Robert Yanders", "Guard"},
        {"Europe", "United Kingdom", "Graham Hunter", "Guard"},
        {"Europe", "United Kingdom", "Julius Joseph", "Guard/Forward"},
        {"Europe", "United Kingdom", "Gareth Murray", "Forward"},
        {"America", "United States", "Maurice Hampton", "Guard"}};

        // Table instantiated using the two sets of data.
        JTable table = new JTable(playerdata, title);
        
       // table.setAutoCreateRowSorter(true);
        // The table displayed in a Scrollpane.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500, 150));
       
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane);
//      totalGUI.add(table);
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() 
    {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JTable [=]");

         //Create and set up the ContentPane
        TableExample demo = new TableExample();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}