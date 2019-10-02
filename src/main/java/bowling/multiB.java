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
public class multiB implements MultiPlayerGame{
    public String[] noms;
    public int[] scores;
    public int pointS;
     

    @Override

    public String startNewGame(String[] playerName) throws Exception {
        if(playerName.length<1 || playerName==null){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        this.noms=playerName;
        return "Prochain tir : joueur "+playerName[0]+", tour n° 1, boule n° 1";
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        /*if(!this.noms. (playerName))  {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }*/ //To change body of generated methods, choose Tools | Templates.
        String nom="";
        int i=-1;
        while(nom != playerName){
            i++;
            nom=this.noms[i]; 
        }
        return this.scores[i];

        
        
    }
    
}
