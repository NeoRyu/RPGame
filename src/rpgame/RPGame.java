/*
 * PAGE PRINCIPALE (pour tests)
 */
package rpgame;

// IMPORT
import personnage.*;
import mouvement.*;
import classe.*;
import competence.atk.*;
import competence.soin.*;
import java.lang.Character.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Frédéric COUPEZ
 */
public class RPGame {

    public static void main(String[] args) {
        Personnage[] tPers = {new PNJ(), new Guerrier(), new Medecin()};
        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].combattre();
            tPers[i].deplacer();
            tPers[i].soigner();             
        }
        
        System.out.println("\nModif de l'Instance de classe.Guerrier");
        System.out.println("********* TEST CHANGEMENT SOINS *********");
        
        // On affiche la compétence en soin du guerrier
        Personnage pers = new Guerrier(); 
        pers.soigner(); 
        
        // On lui attribue une nouvelle comp et on affiche
        pers.setHeal(new SoinNone());
        //pers.setHeal(new SoinMax());
        pers.soigner(); 
    }    
}



