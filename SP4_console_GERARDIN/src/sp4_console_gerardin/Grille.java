/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_gerardin;

/**
 *
 * @author camille
 */
public class Grille {
    Cellule [][] CellulesJeu = new Cellule [6][7]; //tableau rempli de cellules sur 6 lignes et 7 colonnes
    
    Grille(){
        for (int l=0; l<6; l++){
            for(int c=0; c<7; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
    }
    
    boolean ajouterJetonDansColonne(Jeton j, int c) {
        for (int l=0; l<6; l++){ // la colonne est fixée donc on parcourt seulement les lignes
            if (CellulesJeu[l][c].jetonCourant==null){
                CellulesJeu[l][c].affecterJeton(j);
                return true;
            }
        }
        return false;
    }
    
    boolean etreRemplie(){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                if (CellulesJeu[l][c]!=null){
                    return true;
                }
            }
        } 
        return false;
    }
    
    void viderGrille(){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                CellulesJeu[l][c].jetonCourant=null;
            }
        }
        
    }
    
    void afficherGrilleSurConsole (){
        for (int l=5; l>=0; l--){
            for (int c=0; c<7; c++){
                String  a = CellulesJeu[l][c].lireCouleurDuJeton();  
                System.out.print(a+ " | ");
            } 
        System.out.println();
        }
    }
    
    boolean celluleOccupee(int l, int c ) {
        if (CellulesJeu[l][c].jetonCourant!=null){
            return true;
        }
        return false;
    }
    
    String lireCouleurDuJeton(int l, int c) {
        return (CellulesJeu[l][c].jetonCourant.Couleur); 
    }
    
    boolean etreGagnantePourJoueur(Joueur unJoueur) {
        for (int l=0; l<6; l++)
            for (int c=0; c<4; c++)
                if (CellulesJeu[l][c].jetonCourant!=null){
                    if (CellulesJeu[l][c].jetonCourant.Couleur == unJoueur.Couleur){
                        if (CellulesJeu[l][c].lireCouleurDuJeton()==CellulesJeu[l][c+1].lireCouleurDuJeton()  && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l][c+2].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l][c+3].lireCouleurDuJeton()){
                            return true;      
                }
                    }
                }
        
        for (int l=0; l<3; l++)
            for (int c=0; c<7; c++)
                if (CellulesJeu[l][c].jetonCourant!=null){
                    if (CellulesJeu[l][c].jetonCourant.Couleur == unJoueur.Couleur){
                        if (CellulesJeu[l][c].lireCouleurDuJeton()==CellulesJeu[l+1][c].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l+2][c].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l+3][c].lireCouleurDuJeton()){
                            return true;      
                }
                    }
                }
        
        for (int l=0; l<3; l++)
            for (int c=0; c<4; c++)
                if (CellulesJeu[l][c].jetonCourant!=null){
                    if (CellulesJeu[l][c].jetonCourant.Couleur == unJoueur.Couleur){
                        if (CellulesJeu[l][c].lireCouleurDuJeton()==CellulesJeu[l+1][c+1].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l+2][c+2].lireCouleurDuJeton() && CellulesJeu[l+2][c+2].lireCouleurDuJeton() == CellulesJeu[l+3][c+3].lireCouleurDuJeton()){
                            return true;      
                }
                    }
                } 
        
        for (int l=5; l>=3; l--)
            for (int c=3; c>=0; c--)
                if (CellulesJeu[l][c].jetonCourant!=null){
                    if (CellulesJeu[l][c].jetonCourant.Couleur == unJoueur.Couleur){
                        if (CellulesJeu[l][c].lireCouleurDuJeton()==CellulesJeu[l-1][c+1].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l-2][c+2].lireCouleurDuJeton() && CellulesJeu[l][c].lireCouleurDuJeton() == CellulesJeu[l-3][c+3].lireCouleurDuJeton()){
                            return true;      
                }

                    }
                } 
                return false;
    }
    
    boolean colonneRemplie(int c){
        for (int l=0; l<6; l++){
            if(CellulesJeu[l][c].jetonCourant!=null){
                return true;
            }
        }
        return false;
    }
    
    
    
}
