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
public class Ejercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nombre; 
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println(" El nombre introducido es " + nombre);
       
    }
    
}
