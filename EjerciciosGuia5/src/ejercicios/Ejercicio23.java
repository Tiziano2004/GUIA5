package ejercicios;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random R = new Random();
        int [][] matriz = new int [4][4];
       int i;
       int j;
        for (i = 0; i<4; i++) {
            for(j = 0; j<4; j++){
                matriz[i][j] = R.nextInt(20);
            }
        }
         for (i = 0; i<4; i++) {
            for(j = 0; j<4; j++){
                System.out.print(matriz[i][j]+ " ");
            }
             System.out.println("");
        }
         int aux;
          for (i = 0; i<4; i++) {
            for(j = 0; j<4; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
           for (i = 0; i<4; i++) {
            for(j = 0; j<4; j++){
                System.out.print(matriz[j][i]+ " ");
            }
               System.out.println("");
        }
    }
    
}
