/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 *
 * Gérardin, TD A, Saisie et manipulation de nombres, 04/10/2021
 * @author camille
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int entier1;
        System.out.println("Please enter the first int :");
        entier1=sc.nextInt();
        int entier2;
        System.out.println("Please enter the second int :");
        entier2=sc.nextInt();
        int somme;
        somme = entier1 + entier2;
        int difference;
        difference = entier1-entier2;
        int produit; 
        produit = entier1*entier2;
        System.out.println("La somme vaut:" + somme + "\n La difference vaut:" + difference + "\n Le produit vaut:" + produit);
        int quotient; 
        quotient = entier1/entier2;
        System.out.println("Le quotient vaut:" + quotient);
        int reste;
        reste = entier1 % entier2 ; 
        System.out.println("Le reste vaut:" + reste);
        
                
        
    }
    
}
