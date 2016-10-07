/*
 * Classe définissant un personnage jouable
 */
package ennemi;
import mouvement.*;
import competence.atk.*;
import competence.soin.*;



/**
 * @author Frédéric COUPEZ
 */
public abstract class Ennemi { 
    
    //Instances de comportements par défaut (si non défini)
    protected Attaquer atk = new AtkPacifiste(); 
    protected Soigner heal = new SoinNone(); 
    protected Deplacement move = new Marcher();
    
    //Constructeur par défaut + surchage (passage de paramètres)
    public Ennemi(){}
    public Ennemi(Attaquer attaque, Soigner soin, Deplacement mouvement) { 
        this.atk = attaque; 
        this.heal = soin; 
        this.move = mouvement; 
    } 
    
    //Méthode de déplacement de personnage 
    public void deplacer(){ 
        //On utilise les objets de déplacement de façon polymorphe 
        move.deplacer(); 
    } 
    
    // Méthode que les combattants utilisent 
    public void combattre(){ 
        //On utilise les objets de déplacement de façon polymorphe 
        atk.combat(); 
    } 
    
    //Méthode de soin 
    public void soigner(){
        //On utilise les objets de déplacement de façon polymorphe 
        heal.soigne(); 
    } 
    
    //Redéfinit le comportement au combat 
    public void setAtk(Attaquer attaque) { 
        this.atk = attaque;
    } 

    //Redéfinit le comportement de Soin 
    public void setHeal(Soigner soin) { 
        this.heal = soin; 
    } 
    
    //Redéfinit le comportement de déplacement 
    public void setMove(Deplacement mouvement) { 
        this.move = mouvement;
    } 
}
