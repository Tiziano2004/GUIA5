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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int i;
        System.out.println("Ingrese un numero");
        num= teclado.nextInt();
        System.out.print(num);
        for (i = 0; i<5; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
