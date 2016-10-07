/*
 * GUERRIER
 */
package classe;
import competence.soin.*;
import competence.atk.*;
import personnage.*;
import mouvement.*;


/**
 * Frédéric COUPEZ
 */
public class Guerrier extends Personnage { 
    // Constructeur avec surcharge
    public Guerrier(){         
        this.atk = new AtkEpee();
        this.heal = new SoinMin();
        this.move = new Courir();
    }     
    public Guerrier(Attaquer esprit, Soigner soin, Deplacement dep) { 
        super(esprit, soin, dep); 
    } 
}
