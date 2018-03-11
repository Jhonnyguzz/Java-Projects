import java.io.Serializable;

/** Node class used by linked structures.
 * This class and its fields are
 * visible only within the package dataStructures. */



class ChainNode<T> implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// package visible fields
   T element;
   ChainNode<T> next;

   // package visible constructors
   ChainNode( )
   {
      this( null, null );
   }

   ChainNode( T element )
   {
      this( element, null );
   }

   ChainNode( T element, ChainNode<T> next )
   {
      this.element = element;
      this.next = next;
   }
}