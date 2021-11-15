/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_gerardin;

/**
 *
 * @author camille
 */
public class SP4_console_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jeton j = new Jeton("Rouge");
        String S = j.lireCouleur();
        System.out.println(S);
        Cellule c = new Cellule();
        S=c.lireCouleurDuJeton();
        System.out.println(S);
        c.affecterJeton(j);
        S=c.lireCouleurDuJeton();
        System.out.println(S);
        Grille g = new Grille();
        g.afficherGrilleSurConsole();
        g.ajouterJetonDansColonne(j, 3);
        g.afficherGrilleSurConsole();
        System.out.println("fin");
    }
    
}
