/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner teclado = new Scanner (System.in);
         String palabra;
         int i; 
         int contador;
         int cont;
         int contador1;
         String pal;
         String pal2;
         contador = 0;
         contador1 = 0;
         do {
             System.out.println("Ingrese la palabra");
             palabra = teclado.nextLine();
             cont= palabra.length();
             pal = "x";
             pal2 = "o";
             if(cont == 5 && !palabra.equals("&&&&&")){
                if (palabra.substring(0,1).equals(pal)&& palabra.substring(4,5).equals(pal2)){
                    contador = contador + 1;
                }
                if(!palabra.substring(0,1).equals(pal)|| !palabra.substring(4,5).equals(pal2))
                    contador1 = contador1 + 1;
             }
         } while (!palabra.equals("&&&&&"));
         System.out.println(" El numero de lecturas correctas es "+ contador);
         System.out.println(" El numero de lecturas incorrectas es "+ contador1);
    }
    
}
