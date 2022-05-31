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
public class Ejercicioextra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int personas;
        System.out.println("Ingrese la cantidad de personas");
        personas = leer.nextInt();
        mostrar(personas);
    }
    public static void mostrar(int personas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        int edad;
        int i = 1;
        String opcion;
        while ( i != 0 || personas>0){
            System.out.println("Ingrese el nombre de la persona y la edad");
            nombre = leer.nextLine();
            edad = leer.nextInt();
            if(edad>18){
                System.out.println(" El nombre ingresado es " +nombre+ " la edad es " +edad+ " y es mayor ");
            }
            if(edad<18){
                System.out.println(" El nombre ingresado es " +nombre+ " la edad es " +edad+ " y es menor ");
            }
            personas = personas - 1;
            System.out.println("¿Quiere seguir viendo los datos de las personas?");
            opcion = leer.next();
            if(opcion.equals("Si")){
                System.out.println("Seguiremos mostrando");
            }
            if(opcion.equals("No")){
                i = 0;
                personas = 0;
            }
        }
    }
}
