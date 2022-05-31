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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       String palabra;
       double num;
        System.out.println("Ingrese una palabra");
        palabra = teclado.nextLine();
        num = palabra.length();
        if (num == 8){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
    }
    
}
