/*
 * Possibilité de soin : faible
 */
package competence.soin;

/**
 * @author Frédéric COUPEZ
 */
public class SoinMin implements Soigner { 
    public void soigne() { 
        System.out.println("Je donne les premiers soins."); 
    }
}
