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
public class Ejercicioextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int personas;
       double alturas;
       int i = 0;
       int contador = 0;
       double suma1 = 0;
       int contador1 = 0;
       double suma = 0;
       System.out.println("Ingrese la cantidad de personas");
        personas = leer.nextInt();
        System.out.println("Ingrese las alturas de las personas");
        do{
           i = i + 1;
            alturas = leer.nextDouble();
            if(alturas<1.60){
                contador = contador + 1;
                suma1 = suma1 + alturas;
            }
            if(alturas<2.00){
                suma = suma + alturas;
                contador1 = contador1 + 1;
            }
        }while(i!=personas);
        System.out.println(" El promedio de gente que mide menos de 1.60 es "+ (suma1/contador));
        System.out.println(" El promedio de estaturas en general es "+ (suma/contador1));
    }
    
}
