package ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       Double num;
       System.out.println("Ingrese el numero");
       num= teclado.nextDouble();
       if ( num % 2 == 0){
           System.out.println("El numero es par");
       }
       else{
           System.out.println("El numero es impar");
       }
    }
    
}
