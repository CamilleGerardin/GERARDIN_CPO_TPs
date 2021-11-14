/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_gerardin;

/**
 *
 * @author camille
 */
public class Cellule {
    Jeton jetonCourant;
    
    Cellule (){
    
    }
    
    boolean affecterJeton(Jeton j) {
        if(jetonCourant == null) {
            jetonCourant = j;
            return true;
        }
        else {
            return false;
        }
    }
    
    String lireCouleurDuJeton(){
        if (jetonCourant != null) {
            return jetonCourant.Couleur;
        }
        else {
            return ("vide");
        }
    }
}

