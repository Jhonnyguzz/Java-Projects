import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Entrenadores implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int idEntrenadores;
	private int idPokemon;
	private int idmedallas;
	private Chain<Entrenador> couch;

	private void print( StringTokenizer h )
	{		
	    if( this.couch.size( ) > 0 )
	    {
			String y="Entrenadores\n";  
			for( int i = 0; i < this.couch.size; i++ )
			{
	    		 Entrenador x = this.couch.get( i );
				 
				 y+="|";
	    		 y+="-"+"id: "+ x.getId( ) + ": "+ x.getNombre( ) +"\n";
	    		 y+= i+1<this.couch.size? "|":" ";
	    			 
	    		 y+="        |-Medallas:\n";
	    		 for( Medalla z:x.getMedallas( ) )
	    		 {
	    			 y+= i+1<this.couch.size? "|":" ";
	    			 y+="        |    |-liga: "+ z.getLiga( ) +" Med: "+z.getNombre( ) + " id: " + z.getId( ) +"\n";
	    		 }	    		 
	    		 y+= i+1<this.couch.size? "|":" ";
	    		 y+="        |-Pokemons:\n";
	    		 for( Pokemon z1:x.getPokemons( ) )
	    		 {
	    			 y+= i+1<this.couch.size? "|":" ";
	    			 y+="             |-id: " + z1.getId( ) + " Nombre: " + z1.getNombre( ) + " Nivel: " + z1.getNivel( ) +"\n";
	    		 }
	    	 }
	    	 System.out.println(y);
		 }
	     else
	     {
	    	 System.out.println("no hay datos");
	     }	 
	}
	private void printLastTenRegisters( StringTokenizer h )
	{
	    if( this.couch.size( ) >= 10 )
	    {
			String y="Entrenadores\n";  
			for( int i = (this.couch.size)-10; i < this.couch.size; i++ )
			{
	    		 Entrenador x = this.couch.get( i );
				 
				 y+="|";
	    		 y+="-"+"id: "+ x.getId( ) + ": "+ x.getNombre( ) +"\n";
	    		 y+= i+1<this.couch.size? "|":" ";
	    			 
	    		 y+="        |-Medallas:\n";
	    		 for( Medalla z:x.getMedallas( ) )
	    		 {
	    			 y+= i+1<this.couch.size? "|":" ";
	    			 y+="        |    |-liga: "+ z.getLiga( ) +" Med: "+z.getNombre( ) + " id: " + z.getId( ) +"\n";
	    		 }	    		 
	    		 y+= i+1<this.couch.size? "|":" ";
	    		 y+="        |-Pokemons:\n";
	    		 for( Pokemon z1:x.getPokemons( ) )
	    		 {
	    			 y+= i+1<this.couch.size? "|":" ";
	    			 y+="             |-id: " + z1.getId( ) + " Nombre: " + z1.getNombre( ) + " Nivel: " + z1.getNivel( ) +"\n";
	    		 }
	    	 }
	    	 System.out.println(y);
		 }
	     else
	     {
	    	 String a = "print";
	 		 StringTokenizer hh = new StringTokenizer(a," ");
	    	 this.print(hh);
	     }	 		
	}
	private void create( StringTokenizer h )
	{
		String a,b;
	    int c,d;
	   		 
		String y = h.nextToken( );
		switch( y )
		{
			case "pokemon":
				y=h.nextToken( );
	        	if( y.equals( "*" ) )
	        	{
	        		Scanner x = new Scanner( System.in );
	        		System.out.print( "id del entrenador: " );
	        		c = x.nextInt( );
	        		Entrenador u = this.buscarEntrenador( c );
	        		if( u == null )
	        		{
	        			System.out.println( "El id del entrenador no existe" );
	        			x.close( );
	        			return;
	        		}	        		 
	        		System.out.print( "Nombre del pokemon: " );
	        		a = x.next( );
	        		System.out.print( "Nivel del pokemon: " );
	        		d = x.nextInt( );
	        		System.out.print( "Tipo del pokemon: " );
	        		b = x.next( );
	        		u.getPokemons().add(u.getPokemons().size,new Pokemon(this.idPokemon++,a,d,b));
	        	}
	        	else
	        	{
	        		c = Integer.parseInt( y );
	        		Entrenador u = this.buscarEntrenador( c );
	        		if( u == null )
	        		{
	        			System.out.println( "El id del entrenador no existe" );	        			
	        			return;
	        		}	 
	        		u.getPokemons().add(u.getPokemons().size,new Pokemon(this.idPokemon++,h.nextToken(),Integer.parseInt(h.nextToken()),h.nextToken()));
	        	}
	        	System.out.println( "Pokemon creado correctamente" );
	        	break;
	        case "entrenador":
	        	y = h.nextToken( );
	        	if( y.equals( "*" ) )
	        	{
	        		Scanner x = new Scanner( System.in );
	        		System.out.print( "Escriba el nombre: " );
	        		a = x.next( );
	        		System.out.print( "Escriba el genero: " );
	        		b = x.next( );
	        		System.out.print( "Escriba la edad: " );
	        		c = x.nextInt( );
	        		this.couch.add(this.couch.size(),new Entrenador(this.idEntrenadores++,a,b,c));
	        	}
	        	else
	        	{
	        		this.couch.add(this.couch.size(),new Entrenador(this.idEntrenadores++,y,h.nextToken(),Integer.valueOf(h.nextToken())));
	        	}
	        	System.out.println( "Entrenador creado correctamente" );
	        	break;
	        case "medalla":
	        	 y = h.nextToken( );
	        	 if( y.equals( "*" ) )
	        	 {
	        		 Scanner x = new Scanner( System.in );
	        		 System.out.print( "id del entrenador: " );
	        		 c = x.nextInt( );
	        		 Entrenador u = this.buscarEntrenador( c );
	        		 if(u == null)
	        		 {
	        			 System.out.println( "El id del entrenador no existe" );
	        			 x.close( );
	        			 return;
	        		 }	        		 
	        		 System.out.print( "Nombre de la medalla: " );
	        		 a = x.next( );
	        		 System.out.print( "Nombre de la liga: " );
	        		 b = x.next( );
	        		 u.getMedallas().add(u.getMedallas().size,new Medalla(this.idmedallas++,a,b));	        		
	        	 }
	        	 else
	        	 {
	        		 c = Integer.parseInt( y );
	        		 Entrenador u = this.buscarEntrenador( c );
	        		 if( u == null )
	        		 {
	        			 System.out.println( "El id del entrenador no existe" );
	        			 return;
	        		 }
	        		 u.getMedallas().add(u.getMedallas().size,new Medalla(this.idmedallas++,h.nextToken(),h.nextToken()));
	        	 }
	        	 System.out.println( "Medalla creada correctamente" );
	        	 break;
	        default:
	        	System.out.println( "no se reconoce el comando " + y );
	        	break;
		}
	}
	private void uplevel( StringTokenizer h )
	{		
		Pokemon x = this.buscarPokemon( Integer.parseInt( h.nextToken( ) ) );
	    if( x == null )
	    {
	    	System.out.println( "no existe el pokemon" );
	        return;
	    }
	    x.setNivel( x.getNivel( ) + 1 );
	    System.out.println( "Subir nivel del pokemon exitosa" );
	}
	private void change( StringTokenizer h )
	{
		String y = h.nextToken( );
		switch( y )
		{
			case "pokemon":
				int a = Integer.parseInt( h.nextToken( ) ), b = Integer.parseInt( h.nextToken( ) );
		        Pokemon x1=this.buscarPokemon(a);
		        if( x1 == null )
		        {
		    	    System.out.println( "El id del pokemon " + a + " no existe" );
		    	    return;
		        }
		        Pokemon x2 = this.buscarPokemon( b );
		        if( x2 == null )
		        {
		    	    System.out.println( "El id del pokemon " + b + " no existe" );
		    	    return;
		        }
		        Entrenador y1 = this.buscarEntrenadorPorPokemon( a ), y2 = this.buscarEntrenadorPorPokemon( b );
		        x1 = this.deletePokemon( a );
		        x2 = this.deletePokemon( b );
		        y1.getPokemons().add(y1.getPokemons().size,x2);
		        y2.getPokemons().add(y2.getPokemons().size,x1);
		        System.out.println( "Cambiar pokemon satisfactoriamente hecho" );
		        break;
		    case "info":
		    	Scanner x = new Scanner( System.in );
		    	y = h.nextToken( );
		    	switch ( y ) 
		    	{
		    		case "pokemon":
		    			a = Integer.parseInt( h.nextToken( ) );
		    	    	Pokemon z1 = this.buscarPokemon( a );
		    	    	if( z1 == null )
		    	    	{
		    	    		System.out.println( "El id del pokemon " + a + " no existe" );
				    	    return;
		    	    	}
		    	    	System.out.println( "Escriba la nueva info: " );
		    	    	System.out.print( "Nombre: " );
		    	    	z1.setNombre( x.next( ) );
		    	    	System.out.print( "Nivel: " );
		    	    	z1.setNivel( x.nextInt( ) );
		    	    	System.out.print( "Tipo: " );
		    	    	z1.setTipo( x.next( ) );
		    	    	System.out.println( "Cambio de datos exitoso" );
		    	    	break;
		    	    case "entrenador":
		    	    	a = Integer.parseInt( h.nextToken( ) );
		    	    	Entrenador z2 = this.buscarEntrenador( a );
		    	    	if( z2 == null )
		    	    	{
		    	    		System.out.println( "El id del entrenador " + a + " no existe" );
				    	    return;
		    	    	}
		    	    	System.out.println( "Escriba la nueva info: " );
		    	    	System.out.print( "Nombre: " );
		    	    	z2.setNombre( x.next( ) );
		    	    	System.out.print( "Genero: " );
		    	    	z2.setGenero( x.next( ) );
		    	    	System.out.print( "Edad: " );
		    	    	z2.setEdad( x.nextInt( ) );
		    	    	System.out.println( "Cambio de datos exitoso" );
		    	    	break;
		    	    default:
		    	    	System.out.println( "no se reconoce el comando " + y );
		    	    break;	
		    	}
		    	break;
		    default:
    	    	System.out.println( "no se reconoce el comando " + y );
    	    	break;
		}
	}
	private void delete( StringTokenizer h ) 
	{
		String y = h.nextToken( );	     
	    int a = Integer.valueOf( h.nextToken( ) );
	    switch( y )
	    {
	    	case "pokemon":
	    		Pokemon x = this.deletePokemon( a );
	        	if( x == null ) 
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Borrado del pokemon exitoso" );
	        	break;
	        case "entrenador":
	        	Entrenador x1 = this.deleteEntrenador( a );
	        	if( x1 == null )
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Borrado del entrenador exitoso" );
	        	break;
	        case "medalla":
	        	Medalla x2 = this.deleteMedalla( a );
	        	if( x2 == null )
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Borrado de la medalla exitosa" );
	        	break;
	        default:
	        	System.out.println( "No se reconoce el comando " + y );
	        break;
	     }
	}
	private void info( StringTokenizer h ) 
	{
		String y = h.nextToken( );	     
	    int a = Integer.valueOf( h.nextToken( ) );
	    switch( y )
	    {
	    	case "pokemon":
	    		Pokemon x=this.buscarPokemon(a);
	        	if( x == null )
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Datos del pokemon: \nDueño: "+this.buscarEntrenadorPorPokemon(a).getId()+"\n"+x.toString() );
	        	break;
	        case "entrenador":
	        	Entrenador x1 = this.buscarEntrenador( a );
	        	if( x1 == null )
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Datos del entrenador: \n" + x1.toString( ) );
	        	break;
	        case "medalla":
	        	Medalla x2 = this.buscarMedalla( a );
	        	if( x2 == null )
	        	{
	        		System.out.println( "id no existe" );
                    return;	        	
	        	}
	        	System.out.println( "Datos de la medalla: \n" + x2.toString( ) );
	        	break;
	        default:
	        	System.out.println( "No se reconoce el comando " + y );
	        break;
	     }
	}
	public void accion( String a )
	{
		StringTokenizer h = new StringTokenizer(a," ");
		String y = h.nextToken( );
		
		switch( y )
		{
			case "print":
				this.print( h );
		    	break;
			case "last":
				this.printLastTenRegisters(h);
				break;
		    case "create":
		    	this.create( h );
		    	break;
		    case "uplevel":
		    	this.uplevel( h );
		    	break;	
		    case "change":
		    	this.change( h );
		    	break;		  
		    case "delete":
		    	this.delete( h );
		    	break;
		    case "info":
		    	this.info( h );
		    	break;
		    default:
		    	System.out.println( "no se reconoce el comando: " + y );
		    	break;
		}		
	}
	public Entrenador buscarEntrenador( int id )
	{
		for( Entrenador x:couch )
		{
			if( x.getId( ) == id )
				return x;
		}
		return null;
	}
	public Entrenador deleteEntrenador( int id )
	{
		int i=0;
		for( Entrenador x:couch )
		{
			if( x.getId( ) == id )
				return couch.remove( i );
		    i++;
		}
		return null;
	}
	public Medalla buscarMedalla( int id )
	{
		for( Entrenador x:couch )
			for( Medalla y:x.getMedallas( ) )
				if( y.getId( ) == id )
					return y;
		return null;
	}
	public Medalla deleteMedalla( int id ) 
	{
		for( Entrenador x:couch )
		{
			int i=0;
			for( Medalla y:x.getMedallas( ) )
			{
				if( y.getId( ) == id )
				{
					return x.getMedallas().remove(i);					
				}
				i++;
		    }
		}	
		return null;
	}
	public Entrenador buscarEntrenadorPorPokemon( int id )
	{
		for( Entrenador x:couch )
			for( Pokemon y:x.getPokemons( ) )
				if( y.getId( ) == id )
					return x;
		return null;
	}
	public Pokemon buscarPokemon( int id )
	{
		for( Entrenador x:couch )
			for( Pokemon y:x.getPokemons( ) )
				if( y.getId( ) == id )
					return y;
		return null;
	}
	public Pokemon deletePokemon( int id )
	{
		for( Entrenador x:couch )
		{
			int i=0;
			for( Pokemon y:x.getPokemons( ) )
			{
				if( y.getId( ) == id )
				{
					return x.getPokemons().remove(i);					
				}
				i++;
		    }
		}	
		return null;
	}
	public int getIdEntrenadores( ) 
	{
		return idEntrenadores;
	}
	public void setIdEntrenadores(int idEntrenadores) 
	{
		this.idEntrenadores = idEntrenadores;
	}
	public int getIdPokemon( ) 
	{
		return idPokemon;
	}
	public void setIdPokemon( int idPokemon )
	{
		this.idPokemon = idPokemon;
	}
	public Chain<Entrenador> getCouch( ) 
	{
		return couch;
	}
	public void setCouch( Chain<Entrenador> couch ) 
	{
		this.couch = couch;
	}
	public void save( )
	{
		try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "unal.dat" ) ); )
		{			
			oos.writeObject( this.couch );
			oos.writeInt( this.idEntrenadores );
			oos.writeInt( this.idPokemon );
			oos.writeInt( this.idmedallas );
		} 
		catch( FileNotFoundException e ) 
		{
			System.out.println( "no se encontro el archivo" );
			e.printStackTrace( );
		} 
		catch( IOException e ) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings( "unchecked" )
	public void read( ) throws ClassNotFoundException
	{ 
		try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "unal.dat" ) ); )
		{
			this.couch = ( Chain<Entrenador> ) ois.readObject( ); 
			this.idEntrenadores = ois.readInt( ); 
			this.idPokemon = ois.readInt( ); 
			this.idmedallas = ois.readInt( ); 
		}
		catch ( FileNotFoundException e ) 
		{
			this.idEntrenadores=1; 
			this.idPokemon=1; 
			this.idmedallas=1; 
			this.couch=new Chain<Entrenador>(); 
			this.save(); 
			return; 
		}
		catch ( IOException e ) 
		{ 
			// TODO Auto-generated catch block 
			e.printStackTrace( ); 
		} 
	}
    public Entrenadores( int a )
    {
    	this.idEntrenadores = 1;
    	this.idPokemon = 1;
    	this.idmedallas = 1;
    	this.couch = new Chain<Entrenador>( );
    	this.save( );
    }
    public Entrenadores()
    {
		try 
		{
			this.read( );
		} 
		catch ( ClassNotFoundException e ) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace( );
		}
    }
    
	public static void main(String[] args) 
	{
		Entrenadores couch = new Entrenadores();
	    Scanner x=new Scanner(System.in);
	    String y=new String();
	    System.out.println("-----------MAIN MENU--------");
	    System.out.println("\nWelcome to Pokemon World");
	    System.out.println("Please enter one of the following commands: ");
	    System.out.println("create pokemon *  --> create a Pokemon and prompt for each field information");
	    System.out.println("create pokemon [idEntrenador] [namePokemon] [level] [type] --> create a pokemon with a given information");
	    System.out.println("create entrenador *  --> create an Entrenador and prompt for each field information");
	    System.out.println("create entrenador [name] [sex] [age] --> create an Entrenador with a given information");
	    System.out.println("create medalla *  --> create a Medalla and prompt for each field information");
	    System.out.println("create medalla [idEntrenador] [nameMedalla] [nameLiga] --> create a Medalla with a given information");	    
        System.out.println("delete pokemon [id] --> delete a pokemon by id");
        System.out.println("delete entrenador [id] --> delete a entrenador by id");
        System.out.println("delete medalla [id] --> delete a medalla by id");
        System.out.println("uplevel [idpokemon] --> increases the level of the Pokemon identified by id");
        System.out.println("change pokemon [idpokemon] [idpokemon] --> exchanged Pokemon between coaches identified by id");
        System.out.println("change info pokemon [id] --> changed pokemon information identified by id");
        System.out.println("change info entrendador [id] --> changed entrenador information identified by id");
        System.out.println("print --> print information in pokedex");
        System.out.println("last registers print --> print last 10 registers information in pokedex");
        System.out.println("quit --> save information and quit \n\n");
  
	    while(!y.equals("quit"))
	    {
	    	System.out.print("PokemonWorld>");  	   
	    	y=x.nextLine();
	    	if(!y.equals("quit"))
	    	{
	    		couch.accion(y);    		   
	    	}
	    	x.reset();
	    }
	    System.out.println("\n\nSaving data file to unal.dat and quit PokeDex ... done!");
	    System.out.println("Good Bye!");
	    x.close();
	    couch.save();
	}
}

