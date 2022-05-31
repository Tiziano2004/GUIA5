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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      String palabra;
      String letra;
        System.out.println("Ingrese su palabra");
        palabra = teclado.nextLine();
        letra = palabra.substring(0, 0);
        if (palabra.substring(0,0).equals(letra)){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        } 
         
    }
    
}
