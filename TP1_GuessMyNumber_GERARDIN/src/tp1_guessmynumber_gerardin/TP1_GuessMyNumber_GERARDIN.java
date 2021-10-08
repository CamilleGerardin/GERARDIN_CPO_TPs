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
        Scanner sc = new Scanner(System.in);
        int difficulté;
        System.out.println("quel niveau de difficulté souhaitez-vous ? : \n1 Facile \n2 normal \n3 Difficile");
        difficulté = sc.nextInt();

        if (difficulté == 1) {
            int n = generateurAleat.nextInt(20);
            System.out.println(n);
            int nombre;
            System.out.println("Saisissez un nombre entre 0 et 20 :");
            int compteur = 1;
            nombre = sc.nextInt();
            while (n != nombre) {
                if (nombre > n) {
                    System.out.println("Trop grand");
                    nombre = sc.nextInt();
                    compteur += 1;
                } else if (nombre < n) {
                    System.out.println("Trop petit");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
            }

            System.out.println("C'est gagné en " + compteur + " essais");
        } else if (difficulté == 2) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
            int nombre;
            System.out.println("Saisissez un nombre entre 0 et 100 :");
            int compteur = 1;
            nombre = sc.nextInt();
            while (n != nombre) {
                if (nombre > n) {
                    System.out.println("Trop grand");
                    nombre = sc.nextInt();
                    compteur += 1;
                } else if (nombre < n) {
                    System.out.println("Trop petit");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
            }

            System.out.println("C'est gagné en " + compteur + " essais");
        } else if (difficulté == 3) {
            int n = generateurAleat.nextInt(1000);
            System.out.println(n);
            int nombre;
            System.out.println("Saisissez un nombre entre 0 et 1000 :");
            int compteur = 1;
            nombre = sc.nextInt();
            while (n != nombre) {
                if (nombre > n) {
                    System.out.println("Trop grand");
                    nombre = sc.nextInt();
                    compteur += 1;
                    if (compteur > 8) {
                        System.out.println("vous avez dépassé le nombre d'essais possible, la bonne réponse était: " + n);
                        break;
                    }
                } else if (nombre < n) {
                    System.out.println("Trop petit");
                    nombre = sc.nextInt();
                    compteur += 1;
                    if (compteur > 8) {
                        System.out.println("vous avez dépassé le nombre d'essais possible, la bonne réponse était: " + n);
                        break;
                    }
                }
            }

        
        }
    }
}

