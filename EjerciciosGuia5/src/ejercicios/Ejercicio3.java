/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       String palabra1;
       String palabra2;
       System.out.println("Ingrese una palabra en minuscula");
       palabra1=teclado.nextLine();
       System.out.println(palabra1.toUpperCase());
       System.out.println("Ingrese una palabra en mayuscula");
       palabra2=teclado.nextLine();
       System.out.println(palabra2.toLowerCase());
    }
    
}
