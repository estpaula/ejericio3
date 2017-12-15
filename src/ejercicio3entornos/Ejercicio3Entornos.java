/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3entornos;

import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class Ejercicio3Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aleat=(int) (Math.random() * 100 + 1);
        System.out.println("Introduce un número del 1 al 100 para ganar un premio:");
        Scanner sc=new Scanner(System.in);
        int intro=sc.nextInt();
        if (intro==aleat){
            System.out.println("¡ENHORABUENA,HAS ACERTADO!");
        }
        else System.out.println("Lo siento, has fallado :( ");
    }
    
}
