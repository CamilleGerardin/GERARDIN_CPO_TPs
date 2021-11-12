/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_gerardin;

/**
 *
 * @author camille
 */
public class Voiture {
    String Modele;
    String Marque;
    Personne Propriétaire = null;
    int PuissanceCV;
    
    public Voiture (String unModele, String uneMarque, int unePuissanceCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
    }
    @Override
    public String toString() {
        String chaine;
        chaine = "\n" + "Modele: " + Modele + "\n" + "Marque: " + Marque + "\n" + "PuissanceCV: " + PuissanceCV;
        return chaine;
    }
}
