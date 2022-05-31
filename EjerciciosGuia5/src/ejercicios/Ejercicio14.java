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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int num;
       double suma;
       suma = 0;
       for(int i=0; i<=20; i++){
           System.out.println("Ingrese un numero");
           num = teclado.nextInt();
           if (num<0){
               continue;
           }
           suma = suma + num;
           if (num == 0){
               System.out.println("Se capturo el numero cero");
               System.out.println("La suma de los numero es"+ suma);
               break;
           }
       }
        System.out.println("La suma de los numero es"+ suma);
    }
    
}
