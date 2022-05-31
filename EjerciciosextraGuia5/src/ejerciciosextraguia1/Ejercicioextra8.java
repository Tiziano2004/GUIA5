/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextraguia1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicioextra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double numeros = 0;
        int contador = 0;
        int contador1 = 0;
        int contador2 = 0;
        System.out.println("Ingrese los numeros");
        do{
            numeros = leer.nextDouble();
            contador = contador + 1;
            if(numeros%2 == 0){
                contador1 = contador1 + 1;
            }else{
                contador2 = contador2 + 1;
            }
        }while(numeros%5 != 0);
        System.out.println(" La cantidad de numeros ingresados fue "+contador);
        System.out.println(" La cantidad de numeros pares ingresados fue "+contador1);
        System.out.println(" La cantidad de numeros impares ingresados fue "+contador2);
    }
    
}
