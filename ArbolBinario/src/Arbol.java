import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        nodo raiz = null;
        String line;
        
        while((line = sc.nextLine()) != null)
        {
            char c = line.charAt(0);
            
            if(c == 'a') //agregar
            {
               int n = new Integer(line.split(" ")[1]); 
               
               if(raiz == null)
                   raiz = new nodo(n);
               else
               {
                   raiz.insertar(n);
               }
            }
            
            else if(c == 'p') //imprimir
            {
                inorden(raiz);
                System.out.println(" ");
                
                
                System.out.println("peso del arbol desde raiz");
                System.out.println(contar(raiz)-1);
                
            }
        }
        
        
        
    }
    
    static void inorden(nodo raiz)
    {
        if(raiz == null)
        {
            return;
        }
        else
            
            
        {
            System.out.print(raiz.num);
            inorden(raiz.izq);
            inorden(raiz.der);
        }
    }

    static int contar(nodo n)
    {

    if(n == null) return 0;
    int c1 = contar(n.izq);
    int c2 = contar(n.der);
    int c3 = c1 + c2 + 1;

    return c3;

    }
    
}

class nodo
{
    int num;
    nodo izq;
    nodo der;
    
    public nodo(int n)
    {
        num = n;
    }
    
    
    void insertar(int n)
    {
        if( n < num)  
        {
            if( izq == null )
                izq = new nodo(n);
            else
                izq.insertar(n);  
        }
        
        else if (n > num)
        {
            if(der == null)
                der = new nodo(n);
            else
                der.insertar(n);
        }
    }
    
 
}