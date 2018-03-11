/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ArbolBinario2 {

    class nodo
    {
        int info;
        nodo izq, der;
    }
    
    nodo raiz;
    
    public ArbolBinario2()
    {
        raiz = null;
    }
    
    
    public void insertar(int info)
    {
        nodo nuevo = new nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        
        if(raiz == null)
            raiz = nuevo;
        else
        {
            nodo anterior = null , reco;
            reco = raiz;
            while(reco != null)
                    {
                      anterior = reco;
                      if(info < reco.info)
                          reco = reco.izq;
                      else
                          reco = reco.der;
                        
                    }
            
            if(info < anterior.info)
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }
    }
    
    public void insertar()
    {
        Scanner Leer = new Scanner(System.in);
        int can;
        int num;
        System.out.println("Ingrese la cantidad de nodos");
        can = Leer.nextInt();
        
        for (int i = 0; i < can; i++)
                {
                    System.out.print("Ingrese nodo " + (i+1) + "Â¨:");
                    num = Leer.nextInt();
                    insertar(num);
                }
    }
    
    //método que busca el nodo deseado
    public nodo buscarNodo(nodo n, int num)
    {
    		// busca el valor clave dentro del arbol
    		if( n == null)
    		    System.out.println("No se encuentra");
    		else{
    		    
    		    if (num == n.info)
    		    {
    		    	System.out.println("find!");
    		    	return n;
    		    }
    		    else if (num < n.info)
    		    {
    		        //lado izquierdo
    		        return buscarNodo(n.izq, num);
    		    }
    		    else
    		    {
    			    //lado derecho
    				return buscarNodo(n.der, num);
    		    }
    		}
    		System.out.println("fail");
			return null;
    }
    
    //metodo que cuenta el peso del nodo
    public int contar(int num)
    {

    //después de buscar el nodo deseado lo paso como parámetro al método contar2 
    int cant = contar2(buscarNodo(this.raiz,num));
    return cant;
    }

    //el método contar2 cuenta los nodos restantes a partir de un nodo dado
    private int contar2(nodo n)
    {

    if(n == null) return 0;
    int c1 = contar2(n.izq);
    int c2 = contar2(n.der);
    int c3 = c1 + c2 + 1;

    return c3;

    }
    
}


