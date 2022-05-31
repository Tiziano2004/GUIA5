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
public class Ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minutos;
        int horas;
        int dias;
        int resta;
        int resultado;
        System.out.println("Ingrese la cantidad de minutos");
        minutos = teclado.nextInt();
        horas = (int) (minutos*1)/60;
        dias = (int) ((minutos*1)/1440);
        resta = (int) 24*dias;
        resultado =(int) horas-resta;
        System.out.println(minutos+ " son "+dias+" dias y "+ resultado +" horas ");
    }
    
}
