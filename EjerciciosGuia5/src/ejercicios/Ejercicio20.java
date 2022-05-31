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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[100];
        int num;
        int i;
        num = 100;
        for (i = 0; i<100; i++){
            vector[i] = num;
            num = num - 1;
            System.out.println("arreglo"+ i+ "=" +vector[i]);
        }
        
    }
    
}
