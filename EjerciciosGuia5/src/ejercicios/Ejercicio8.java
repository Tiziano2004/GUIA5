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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String palabra1;
        String palabra2;
        System.out.println("Ingrese la primer y la segunda palabra");
        palabra1 = teclado.nextLine();
        palabra2 = teclado.nextLine();
        if (palabra1.equals(palabra2)){
            System.out.println("Ambas palabras son iguales");
        }
        else {
            System.out.println("Las palabras no son iguales");
        }
        
    }
    
}
