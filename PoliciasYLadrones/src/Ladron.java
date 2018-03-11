import java.util.Random;

public class Ladron 
{
	private char [][] tablero; 
	private char ladron;
	private char policia;
	private int filaLadron;
	private int columnaLadron;
	private int filaPolicia;
	private int columnaPolicia;
	private Random r = new Random();
	
    public Ladron()
    {
    	tablero = new char[8][8];
    	
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero.length;j++)
			{
				tablero[i][j]='O';
			}
		}
    }
    public char getLadron() 
    {
		return ladron;
	}
	public void setLadron(char ladron) 
	{
		this.ladron = ladron;
	}
	public char getPolicia() 
	{
		return policia;
	}
	public void setPolicia(char policia) 
	{
		this.policia = policia;
	}
	public void startLadron()
    {
    	int columna = r.nextInt(8);
    	int fila = r.nextInt(2);
    	tablero[fila][columna]='L';   	
    }
    public void startPolicia()
    {
    	int columna = r.nextInt(8);
    	int fila = r.nextInt(2)+6;
    	tablero[fila][columna]='P';
    }
    public void moveLadron()
    {
    	switch(r.nextInt(8))
    	{
    		case 0:
    			try
    			{
    				tablero[filaLadron-1][columnaLadron]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 1:
    			try
    			{
    				tablero[filaLadron+1][columnaLadron]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 2:
    			try
    			{
    				tablero[filaLadron][columnaLadron-1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 3:
    			try
    			{
    				tablero[filaLadron][columnaLadron+1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 4:
    			try
    			{
    				tablero[filaLadron-1][columnaLadron-1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 5:
    			try
    			{
    				tablero[filaLadron-1][columnaLadron+1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 6:
    			try
    			{
    				tablero[filaLadron+1][columnaLadron-1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		case 7:
    			try
    			{
    				tablero[filaLadron+1][columnaLadron+1]='L';
    				tablero[filaLadron][columnaLadron]='O';
    				this.findLadron();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				moveLadron();
    			}
    			break;
    		default:
    			System.out.println("Error al mover ladrón");
    			break;
    	}
    	    	
    }
    public void movePolicia()
    {
    	switch(r.nextInt(8))
    	{
    		case 0:
    			try
    			{
    				tablero[filaPolicia+1][columnaPolicia-2]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia-1]='X';
    				tablero[filaPolicia][columnaPolicia-2]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 1:
    			try
    			{
    				tablero[filaPolicia-1][columnaPolicia-2]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia-1]='X';
    				tablero[filaPolicia][columnaPolicia-2]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 2:
    			try
    			{
    				tablero[filaPolicia+2][columnaPolicia-1]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia-1]='X';
    				tablero[filaPolicia+1][columnaPolicia-1]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 3:
    			try
    			{
    				tablero[filaPolicia-2][columnaPolicia-1]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia-1]='X';
    				tablero[filaPolicia-1][columnaPolicia-1]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 4:
    			try
    			{
    				tablero[filaPolicia+1][columnaPolicia+2]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia+1]='X';
    				tablero[filaPolicia][columnaPolicia+2]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 5:
    			try
    			{
    				tablero[filaPolicia-1][columnaPolicia+2]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia+1]='X';
    				tablero[filaPolicia][columnaPolicia+2]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 6:
    			try
    			{
    				tablero[filaPolicia+2][columnaPolicia+1]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia+1]='X';
    				tablero[filaPolicia+1][columnaPolicia+1]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		case 7:
    			try
    			{
    				tablero[filaPolicia-2][columnaPolicia+1]='P';
    				tablero[filaPolicia][columnaPolicia]='X';
    				tablero[filaPolicia][columnaPolicia+1]='X';
    				tablero[filaPolicia-1][columnaPolicia+1]='X';
    				this.findPolicia();
    			}
    			catch(ArrayIndexOutOfBoundsException e)
    			{
    				movePolicia();
    			}
    			break;
    		default:
    			System.out.println("Error al mover policia");
    			break;
    	}
    }
    //método en construcción
    public boolean canMoveLadron()
    {
    	if(tablero[filaLadron][columnaLadron]=='X')
    	{
    		return false;
    	}
		return true;
    }
    public boolean catchYou()
    {
    	if(filaLadron==filaPolicia && columnaLadron==columnaPolicia)
    	{
    		return true;
    	}
    	return false;
    }
    public boolean shoot()
    {	
    	switch(r.nextInt(4))
    	{
    		case 0:
    			System.out.print("Tiro a la izquierda...");
    			while(tablero[filaPolicia][columnaPolicia]!='X' && columnaPolicia>0)
    			{
    				columnaPolicia--;
    				if(tablero[filaPolicia][columnaPolicia]=='L')
    				{
    					return true;
    				}		
    			}
    			findPolicia();
    			break;
    		case 1:
    			System.out.print("Tiro a la derecha...");
    			while(tablero[filaPolicia][columnaPolicia]!='X' && columnaPolicia<7)
    			{
    				columnaPolicia++;
    				if(tablero[filaPolicia][columnaPolicia]=='L')
    				{
    					return true;
    				}		
    			}
    			findPolicia();
    			break;
    		case 2:
    			System.out.print("Tiro hacia arriba...");
    			while(tablero[filaPolicia][columnaPolicia]!='X' && filaPolicia>0)
    			{
    				filaPolicia--;
    				if(tablero[filaPolicia][columnaPolicia]=='L')
    				{
    					return true;
    				}		
    			}
    			findPolicia();
    			break;
    		case 3:
    			System.out.print("Tiro hacia abajo...");
    			while(tablero[filaPolicia][columnaPolicia]!='X' && filaPolicia<7)
    			{
    				filaPolicia++;
    				if(tablero[filaPolicia][columnaPolicia]=='L')
    				{
    					return true;
    				}		
    			}
    			findPolicia();
    			break;
    		default:
    			System.out.println("Error al disparar");
    			break;
    	}
    	return false;
    }
    public void findLadron()
    {
    	int aux=0;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero.length;j++)
			{
				if(tablero[i][j]=='L')
				{
					filaLadron=i;
					columnaLadron=j;
					aux=1;
					break;
				}				
			}
			if(aux==1)
			{
				break;
			}
		}
    }
    public void findPolicia()
    {
    	int aux=0;
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero.length;j++)
			{
				if(tablero[i][j]=='P')
				{
					filaPolicia=i;
					columnaPolicia=j;
					aux=1;
					break;
				}				
			}
			if(aux==1)
			{
				break;
			}
		}
    }
    public void print()
    {
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero.length;j++)
			{
				System.out.print(tablero[i][j]+"\t");				
			}
			System.out.println("\n");
		}
    }
    
    
    //metodo que reemplza las X por O, es temporal
    public void temporal()
    {
		for(int i=0;i<tablero.length;i++)
		{
			for(int j=0;j<tablero.length;j++)
			{
				if(tablero[i][j]=='X')
				{
					tablero[i][j]='O';
				}				
			}
		}
    }
    
}
