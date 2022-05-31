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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       Double num1,resultado;
       System.out.println("Ingrese un numero para grados centigrados");
       num1=teclado.nextDouble();
       resultado= 32 + (9 * num1 / 5);
       System.out.println("Los grados Farenheit son"+ resultado);

    }
    
}
