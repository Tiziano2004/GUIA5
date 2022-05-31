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
public class Ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int aux;
        System.out.println("Ingresar los numeros de las 4 variables");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        System.out.println(" Los valores inciiales de las variables son "+A+ "," +B+ "," +C+ "," +D);
        aux = B;
        B = C;
        C =A;
        A =D;
        D = aux;
        System.out.println(" Los valores finales de las variables son "+A+ "," +B+ "," +C+ "," +D);
               
    }
    
}
