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
public class Ejercicioextra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double num1;
        double num2;
        double resto = 0;
        System.out.println("Ingrese el primer y segundo numero");
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        do{
            num1 = num1 -num2;
            resto = resto + 1;
        }while(num1>= num2);
        System.out.println(" El residuo de las restas sucesivas es " +num1);
        System.out.println(" El cociente de las restas sucesivas es "+resto);
    }
    
}
