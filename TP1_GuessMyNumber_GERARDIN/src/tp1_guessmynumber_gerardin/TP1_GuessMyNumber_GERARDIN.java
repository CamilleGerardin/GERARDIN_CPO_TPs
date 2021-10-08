/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_gerardin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camille
 */
public class TP1_GuessMyNumber_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        n1 = generateurAleat.nextInt(100);
        System.out.println(n1);
        n2 = generateurAleat.nextInt(100);
        System.out.println(n2);
        n3 = generateurAleat.nextInt(100);
        System.out.println(n3);
        n4 = generateurAleat.nextInt(100);
        System.out.println(n4);
        n5 = generateurAleat.nextInt(100);
        System.out.println(n5);

        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println(n);
        int nombre;
        do {
            System.out.println("Saisissez un nombre entre 0 et 100 :");
            nombre = sc.nextInt();

            if (nombre == n) {
                System.out.println("C'est gagné");
            }
            else if (nombre > n) {
                System.out.println("Trop grand");
            }

            if (nombre < n) {
                System.out.println("Trop petit");
            }
        } 
        while (n != nombre);
        System.out.println("ressaisir une valeur");
    }

}

