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
    int nombreJetonsRestants=0;
    //int nombreDesintegrateurs;
    
    
    Joueur(String unNom){
        Nom = unNom;
    }
    
    void affecterCouleur(String uneCouleur){
        Couleur = uneCouleur;
    }
    
    boolean ajouterJeton(Jeton j) {
        if(nombreJetonsRestants<=21){
                    ListeJetons[nombreJetonsRestants]= j;
        nombreJetonsRestants++;
        return true;    
        }
        return false;
    }
    
    
}   
