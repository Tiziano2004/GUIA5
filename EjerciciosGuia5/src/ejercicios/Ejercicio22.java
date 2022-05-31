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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador1;
        int medida;
        int i;
        int contador;
        int contador2;
        int contador3;
        int contador4;
        contador = 0;
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        contador4= 0;
        System.out.println("Ingrese la medida del vector");
        medida = teclado.nextInt();
        int[] vector = new int[medida];
        for(i = 0; i< medida-1; i++){
            System.out.println("Ingrese el numero para poner en el vector");
            num = teclado.nextInt();
            vector[i] = num;
            if (num>=0 && num<10){
                contador = contador + 1;    
            }
            if (num>=10 && num<100){
                contador1 = contador1 + 1;
            }
            if(num>=100 && num<1000){
                contador2 = contador2 + 1;
            }
            if (num>=1000 && num<10000){
                contador3 = contador3 + 1;
            }
            if (num>=10000 && num<100000){
                contador4 = contador4 + 1;
            }
        }
        System.out.println(" En el vector hay " +contador+ " de numeros de un solo digito ");
        System.out.println(" En el vector hay " +contador1+ " de numeros de dos digitos ");
        System.out.println(" En el vector hay " +contador2+ " de numeros de un solo digito "); 
        System.out.println(" En el vector hay " +contador3+ " de numeros de un solo digito ");
        System.out.println(" En el vector hay " +contador4+ " de numeros de un solo digito ");
    }
    
}
