/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_gerardin;

/**
 *
 * @author camille
 */
public class Jeton {
    String Couleur;
    
    Jeton(String uneCouleur){
        Couleur = uneCouleur;
    }
    
    String lireCouleur() {
        return Couleur;
    }
}
