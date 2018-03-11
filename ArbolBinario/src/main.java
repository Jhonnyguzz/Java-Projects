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
public class main {
    
   
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        ArbolBinario2 ab = new ArbolBinario2();
        
        ab.insertar();
      
        while(true)
        {
        	System.out.println("ingrese nodo a buscar peso");
        	int a=leer.nextInt();
        
        	System.out.println("nodo con peso "+ (ab.contar(a)-1));
        }
   }
}   
