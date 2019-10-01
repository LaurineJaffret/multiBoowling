/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author pedago
 */
public class multi implements MultiPlayerGame {
    public String[] noms; 
    public int nbJoueur;
    public int numJ;
    public int tour;
    public int boule; 
    
    
    
    public multi(String[] t){
        this.noms=t;
        this.tour=0;
        this.nbJoueur=t.length;
        this.numJ=1;
        this.boule=1;
    }

    @Override
    public String startNewGame(String[] playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        
        ///return ("Prochain tir : joueur " + this.noms[this.numJ] + ", tour n° " + this.tour + ", boule n° " + this.boule);
    
    
    
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
