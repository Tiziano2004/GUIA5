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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       Double num1,num2;
       System.out.println("Ingrese el primer y segundo numero");
       num1= teclado.nextDouble();
       num2=teclado.nextDouble();
       if (num1>num2){
         System.out.println(" El numero mayor es "+ num1);
       }
       else if (num2>num1 ){
           System.out.println(" El numero mayor es "+ num2);
       }
    }
}
