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
public class Ejercicioextra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num,a,b;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        for(a = 1; a<=num; a++){
            for(b=1; b<=a; b++){
                System.out.print(b);
            }
            System.out.println(" ");
        }
    }
    
}
