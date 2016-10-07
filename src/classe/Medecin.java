/*
 * MEDECIN
 */
package classe;
import competence.soin.*;
import competence.atk.*;
import personnage.*;
import mouvement.*;


/**
 * Frédéric COUPEZ
 */
public class Medecin extends Personnage { 
    // Constructeur avec surcharge
    public Medecin() { 
        this.atk = new AtkBaton();
        this.heal = new SoinMax();
    }    
    public Medecin(Attaquer esprit, Soigner soin, Deplacement dep) { 
        super(esprit, soin, dep);
    }
}
