package ejerciciosextraguia1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;
        int num;
        System.out.println("Ingrese su letra");
        letra = teclado.nextLine();
        num = letra.length();
        if(num>1){
            do{
                System.out.println("No ingreso una letra");
                System.out.println("Ingrese su letra");
                letra = teclado.nextLine();
                num = letra.length();
            }while(num>1);
        }
        switch(letra){
            case "a":
                System.out.println("Es una vocal");
                break;
            case "A":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "E":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "I":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "O":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            case "U":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
    }
    
    }
    
}
