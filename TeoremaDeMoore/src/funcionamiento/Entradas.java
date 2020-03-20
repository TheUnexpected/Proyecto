/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionamiento;

import java.util.Scanner;

/**
 *
 * @author Andy y Monca 4 ever
 */
public class Entradas {
    //Datos entrada a1
    int l;
    String [] lenguaje;
    int e;
   String [] estados;
   String entrada;
   int f;
   String [] finales;
   int t;        
   String [][][] transicion;
   //Datos entrada a2
    int l2;
    String [] lenguaje2;
    int e2;
   String [] estados2;
   String entrada2;
   int f2;
   String [] finales2;
   int t2;        
   String [][][] transicion2;
   
  
   
   public void Datos() {
       Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese los datos de su primer automata");
       System.out.println("Ingrese cuantos simbolos tiene su lenguaje");
       l=leer.nextInt();
       lenguaje = new String[l];
       System.out.println("Ingrese los simbolos de su lenguaje");
       for (int i = 0; i < lenguaje.length ; i++) {
           System.out.println("posicion "+(i+1));
           lenguaje[i]=leer.next();
       }
       
       System.out.println("Ingrese cuantos estados tiene su AFD");
       e=leer.nextInt();
       estados = new String[e];
       System.out.println("Ingrese los estados de su AFD");
       for (int i = 0; i < estados.length; i++) {
           System.out.println("posicion "+(i+1));
           estados[i]=leer.next();
       }
       
       System.out.println("Ingrese estado inicial");
       entrada=leer.next();
            
       System.out.println("Ingrese cuantos estados finales tiene su AFD");
        f=leer.nextInt();
        finales =new String[f];
       System.out.println("Ingrese los estados finales de su AFD");
       for (int i = 0; i <finales.length; i++) {
           System.out.println("posicion "+(i+1));
           finales[i]=leer.next();
       }
       
       t=l*e;
          transicion = new String [t][3][1];
       System.out.println("Ingrese las transiciones de su AFD");
       for (int i = 0; i < transicion.length; i++) {
           for (int j = 0; j < transicion[i].length; j++) {
               for (int k = 0; k < transicion[i][j].length; k++) {
                   System.out.println("Ingrese posicion "+(i+1)+(j+1)+(k+1));
                   transicion[i][j][k]=leer.next();
               }
           }
       }
       
       //SEGUNDO AUTOMATA
       System.out.println("Ingrese los datos de su segundo automata");
       System.out.println("Ingrese cuantos simbolos tiene su lenguaje");
       l2=leer.nextInt();
       lenguaje2 = new String[l2];
       System.out.println("Ingrese los simbolos de su lenguaje");
       for (int i = 0; i < lenguaje2.length ; i++) {
           System.out.println("posicion "+(i+1));
           lenguaje2[i]=leer.next();
       }
       
       System.out.println("Ingrese cuantos estados tiene su AFD");
       e2=leer.nextInt();
       estados2 = new String[e2];
       System.out.println("Ingrese los estados de su AFD");
       for (int i = 0; i < estados2.length; i++) {
           System.out.println("posicion "+(i+1));
           estados2[i]=leer.next();
       }
       
       System.out.println("Ingrese estado inicial");
       entrada2=leer.next();
            
       System.out.println("Ingrese cuantos estados finales tiene su AFD");
        f2=leer.nextInt();
        finales2 =new String[f2];
       System.out.println("Ingrese los estados finales de su AFD");
       for (int i = 0; i <finales2.length; i++) {
           System.out.println("posicion "+(i+1));
           finales2[i]=leer.next();
       }
       
       t2=l*e2;
          transicion2 = new String [t2][3][1];
       System.out.println("Ingrese las transiciones de su AFD");
       for (int i = 0; i < transicion2.length; i++) {
           for (int j = 0; j < transicion2[i].length; j++) {
               for (int k = 0; k < transicion2[i][j].length; k++) {
                   System.out.println("Ingrese posicion "+(i+1)+(j+1)+(k+1));
                   transicion2[i][j][k]=leer.next();
               }
           }
       }
       
       
}
    
    
          
}