final class Entrenador implements Comparable<Entrenador>, Serializable
{
   	private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String genero;
    private int edad;
    private Chain<Medalla> medallas;
    private Chain<Pokemon> pokemons;
        
    @Override
    public int compareTo( Entrenador b ) 
    {
      	return 0;
    }
    public int getId( ) 
    {
       	return id;
    }
    public void setId( int id )
    {
       	this.id = id;
    }
    public String getNombre( ) 
    {
      	return nombre;
    }
    public void setNombre( String nombre )
    {
      	this.nombre = nombre;
    }
    public String getGenero( ) 
    {
      	return genero;
    }
    public void setGenero( String genero ) 
    {
      	this.genero = genero;
    }
    public int getEdad( ) 
    {
     	return edad;
    }
    public void setEdad( int edad ) 
    {
      	this.edad = edad;
    }
    public Chain<Medalla> getMedallas( ) 
    {
      	return medallas;
    }
    public void setMedallas( Chain<Medalla> medallas ) 
    {
      	this.medallas = medallas;
    }
    public Chain<Pokemon> getPokemons( ) 
    {
      	return pokemons;
    }
    public void setPokemons( Chain<Pokemon> pokemons )
    {
      	this.pokemons = pokemons;
    }
    @Override
    public String toString( )
    {
      	return "Coach [id=" + id + ", name=" + nombre + ", sex="
				+ genero + ", age=" + edad + ", medals=" + medallas.size
 				+ ", pokemons=" + pokemons.size + "]";
    }
    public Entrenador( int id, String nombre, String genero, int edad )
    {
       	super( );
      	this.id = id;
       	this.nombre = nombre;
       	this.genero = genero;
       	this.edad = edad;
       	this.medallas = new Chain<Medalla>( );
       	this.pokemons = new Chain<Pokemon>( );
    }    
}
    
