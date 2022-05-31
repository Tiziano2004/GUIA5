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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        System.out.print("Ingrese el numero");
        num = teclado.nextInt();
        if (num >= 0 && num <=50){
            for(int i=0 ; i < num ; i++){
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < num-2; i++){
                System.out.print("*");
                for (int j = 0; j <num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for(int i=0 ; i < num ; i++){
                System.out.print("*");
        }
        }
    }
    
}
