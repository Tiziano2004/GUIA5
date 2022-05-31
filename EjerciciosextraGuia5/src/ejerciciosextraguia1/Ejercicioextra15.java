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
public class Ejercicioextra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opciones;
        double resultado,num,num1;
        System.out.println("Ingrese los dos numeros");
        num = leer.nextDouble();
        num1 = leer.nextDouble();
        System.out.println("Ingrese la opcion que quiere llevar a cabo, opciones disponibles: Sumar , Restar, Multiplicar y Dividir");
        opciones = leer.next();
        
        switch(opciones){
            case "Sumar":
                resultado = ecuaciones(num,num1,opciones);
                System.out.println("La suma es"+resultado);
                break;
            case "Restar":
                resultado = ecuaciones(num,num1,opciones);
                System.out.println("La resta es"+resultado);
                break;
            case "Multiplicar":
                resultado = ecuaciones(num,num1,opciones);
                System.out.println("La multiplicacion es"+resultado);
                break;
            case "Dividir":
                resultado = ecuaciones(num,num1,opciones);
                System.out.println("La division es"+resultado);
                break;
        }
    }
    public static Double ecuaciones(double num, double num1,String opciones) {
        double resul = 0;
        switch(opciones){
            case "Sumar":
                resul = num + num1;
                break;
            case "Restar":
                resul = num - num1;
                break;
            case "Multiplicar":
                resul = num * num1;
                break;
            case "Dividir":
                resul = num / num1;
                break;
        }
        return resul;
    }


}
