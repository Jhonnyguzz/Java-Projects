package unal.datastructures;

import java.lang.reflect.Method;

@SuppressWarnings("rawtypes")
public class ABT<T> implements BinaryTree{

	private T[] arbol;

	public ABT(T[] origin) {
		for(int i=0;i<origin.length;i++){
			arbol[i]=origin[i];
		}
	}
	@SuppressWarnings("unchecked")
	public ABT() {
		this.arbol=(T[])new Comparable[20];
	}
	@Override
	public boolean isEmpty() {		
		return (arbol[0]==null)?true:false;
	}
	@Override
	public T root() {		
		return arbol[0];
	}
	private int buscarPadre(T[] orign,T t){
		for(int i=1;i<orign.length;i++)
			if(orign[i]==t)return i;
		return -1;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public void makeTree(Object root, BinaryTree left, BinaryTree right) {
		 
		 T[] lef=null;
		 if(left!=null)
		    lef=((ABT<T>)left).arbol;
		 
		 T[] rig=null;
		 if(right!=null)
		    rig=((ABT<T>)right).arbol;
		 
		 this.arbol[1]=(T)root;		 
		 if(lef!=null)this.arbol[2]=lef[1];
		 if(rig!=null)this.arbol[3]=rig[2];
		 
		 if(left!=null)
		 for(int i=2;i<lef.length;i++){
			 if(lef[i]!=null){
				 int a=buscarPadre(this.arbol,lef[i/2]);
				 if(i%2==0){
				    this.arbol[a*2]=lef[i];				 
				    this.arbol[a*2+1]=lef[i+1];
				    i++;
				 }else{
					this.arbol[a*2+1]=lef[i]; 
				 }   
			 }
		 }
		 if(right!=null)
		 for(int i=2;i<rig.length;i++){
			 if(rig[i]!=null){
				 int a=buscarPadre(this.arbol,rig[i/2]);
				 if(i%2==0){
				    this.arbol[a*2]=lef[i];				 
				    this.arbol[a*2+1]=lef[i+1];
				    i++;
				 }else{
					this.arbol[a*2+1]=lef[i]; 
				 }   
			 }
		 }	 
	}

	@SuppressWarnings("unchecked")
	@Override
	public BinaryTree removeLeftSubtree() {
		T[] origin=(T[])new Comparable[20];
		origin[1]=this.arbol[2];
		
		for(int i=4;i<this.arbol.length;i++){
		     if(this.arbol[i]!=null){
		    	 int a=this.buscarPadre(arbol,this.arbol[i]);
		    	 int b=this.buscarPadre(origin,this.arbol[a/2]);
		    	 if(a!=-1&&b!=-1){
		    		 if(i%2==0){
		    			 origin[b*2]=this.arbol[i];
		    			 origin[b*2+1]=this.arbol[i+1];
		    			 i++;
		    		 }
		    		 else{
		    			 origin[b*2+1]=this.arbol[i];
		    		 }
		    	 }
		     }
		}
		for(int i=0,n=0;i<this.arbol.length;i++){
			 if(this.arbol[i]==origin[n]){
				 this.arbol[i]=null;
				 n++;
			 }
		}
		return new ABT(origin);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BinaryTree removeRightSubtree() {
		T[] origin=(T[])new Comparable[20];
		origin[1]=this.arbol[3];
		
		for(int i=4;i<this.arbol.length;i++){
		     if(this.arbol[i]!=null){
		    	 int a=this.buscarPadre(arbol,this.arbol[i]);
		    	 int b=this.buscarPadre(origin,this.arbol[a/2]);
		    	 if(a!=-1&&b!=-1){
		    		 if(i%2==0){
		    			 origin[b*2]=this.arbol[i];
		    			 origin[b*2+1]=this.arbol[i+1];
		    			 i++;
		    		 }
		    		 else{
		    			 origin[b*2+1]=this.arbol[i];
		    		 }
		    	 }
		     }
		}
		for(int i=0,n=0;i<this.arbol.length;i++){
			 if(this.arbol[i]==origin[n]){
				 this.arbol[i]=null;
				 n++;
			 }
		}
		return new ABT(origin);
	}

	@Override
	public void preOrder(Method visit) {		
	}
	private void thePreOrder(int pos){
		if(pos<this.arbol.length&&this.arbol[pos]!=null){
			System.out.print(this.arbol[pos]+" ");
		    thePreOrder(pos*2);
		    thePreOrder(pos+1);
		}		
	}
	public void preOrderOutput(){		
		this.thePreOrder(1);
		
	}

	@Override
	public void inOrder(Method visit) {		
	}
	private void theInOrder(int pos){
		if(pos<this.arbol.length&&this.arbol[pos]!=null){			
		    theInOrder(pos*2);
		    System.out.print(this.arbol[pos]+" ");
		    theInOrder(pos+1);
		}		
	}
	public void inOrderOutput(){		
		this.theInOrder(1);
	    
	}
	
	@Override
	public void postOrder(Method visit) {
		// TODO Auto-generated method stub
		
	}
	private void thePostOrder(int pos){
		if(pos<this.arbol.length&&this.arbol[pos]!=null){			
		    thePostOrder(pos*2);
		    System.out.print(this.arbol[pos]+" ");
		    thePostOrder(pos+1);
		}		
	}
	public void postOrderOutput(){		
		this.thePostOrder(1);
	
	}
	@Override
	public void levelOrder(Method visit) {
		// TODO Auto-generated method stub
		
	}	
	public void levelOrderOutput() {
		for(int i=1;i<this.arbol.length;i++){
			if(this.arbol[i]!=null)
				System.out.print(this.arbol[i]+" ");
		}
		
	}
	private int height() {
		if(this.arbol[1]==null)return 0;
		for(int i=this.arbol.length-1;i>1;i--){
			if(this.arbol[i]!=null)return i/2;
		}
		return 0;
	}
	private int size() {
		int cont=0;
		for(int i=1;i<this.arbol.length;i++)if(this.arbol[i]!=null)cont++;
		return cont;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABT<Integer> a = new ABT<>( ),
		         x = new ABT<>( ),
		         y = new ABT<>( ),
		         z = new ABT<>( );
		      y.makeTree( new Integer( 1 ), null, null );
		      z.makeTree( new Integer( 2 ), null, null );
		      x.makeTree( new Integer( 3 ), y, z );
		      y.makeTree( new Integer( 4 ), x, a );

		      System.out.println( "Preorder sequence is " );
		      y.preOrderOutput( );
		      System.out.println( );

		      System.out.println( "Inorder sequence is " );
		      y.inOrderOutput( );
		      System.out.println( );

		      System.out.println( "Postorder sequence is " );
		      y.postOrderOutput( );
		      System.out.println( );

		      System.out.println( "Level order sequence is " );
		      y.levelOrderOutput( );
		      System.out.println( );

		      System.out.println( "Number of nodes = " + y.size( ) );

		      System.out.println( "Height = " + y.height( ) );
	}


}
