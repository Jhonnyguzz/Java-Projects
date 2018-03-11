import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;

public class Simulacion 
{
	Timer tiempo = new Timer();
	double promedio_encola_cliente1;
	double promedio_encola_cliente2;
	double promedio_encola;
	
	final static int TIEMPO_FINAL = 1000;
	
	int count_cliente1 = 0;
	int count_cliente2 = 0;
	
	Queue<Cliente> queueT1 = new LinkedList<>();
	Queue<Cliente> queueT2 = new LinkedList<>();
	
	Queue<Cliente> serverA1 = new LinkedList<>();
	Queue<Cliente> serverA2 = new LinkedList<>();
	Queue<Cliente> serverB1 = new LinkedList<>();
	
	public Cliente llegadaDeCliente(Cliente entity)
	{
		Random r = new Random();
		entity.tipoDeCliente = (r.nextInt(9)<7)?1:2;
		entity.atendidoa = false;
		entity.atendidob = false;
		return entity;
	}
	
	public void encolar(Cliente entity)
	{
		if(entity.tipoDeCliente==1 || (entity.tipoDeCliente==2 && queueT1.size()<queueT2.size()))
		{
			queueT1.add(entity);
			entity.entrada = System.currentTimeMillis();
		}
		if((entity.tipoDeCliente==2 || (entity.tipoDeCliente==1 && queueT2.size()<queueT1.size())))
		{
			queueT2.add(entity);
			entity.entrada = System.currentTimeMillis();
		}
	}
	
	public void usarServidor()
	{
		Cliente qs = queueT1.poll();
		Cliente qs1 = queueT2.poll();
		
		qs.salida = System.currentTimeMillis();
		qs1.salida = System.currentTimeMillis();
		
		if(qs!=null)
		{
			Random r = new Random();
			if(r.nextInt(1)==0) 
			{
				serverA1.add(qs);
				qs.atendidoa = true;
				qs.atendidob = true;
			}
			else 
			{
				serverA2.add(qs);
				qs.atendidoa = true;
				qs.atendidob = true;
			}
		}
		if(qs1!=null)
		{
			serverB1.add(qs1);
			qs.atendidob = true;
		}
	}
	
	private void usarServerA(Cliente qs)
	{
		Random r = new Random();
		if(r.nextInt(1)==0) 
		{
			serverA1.add(qs);
			qs.atendidoa = true;
		}
		else 
		{
			serverA2.add(qs);
			qs.atendidoa = true;
		}
	}
	
	private void usarServerB(Cliente qs)
	{
		serverB1.add(qs);
		qs.atendidob = true;
	}
	
	public void desocuparYSalir()
	{
		Cliente qs = serverA1.poll();
		Cliente qs1 = serverA2.poll();
		
		Cliente qs2 = serverB1.poll();
		
		//salida servidor A1
		if(qs!=null && qs.atendidoa && qs.atendidob)
		{
			//salir del sistema
			if(qs.tipoDeCliente==1)
			{
				count_cliente1 += 1; 
				promedio_encola_cliente1 += qs.salida-qs.entrada;
				promedio_encola_cliente1 /= count_cliente1;
			}
			else
			{
				count_cliente2 += 1; 
				promedio_encola_cliente2 += qs.salida-qs.entrada;
				promedio_encola_cliente2 /= count_cliente2;
			}
			promedio_encola = (promedio_encola_cliente1+promedio_encola_cliente2)/2;
		}
		
		//Salida servidor A2
		if(qs1!=null && qs1.atendidoa && qs1.atendidob)
		{
			//salir del sistema
			if(qs1.tipoDeCliente==1)
			{
				count_cliente1 += 1; 
				promedio_encola_cliente1 += qs.salida-qs.entrada;
				promedio_encola_cliente1 /= count_cliente1;
			}
			else
			{
				count_cliente2 += 1; 
				promedio_encola_cliente2 += qs.salida-qs.entrada;
				promedio_encola_cliente2 /= count_cliente2;
			}
			promedio_encola = (promedio_encola_cliente1+promedio_encola_cliente2)/2;
		}
		
		if(qs2!=null)
		{
			if(qs2.atendidoa && qs2.atendidob)
			{
				//salir del sistema
				if(qs1.tipoDeCliente==1)
				{
					count_cliente1 += 1; 
					promedio_encola_cliente1 += qs.salida-qs.entrada;
					promedio_encola_cliente1 /= count_cliente1;
				}
				else
				{
					count_cliente2 += 1; 
					promedio_encola_cliente2 += qs.salida-qs.entrada;
					promedio_encola_cliente2 /= count_cliente2;
				}
				promedio_encola = (promedio_encola_cliente1+promedio_encola_cliente2)/2;
			}
			else
			{
				if(qs2.atendidoa==false)
				{
					usarServerA(qs2);
				}
				else
				{
					usarServerB(qs2);
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		Simulacion ins = new Simulacion();
		
		for(int i = 0; i < Simulacion.TIEMPO_FINAL; i++) 
		{
			ins.encolar(ins.llegadaDeCliente(new Cliente()));
			ins.usarServidor();
			ins.desocuparYSalir();
		}
		
		System.out.println("Promedio en la cola "+ins.promedio_encola);
		System.out.println("Promedio en la cola de clientes 1 "+ins.promedio_encola_cliente1);
		System.out.println("Promedio en la cola de cleintes 2 "+ins.promedio_encola_cliente2);
	}
}

class Cliente implements Serializable {

	 int tipoDeCliente;

	 boolean atendidoa;

	 boolean atendidob;
	 
	 double entrada;
	 
	 double salida;

   /**
    * Default constructor
    */
   public Cliente() {
   }

   /**
    * Constructor initializing the fields
    */
   public Cliente(int tipoDeCliente, boolean atendidoa, boolean atendidob, double entrada, double salida) {
		this.tipoDeCliente = tipoDeCliente;
		this.atendidoa = atendidoa;
		this.atendidob = atendidob;
		this.entrada = entrada;
		this.salida = salida;
   }

	@Override
	public String toString() {
		return  
			"tipoDeCliente = " + tipoDeCliente +" " +
			"atendidoa = " + atendidoa +" " +
			"atendidob = " + atendidob +" ";
	}

	/**
	 * This number is here for model snapshot storing purpose<br>
	 * It needs to be changed when this class gets changed
	 */ 
	private static final long serialVersionUID = 1L;

}
