package calculator;

public class Libreria 
{
	private String cadena ;
	private double resultado;
	private boolean suma, resta, multiplicacion, division;
	
	public Libreria()
	{
		this.cadena = "";
		this.suma = false;
		this.resta = false;
		this.division = false;
		this.multiplicacion = false;
	}
	
	public String concatenamiento(String cadena)
	{
		this.cadena = this.cadena + cadena;
		return this.cadena;
	}
	public void suma(String cadena)
	{
		this.resultado = Double.parseDouble(cadena);
		suma = true;
		this.cadena = "";
	}
	public void resta(String cadena)
	{
		this.resultado = Double.parseDouble(cadena);
		resta = true;
		this.cadena = "";
	}
	public void multiplicacion(String cadena)
	{
		this.resultado = Double.parseDouble(cadena);
		multiplicacion = true;
		this.cadena = "";
	}
	public void division(String cadena)
	{
		this.resultado = Double.parseDouble(cadena);
		division = true;
		this.cadena = "";
	}
	
	public double resultado(String numero)
	{
		if(suma == true)
		{
			resultado = resultado + Double.parseDouble(numero);
		}
		else if(resta == true)
		{
			resultado = resultado - Double.parseDouble(numero);
		}
		else if(multiplicacion == true)
		{
			resultado = resultado * Double.parseDouble(numero);
		}
		else if(division == true)
		{
			resultado = resultado / Double.parseDouble(numero);
		}
		suma = false;
		resta = false;
		multiplicacion = false;
		division = false; 
		return resultado;
		
	}
}
