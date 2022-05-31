/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random R = new Random();
        int[] vector = new int [20];
        int i;
        int num;
        int cont;
        cont = 0;
        for (i = 0; i < 20; i++) {
            vector[i] = R.nextInt(20);
            System.out.println("arreglo"+ i+ "=" +vector[i]);
        }
        System.out.println("Ingrese el numero a buscar");
        num = teclado.nextInt();
        for(i = 0; i < 20; i++ ){
               if(vector[i] == num){
                   cont = cont + 1;
                   System.out.println(" El numero se encuentra en el arreglo "+i);
               }
           } 
         if(cont > 1){
                   System.out.println(" El numero se repitio " +cont+ " veces " );
               }
               if(cont == 0){
                   System.out.println("No se repitio el numero");
               }
    }
    
}
