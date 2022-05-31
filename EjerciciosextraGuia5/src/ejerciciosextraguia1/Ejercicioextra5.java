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
public class Ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int precio;
        double resultado;
        double resultado1;
        String p;
        System.out.println("Ingrese el precio del producto");
        precio = teclado.nextInt();
        System.out.println("Ingrese la clase de socio");
         p = teclado.next();
        System.out.println(p);
        switch(p){
            case "A":
                resultado1 = 100 - 50;
                resultado = precio*resultado1;
                System.out.println("El importe final a pagar es"+resultado);
                break;
            case "B":
                resultado1 = 100-35;
                resultado = precio*resultado1;
                System.out.println("El importe final a paagr es"+resultado);
            case "C":
                System.out.println("El importe final a pagar es"+precio);
            default:
                System.out.println("La clase ingresada no existe");
        }
             
    }
    
}
