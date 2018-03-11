package gui;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import utilities.Serialize;
import db.DataBase;

public class Choose 
{
	private static JFileChooser openList;
	private static JFileChooser saveList;
	private static String readArchive;
	private static String fileName;

	public static void getSaveDataBase(DataBase ob)
	{
		saveList = new JFileChooser();
		saveList.setFileFilter(new FileNameExtensionFilter("Base de datos","bdd"));
	    int a = saveList.showSaveDialog(null);
 	    if(a==JFileChooser.APPROVE_OPTION)
	    {
 	    	fileName=saveList.getSelectedFile().getAbsolutePath();
 	    	
            if(!(fileName.endsWith(".bdd")))
            {
            	fileName=fileName+".bdd";
            }
 	    	Serialize.Serializar(fileName, ob);
	    }
	}
	public static DataBase getOpenList()
	{
		openList = new JFileChooser();
		openList.setFileFilter(new FileNameExtensionFilter("Base de datos","bdd"));
	    int a = openList.showOpenDialog(null);
 	    if(a==JFileChooser.APPROVE_OPTION)
	    {
 	    	readArchive=openList.getSelectedFile().getAbsolutePath();
	    }
 	    return Serialize.readDataFromString(readArchive);
	}
}