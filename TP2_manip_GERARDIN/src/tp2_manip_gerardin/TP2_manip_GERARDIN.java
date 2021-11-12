/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_gerardin;

/**
 *
 * @author camille
 */
public class TP2_manip_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ;
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        // Aucune des lignes n'est correcte car une tartiflette ne devient pas une moussaka
        // réponse question : non
        
        Moussaka tab[] = new Moussaka [10];
        for (int i = 0 ; i < 9 ; i++) {
            Moussaka a = new Moussaka();
            tab[i]=a;
            System.out.println(tab[i]);
        }
        
        
    }
    
}