final class Pokemon implements Serializable
{
   	private static final long serialVersionUID = 1L;
   	private int id;
   	private String nombre;
    private int nivel;
    private String tipo;
        
    public void subirNivel( )
    {
       	if( nivel < 100 )
       		nivel++;
    }
  	public int getId( ) 
   	{
   		return id;
   	}
   	public void setId( int id ) 
   	{
   		this.id = id;
   	}
   	public String getNombre( )
   	{
   		return nombre;
   	}
   	public void setNombre( String nombre )
   	{
   		this.nombre = nombre;
   	}
   	public int getNivel( )
   	{
   		return nivel;
   	}
   	public void setNivel( int nivel ) 
   	{
   		this.nivel = nivel;
   	}
   	public String getTipo( ) 
   	{
   		return tipo;
   	}
   	public void setTipo( String tipo ) 
   	{
   		this.tipo = tipo;
   	}
   	@Override
   	public String toString( ) 
   	{
   		return "Pokemon [id=" + id + ", name=" + nombre + ", level=" + nivel
   				+ ", type=" + tipo + "]";
   	}
   	public Pokemon( int id, String nombre, int nivel, String tipo )
   	{
   		super( );
   		this.id = id;
   		this.nombre = nombre;
   		this.nivel = nivel;
   		this.tipo = tipo;
   	}
}

final class Medalla implements Serializable
{
   	private static final long serialVersionUID = 1L;
   	private int id;
   	private String nombre;
   	private String liga;
    
   	public int getId( ) 
   	{
   		return id;
   	}
   	public void setId( int id )
   	{
   		this.id = id;
   	}
   	public String getNombre( )
   	{
   		return nombre;
   	}
   	public void setNombre( String nombre )
   	{
   		this.nombre = nombre;
   	}
   	public String getLiga( )
   	{
   		return liga;
   	}
   	public void setLiga( String liga )
   	{
   		this.liga = liga;
   	}
   	@Override
   	public String toString( )
   	{
   		return "Medal [name=" + nombre + ", league=" + liga + "]";
   	}
   	public Medalla( int id, String nombre, String liga )
   	{
   		super( );
   		this.id = id;
   		this.nombre = nombre;
   		this.liga = liga;
   	}
}