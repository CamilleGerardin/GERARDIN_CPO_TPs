/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_gerardin;

/**
 *
 * @author camille
 */
public class Personne {
    String Nom; 
    String Prenom;
    int nbVoitures = 0;
    Voiture[] liste_voitures;
    
    public Personne(String unNom, String unPrenom){
        Nom = unNom;
        Prenom = unPrenom;
        liste_voitures = new Voiture [3];
    }
    
    public boolean ajouter_voiture (Voiture voiture_a_ajouter) {
        boolean x = true;
        if (nbVoitures == 3) {
            x = false;
        }
        if (voiture_a_ajouter.Propriétaire !=null) {
            x = false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures ++;
        voiture_a_ajouter.Propriétaire = this;
        return x;
    }
}
