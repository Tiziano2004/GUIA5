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
public class Ejercicioextra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int familias,edad,contador = 0,suma = 0,resultado,hijos;
        System.out.println("Ingrese las familias");
        familias = leer.nextInt();
        do{
            System.out.println("Ingrese sus hijos");
            hijos =leer.nextInt();
            contador = contador + hijos;
            System.out.println("Ingrese la edad de sus hijos");
            do{
               edad = leer.nextInt();
              suma = suma + edad;
              hijos = hijos - 1;
            }while(hijos!=0);
            familias = familias - 1;
        }while(familias!=0);
        System.out.println(" La media de edad de los niños es "+(suma/contador));
    }
    
}
