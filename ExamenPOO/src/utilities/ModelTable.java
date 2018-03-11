package utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import view.Question7Frame;

public class ModelTable implements ActionListener
{
	Question7Frame tabla = new Question7Frame();
	
	private ArrayList<String> nombre = new ArrayList<String>();
	private ArrayList<Integer> edad = new ArrayList<Integer>();
	private ArrayList<Integer> id = new ArrayList<Integer>();
	
	public ModelTable(Question7Frame tabla)
	{
		this.tabla=tabla;
		
		this.tabla.getBtnAgregar().addActionListener(this);
		this.tabla.getBtnBorrar().addActionListener(this);
	}
	public void llenarTabla()
	{
		
		Object filas[][] = new Object[][]{}; 
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
	public void borrar(int index)
	{
		this.nombre.remove(index);
		this.edad.remove(index);
		this.id.remove(index);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object push = e.getSource();
		
		if(push==tabla.getBtnAgregar())
		{
			String nombre=tabla.getTextFieldNombre().getText();
			int edad=Integer.parseInt(tabla.getTextFieldEdad().getText());
			int id=Integer.parseInt(tabla.getTextFieldId().getText());
			
			agregar(nombre,edad,id);
			llenarTabla();
		}
		if(push==tabla.getBtnBorrar())
		{
			if(tabla.getTable().getSelectedRow()==-1)
			{
				this.tabla.getLabel().setText("Selecciona una fila en la tabla y luego presiona el boton borrar");
			}
			else
			{
				borrar(tabla.getTable().getSelectedRow());
				llenarTabla();
			}
		}
	}	
}
