/** interface for linear lists */

package lessons;

public interface LinearList<T>
{
   boolean isEmpty( );
   int size( );
   T get( int index );
   int indexOf( T theElement );
   T remove( int index );
   void add( int index, T theElement );
   String toString( );
}
