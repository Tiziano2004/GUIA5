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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random R = new Random();
        int [][] matrizgrande = new int [10][10];
        int [][]matrizchiquita = new int [3][3];
        int i;
        int j;
        int ini = 0;
        int ini2 = 0;
        boolean s = false;
        for (i = 0; i<10; i++){
            for (j = 0; j<10; j++){
             matrizgrande[i][j] = R.nextInt(100);  
            }
        }
         for (i = 0; i<10; i++){
            for (j = 0; j<10; j++){
             matrizgrande[4][4] = 36;
             matrizgrande[4][5] = 5;
             matrizgrande[4][6] = 67;
             matrizgrande[5][4] = 89;
             matrizgrande[5][5] = 90;
             matrizgrande[5][6] = 75;
             matrizgrande[6][4] = 14;
             matrizgrande[6][5] = 22;
             matrizgrande[6][6] = 26;
            }
        }
          for (i = 0; i<3; i++){
            for (j = 0; j<3; j++){
             matrizchiquita[0][0] = 36;
             matrizchiquita[0][1] = 5;
             matrizchiquita[0][2] = 67;
             matrizchiquita[1][0] = 89;
             matrizchiquita[1][1] = 90;
             matrizchiquita[1][2] = 75;
             matrizchiquita[2][0] = 14;
             matrizchiquita[2][1] = 22;
             matrizchiquita[2][2] = 26;
            }
        }
          for (i = 0; i<10; i++){
            for (j = 0; j<10; j++){
                if(matrizgrande[i][j] == matrizchiquita[0][0]){
                    ini = i;
                    ini2 = j;
                    if(matrizgrande[i][j+1] == matrizchiquita[0][1]){
                        if(matrizgrande[i][j+1] == matrizchiquita[0][2]){
                            if(matrizgrande[i+1][j-2] == matrizchiquita[1][0]){
                                if(matrizgrande[i][j+1] == matrizchiquita[1][1]){
                                    if(matrizgrande[i][j+1] == matrizchiquita[1][2]){
                                        if(matrizgrande[i+1][j-2] == matrizchiquita[2][0]){
                                            if(matrizgrande[i][j+1] == matrizchiquita[2][1]){
                                                if(matrizgrande[i][j+1] == matrizchiquita[2][2]){
                                                    s = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
            }
        }
          if(s = true){
              System.out.println(" La matriz se encontro en la fila "+ini+" y la columna "+ini2);
          }
    }
    
}
