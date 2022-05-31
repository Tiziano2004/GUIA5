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
public class Ejercicioextra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int resultado;
        int contador = 0;
        System.out.println("Ingrese el numero");
        num = leer.nextInt(); 
        do{
            num = num/10;
            contador = contador + 1;
        }while(num != 0);
        System.out.println(" La cantidad de digitos que forman el numero entero es " +contador);
    }
    
}
