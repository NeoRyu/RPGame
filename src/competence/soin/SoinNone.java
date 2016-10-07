/*
 * Possibilité de soin : aucun
 */
package competence.soin;

/**
 * @author Frédéric COUPEZ
 */
public class SoinNone implements Soigner { 
    public void soigne() { 
        System.out.println("Je ne prodigue AUCUN soin !");
    }
}