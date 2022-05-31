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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       String palabra;
       int num1;
       int num2;
       int i; 
       double suma;
       double resta;
       double multi;
      double dividir;
       i = 1;
       System.out.println("Ingrese dos numeros positivos");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        do {
            System.out.println("Ingrese la opcion a ejecutar, opciones disponibles: Sumar, Restar,Multiplicar,Dividir,Salir");
            palabra = teclado.nextLine();
            switch (palabra){
                case "Sumar":
                   suma = num1 + num2;
                    System.out.println(suma);
                   continue;
                case "Restar":
                    resta = num1 - num2;
                    System.out.println(resta);
                    continue;
                case "Multiplicar":
                    multi = num1 * num2;
                    System.out.println(multi);
                    continue;
                case "Dividir":
                    dividir = num1 / num2;
                    System.out.println(dividir);
                    continue;
                case "Salir":
                    System.out.println("¿Esta seguro que desea salir del programa?");
                    palabra = teclado.nextLine();
                    switch (palabra){
                        case "Si":
                            i = 0;
                        case "No":
                            System.out.println("Volviendo a mostrar las opciones");
                        default:
                            System.out.println("La opcion introducida no existe");
                    }
                default:
                    System.out.println("La opcion intoducida no existe");
            }
        } while(i == 1);
    }
    
}
