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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;
        String resul;
        System.out.println("Ingrese la cantidad de euros");
        num = teclado.nextDouble();
        resul = cambio(num);
        System.out.println(resul);
    }   
    public static String cambio(double num) {
            Scanner teclado = new Scanner(System.in);
            String dinero;
            double resultado = 0 ;
            String fina = null;
            System.out.println("Ingrese el tipo de dinero");
            dinero = teclado.nextLine();
            switch (dinero){
                case "Libras":
                    resultado = num * 0.84;
                    fina = num+ " libras son " +resultado+ " euros ";
                case "Dolares":
                    resultado = num * 1.10;
                    fina = num+ " libras son " +resultado+ " euros ";
                case "Yenes":
                    resultado = num * 134.74;
                    fina = num+ " libras son " +resultado+ " euros ";
                   
            }
        return (String) fina;    
        }
    
}
