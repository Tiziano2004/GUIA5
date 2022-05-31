/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextraguia1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicioextra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random R = new Random();
        int num;
        int num1;
        int multiplicacion;
        int adivinador;
        num = R.nextInt(10);
        num1 = R.nextInt(10);
        multiplicacion = num * num1;
        System.out.println(" La multiplicacion es "+multiplicacion);
        System.out.println("Ingrese el que cree que es el resultado");
        do{
            adivinador = leer.nextInt();
            if(adivinador == multiplicacion){
                System.out.println("Correcto");
            } else{
                System.out.println("Incorrecto");
                System.out.println("Ingrese nuevamente");
            }
        }while(adivinador != multiplicacion);
    }
    
}
