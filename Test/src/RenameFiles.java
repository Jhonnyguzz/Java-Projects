import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class RenameFiles 
{
	public static Scanner sc;

	public static String reverseFileName(String str, String extension) 
	{
		String arr[] = str.split("-");
		String ss = "";
		if(arr.length==2) 
		{
			//Verificar que la extension sea mp3
			if(extension.equals("mp3")) {
				int index = arr[1].lastIndexOf('.');
				ss = arr[1].trim().substring(0, index-1) + " - " +arr[0].trim() + ".mp3";
			}
			else
				System.out.println("El archivo "+str+" no es mp3, revisar");
		}
		else
			System.out.println("El arreglo tiene mas de 2 posiciones, revisar el archivo "+str);
		return ss;
	}
	
	public static String getExtensionFile(File f) {
		if (f == null || f.isDirectory()){
			return "nulo o directorio";
		}else if (f.isFile()){
			int index = f.getAbsolutePath().lastIndexOf('.');
			if (index == -1) {
				return "";
			} else {
				return f.getAbsolutePath().substring(index + 1);
			}
		}else{
			return "que has enviado?";
		}
	}
	
	public static void renameMusicFiles(File tmp)
	{
		//Abriendo el archivo y obteniendo un nuevo nombre string
		String ext = getExtensionFile(tmp);
		String mm = reverseFileName(tmp.getName(),ext);
		
		//Reemplazando
		String route = tmp.getParent()+"\\"+mm;
		File tmp2 = new File(route);

		if(tmp.renameTo(tmp2)) {
			//System.out.println("exito!");
		}else{
			System.err.println("fracaso para renombrar: "+tmp.getName());
		}
	}
	
	public static ArrayList<File> getFiles() 
    {
    	ArrayList<File> myArr = new ArrayList<File>();
    	JFileChooser chooseDir;
        chooseDir = new JFileChooser();
        chooseDir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int a = chooseDir.showOpenDialog(null);

        if(a==JFileChooser.APPROVE_OPTION) 
        {
            File folder = chooseDir.getSelectedFile();
            File []listOfFiles = folder.listFiles();
            
            for(int i=0;i<listOfFiles.length;i++) 
            {
                if(listOfFiles[i].getName().endsWith(".mp3")) 
                {
                	myArr.add(listOfFiles[i]);
                }
                else
                	System.out.println("El archivo: "+listOfFiles[i].getName()+" no se usa");
            }       
        }
        return myArr;
    }
	
	public static void main(String[] args) 
	{	
		ArrayList<File> musica = getFiles();
		System.err.println("Cargando...");
		for (int i = 0; i < musica.size(); i++) {
			System.err.println(musica.get(i).getAbsolutePath());
		}
		System.err.println("Total canciones: "+musica.size());
		
		System.out.println("Desea renombrar? Y/N");
		sc = new Scanner(System.in);
		String op = sc.nextLine();
		
		if(op.equals("Y") || op.equals("y"))
		{
			for (int i = 0; i < musica.size(); i++) {
				renameMusicFiles(musica.get(i));
			}
		System.err.println("Proceso terminado...");
		}else
			System.err.println("Saliendo...");
	}
}
