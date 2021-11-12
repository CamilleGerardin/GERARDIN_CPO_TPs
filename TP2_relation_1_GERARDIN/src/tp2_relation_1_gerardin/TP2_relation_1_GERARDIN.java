/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_gerardin;

/**
 *
 * @author camille
 */
public class TP2_relation_1_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5);
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4);
        
        Personne bob = new Personne ("Bobby", "Sixkiller");
        Personne reno = new Personne ("Reno", "Raines");
        
        bob.liste_voitures[0] = uneClio;
        uneClio.Propriétaire = bob;
        bob.liste_voitures[1] = uneAutreClio;
        bob.nbVoitures = 2;
        uneAutreClio.Propriétaire = bob;
        
        reno.liste_voitures[0] = une2008;
        une2008.Propriétaire = reno;
        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 3;
        uneMicra.Propriétaire = reno;
        reno.liste_voitures[2] = uneAutreClio;
        uneAutreClio.Propriétaire = reno;
        
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);
        System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1]);
        System.out.println("la premiere voiture de Reno est " + bob.liste_voitures[0]);
        System.out.println("la deuxième voiture de Reno est " + bob.liste_voitures[1]);
        System.out.println("la troisème voiture de Reno est " + bob.liste_voitures[2]);
    }
    
}
