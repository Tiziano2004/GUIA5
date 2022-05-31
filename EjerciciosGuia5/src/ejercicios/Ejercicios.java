/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2,resultado;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = teclado.nextDouble();
        resultado = num1+num2;
        System.out.println("La suma de los numeros es"+"\n"+resultado);
     }
    }
    
