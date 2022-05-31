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
public class Ejercicioextra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cent=0,dec=0,uni=0;
        while(cent!=10){
            if(cent==3){
                System.out.println("E-");
            }else{
                System.out.println(cent +"-");
            }
            if(dec==3){
                System.out.println("E-");
            }else{
                System.out.println(dec + "-");
            }
            if(uni==3){
                System.out.println("E");
            }else{
                System.out.println(uni);
            }
            uni++;
            if(uni==10){
                dec++;
                uni = 0;
            }
            if(dec==10){
                cent++;
                dec=0;
            }
        }
    }
    
}
