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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrese las columnas");
        int columnas = teclado.nextInt();
        int matriz[][]= new int [filas][columnas];
        boolean esSimetrica = true;
        for(int i=0; i<filas; i++){
            System.out.println("Humano ingresa los datos de la fila"+(i+1));
            for(int j = 0; j< columnas; j++){
                matriz[i][j]= teclado.nextInt();
            }
        }
        if(columnas == filas){
            for(int i=0; i<filas; i++){
                 for(int j = 0; j< columnas; j++){
                     if(matriz[i][j]!= matriz[j][i]){
                         esSimetrica = false;
                         break;
                     }
                 }
                 if(esSimetrica == false ){
                     break;
                 } 
            }
        }
        else{
            System.out.println("Humano para empezar tu matriz no es simetrica");
        }
        if(esSimetrica == true){
            System.out.println("Humano felicidades tu matriz es simetrica");
        }
        else{
            System.out.println("Nop, no es simetrica");
        }
    }
    
}
