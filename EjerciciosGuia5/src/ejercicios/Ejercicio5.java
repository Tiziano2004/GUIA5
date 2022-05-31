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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         double num1,exponente,resultado1,resultado2,exponente2,resultado3;
         System.out.println("Ingrese un numero para realizar su raiz cuadrada");
         num1=teclado.nextDouble();
         resultado1= Math.sqrt(num1);
         System.out.println(" La raiz cuadrada es"+ resultado1);
         exponente=2;
         resultado2=Math.pow(num1, exponente);
         System.out.println("El numero elevado a la 2 da"+ resultado2);
         exponente2=3;
         resultado3=Math.pow(num1,exponente2);
         System.out.println("El numero elevado a la 3 da"+ resultado3);
    }
}
