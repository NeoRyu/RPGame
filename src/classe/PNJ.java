/*
 * CIVIL
 */
package classe;
import competence.soin.*;
import competence.atk.*;
import personnage.*;
import mouvement.*;


/**
 * Frédéric COUPEZ
 */
public class PNJ extends Personnage {  
    // Constructeur avec surcharge
    public PNJ() {
        this.move = new Ramper();
    }
    public PNJ(Attaquer esprit, Soigner soin, Deplacement dep) { 
        super(esprit, soin, dep);
    }
}
