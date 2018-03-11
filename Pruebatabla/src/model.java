import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class model 
{
	Tabla tabla = new Tabla();
	
	private ArrayList<String> nombre = new ArrayList<String>();
	private ArrayList<Integer> edad = new ArrayList<Integer>();
	private ArrayList<Integer> id = new ArrayList<Integer>();
	
	public model(Tabla tabla)
	{
		this.tabla=tabla;
	}
	public void llenarTabla()
	{
		
		Object filas[][] = new Object[][]
				{
				    {"Jhon",15,565},
				    {"Ever",18,56456},
				    {"Juan",32,87978}
		        }; 
		String columnas[] = new String[]{"Nombre","edad","id"};
		DefaultTableModel model = new DefaultTableModel(filas,columnas);
		this.tabla.getTable().setModel(model);
		
		Object tmp[] = new Object[3];
		
		for(int i=0;i<this.nombre.size();i++)
		{
			tmp[0]=this.nombre.get(i);
			tmp[1]=this.edad.get(i);
			tmp[2]=this.id.get(i);
		
			model.addRow(tmp); // pilas, añadir arreglo de Object unidimensional, no bidimensional
		}
	}
	public void agregar(String nombre,int edad,int id)
	{
		this.nombre.add(nombre);
		this.edad.add(edad);
		this.id.add(id);
	}	
}
