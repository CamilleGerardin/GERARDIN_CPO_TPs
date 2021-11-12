/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_gerardin;

/**
 * Gérardin, TD A, TP2, 18/10/2021
 * @author camille
 */
public class TP2_Bieres_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneBiere1 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        uneBiere1.lireEtiquette();
        
        BouteilleBiere uneBiere2 = new BouteilleBiere("Heineken", 5.0, "Brasseurs de France");
        uneBiere2.lireEtiquette();
        uneBiere2.Décapsuler();
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("Corona", 4.5, "Brasserie mortelle");
        uneBiere3.lireEtiquette();
        uneBiere3.Décapsuler();
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("1664", 5.5, "Bière blonde");
        uneBiere4.lireEtiquette();
        uneBiere4.Décapsuler();
        
        System.out.println( uneBiere2 + "\n" + uneBiere3 + "\n" + uneBiere4);
        
        
        
        
       
        
        
        
        
           
    }
    
}
