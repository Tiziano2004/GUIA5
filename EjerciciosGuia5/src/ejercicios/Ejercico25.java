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
public class Ejercico25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random R = new Random();
        int sumaf1,sumaf2,sumaf3,sumac1,sumac2,sumac3,sumad1,sumad2;
        int[][] matriz = new int [3][3];
       int i;
       int j;
       int num = 0; 
       int indice;
      int indice2 = 2;
       sumaf1 = 0;
        sumaf2 = 0;
        sumaf3 = 0;
        sumac1 = 0;
        sumac2 = 0;
        sumac3 = 0;
        sumad1 = 0;
        sumad2 = 0;
        for (i = 0; i<3; i++){
            for (j = 0; j<3; j++){
                num=teclado.nextInt();
                matriz[i][j] = num;
            }
        }
            for (j = 0; j<3; j++){
                sumaf1 = sumaf1 + matriz[0][j];
                sumaf2 = sumaf2 + matriz[1][j];
                sumaf3 = sumaf3 + matriz[2][j];
            }
            for (i = 0; i<3; i++){
                sumac1 = sumac1 + matriz[i][0];
                sumac2 = sumac2 + matriz[i][1];
                sumac3 = sumac3 + matriz[i][2];
        }
            for (indice = 0; indice<3; indice++){
                sumad1 = sumad1 + matriz[indice][indice];
        }
            for (j = 0; j<3; j++){
                sumad2 = sumad2 + matriz[j][indice2];
                indice2 = indice2 - 1;
        }
            if (sumaf1 == 15 && sumaf2 == 15 && sumaf3 == 15 && sumac1 == 15 && sumac2 == 15 && sumac3 == 15 && sumad1 == 15 && sumad2 ==15){
            System.out.println("Es una matriz magica");
        } else{
                System.out.println("No es una matriz magica");
            }    
    }
    
}
