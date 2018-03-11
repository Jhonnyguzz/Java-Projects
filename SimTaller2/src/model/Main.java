package model;

import simlib.*;

public class Main 
{
	final static int ELEVATORDOWN = 0;
	final static int ELEVATORUP = 1;
	final static int ELEVATORDISCHARGED = 2;
	
	public static void main(String[] args) 
	{
		Timer clock = new Timer();
		clock.setTime(0);  // Timer initialized to zero

		List eventList = new List();  // A list to hold events
		//List queue = new List();  // A list to represent a queue
		
		// Discrete statistic
		//DiscreteStat waitTime = new DiscreteStat();
		
//		System.out.println("Imprimiendo un numero de distribución uniforme");
//		System.out.println(Random.unifrm(3, 7, (int) (Math.random() * 100 + 1)));	
//		System.out.println("Probando prob");
//		System.out.println(Random.prob());
		
		
		Stats A = new Stats();
		Stats B = new Stats();
		Stats C = new Stats();
		
		int weightElevator = 0;
		int stateElevator = 0;
		int ajust = 60;
		
		SimObject event1 = new SimObject();
		SimObject event2 = new SimObject();
		SimObject event3 = new SimObject();
		
		event1.setName("caja A"); 
		event1.setTime(clock.getTime() + Random.unifrm(3, 7, (int) (Math.random() * 100 + 1)));
		event2.setName("caja B"); 
		event2.setTime(clock.getTime() + (float) 6);
		event3.setName("caja C"); 
		event3.setTime(clock.getTime() + (float) (Random.prob()));
		
		do
		{
			if(Main.ELEVATORDOWN == stateElevator)
			{
						
				while(weightElevator!=400)
				{					
					if(event1.getTime()<=event2.getTime() && event1.getTime()<=event3.getTime())
					{
						if(weightElevator+200>400)
						{
							clock.setTime(event1.getTime());
							event1 = new SimObject(); //por si algo
							event1.setName("caja A");
							event1.setTime(clock.getTime() + Random.unifrm(3, 7, (int) (Math.random() * 100 + 1)));
							continue;
						}
						eventList.insertAtBack(event1);
						weightElevator += 200;
						
						clock.setTime(event1.getTime());
						event1 = new SimObject(); //por si algo
						event1.setName("caja A");
						event1.setTime(clock.getTime() + Random.unifrm(3, 7, (int) (Math.random() * 100 + 1))); //solo calcular para el paquete que ya llegó pues abrá que esperar al siguiente
																				   //Puesto que el B y C deben estar por llegar o ya llegaron, lo mismo para los otros dos casos
						continue;
					}
					else if(event2.getTime()<=event1.getTime() && event2.getTime()<=event3.getTime())
					{
						if(weightElevator+100>400)
						{
							clock.setTime(event1.getTime());
							event2 = new SimObject(); //por si algo
							event2.setName("caja B");
							event2.setTime(clock.getTime() + (float) 6);
							continue;
						}
						eventList.insertAtBack(event2);
						
						B.setSum(event2.getTime()-clock.getTime()); //medida de B
						B.setCount(1);
						
						weightElevator += 100;
						
						clock.setTime(event2.getTime());
						event2 = new SimObject(); //por si algo
						event2.setName("caja B");
						event2.setTime(clock.getTime() + (float) 6);
						
						continue;
					}
					else if(event3.getTime()<=event2.getTime() && event3.getTime()<=event1.getTime())
					{
						if(weightElevator+50>400)
						{
							clock.setTime(event1.getTime());
							event3 = new SimObject(); //por si algo
							event3.setName("caja C");
							event3.setTime(clock.getTime() + (float) (Random.prob()));
							continue;
						}
						eventList.insertAtBack(event3);
						weightElevator += 50;
						
						clock.setTime(event3.getTime());
						event3 = new SimObject(); //por si algo
						event3.setName("caja C");
						event3.setTime(clock.getTime() + (float) (Random.prob()));
						
						continue;
					}
				}
				stateElevator = 1;
				
				//imprimir tiempo que tienen los eventos actuales
				//System.out.println("imprimir tiempo que tienen los eventos actuales");
				//eventList.print();
			}
			
			if(stateElevator == Main.ELEVATORUP)
			{
				clock.setTime(clock.getTime()+1); //un minuto en subir
				stateElevator = 2;
			}
			
			if(stateElevator == Main.ELEVATORDISCHARGED)
			{
				SimObject tmp;
				clock.setTime(clock.getTime()+2);
				
				while(!eventList.isEmpty())
				{
					tmp = eventList.removeFromFront();
					
					if(tmp.getName().equals("caja A"))
					{
						A.setSum(clock.getTime()-tmp.getTime()+3);
						A.setCount(1);
					}
					if(tmp.getName().equals("caja C"))
					{
						C.setCount(1);
					}
					
					clock.setTime(tmp.getTime()+1); //sumar tiempo que se demoraron en llegar las cajas al cargarlas
				}
				stateElevator = 0;
				weightElevator = 0;
				
				if(clock.getTime()>ajust)
				{
					//System.out.println(C.getCount());
					ajust = ajust+60;
					//System.out.println("print:"+C.getSum()+" "+C.getCount());
				}
			}
			
		}while(clock.getTime()<480);
				
		System.out.println("Tiempo total simulado");
		System.out.println(clock.getTime());
		System.out.println("Tiempo promedio tránsito caja A");
		System.out.println(A.average());
		System.out.println("promedio espera caja B");
		System.out.println(B.average());
		System.out.println("promedio cajas C en una hora");
		System.out.println(C.getCount()/8);
	}
}
//