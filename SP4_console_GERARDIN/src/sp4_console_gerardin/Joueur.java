/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_gerardin;

/**
 *
 * @author camille
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton[]ListeJetons = new Jeton[21];
    int nombreJetonsRestants;
    //int nombreDesintegrateurs;
    
    
    Joueur(String a){
        
    }
    
    void affecterCouleur(String c ){
        Couleur = c;
    }
    
    boolean ajouterJeton(Jeton j) {
        return true;
    }
    
    
}   
