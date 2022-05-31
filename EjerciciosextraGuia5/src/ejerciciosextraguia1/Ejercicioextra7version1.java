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
public class Ejercicioextra7version1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double nummax;
        double nummin;
        double num;
        double num2;
        int num3 = 1;
        int contador = 0;
        double suma = 0;
        System.out.println("¿Cuantos numeros quiere ingresar?");
        num = leer.nextDouble();
        System.out.println("Ingrese el numero");
        num2 = leer.nextDouble();
        nummax = num2;
        nummin = num2;
        while(num3 != num){
            num2= leer.nextDouble();
            num3 = num3 + 1;
            if(num2 > nummax){
                nummax = num2;
            }
            if(num2<nummin){
                nummin = num2;
            }
            contador = contador + 1;
            suma = suma + num2;
        }
        System.out.println(" El numero mas grande es "+nummax+" el numero mas chico es "+nummin+" y el promedio es "+(suma/contador));
    }
    
}
