package classprogram;

import lessons.ArrayLinearList;

class TiramisusPro{
   public static void main( String ... args ){
      Integer lola = new Integer(8);
      ArrayLinearList<Integer> definitiva = new ArrayLinearList<>( );
      ArrayLinearList<Integer> df = definitiva;
      definitiva.add( 0, 5 );
      definitiva.add( 0, 5 );
      definitiva.add( 0, 5 );
      definitiva.add( 0, 5 );
      definitiva.add( 0, 5 );
      definitiva.add( 0, 222 );
      definitiva.add( 0, new Integer(7) );
      definitiva.add( 0, 1 );
      definitiva.add( 0, 0 );
      System.out.println( lola );
      System.out.println( definitiva );
      try{
         df.remove( 2 );
      }
      catch( Exception e ){
         //e.printStackTrace( );
         //System.out.println( e );
      }
      System.out.println( definitiva );
      System.out.println( df.indexOf( 222 ) );
      int suma = 0;
      for( int i = 0; i < df.size( ); i++)
         suma += df.get( i );
      System.out.println( df + " suma = " + suma ); // thank you
      for( int j = 0; j < 200; j++ )
         suma -= df.indexOf( j );
      System.out.println( "mi suma otra vez : " + suma );
   }
}
