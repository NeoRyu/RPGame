/*
 * Liste Compétences MAGIQUE
 */
package competence.magie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frédéric COUPEZ
 */
public enum ListeComp {
    
    // ENUMERATION
    Fire1("1","Feu","Brule un ennemi"),
    Fire2("2","Brasier","Brule plusieurs ennemis"),
    Fire3("3","Inferno","Inflige de gros dégâts de feu à tout vos ennemis");
    //etc...

    public static final int nbrComp = ListeComp.values().length;
    
    // SIMILI ACCESSEUR
    private String id = "";
    private String nom = "";
    private String desc = "";

    // Constructeur : Lors de l'instanciation, recherche automatique du bon enum
    // grace a son nom et donnera les valeurs récuprable sous forme d'objets
    ListeComp(String id, String nom, String desc) {
        this.id = id;
        this.nom = nom;
        this.desc = desc;
    }
    
    // ACCESSEURS
    public String getId() {
        return id;
    } 
    public String getNom() {
        return nom;
    } 
    public String getDesc() {
        return desc;
    } 
    public List<String> getAll() {
        List<String> chaine = new ArrayList<String>();
        chaine.add(id);
        chaine.add(nom);
        chaine.add(desc);
        
        return chaine;
    } 
    
    public String[] ListToArray(List<String> chaine) {
        //CONVERTION : List<String> en String[]
        String[] strarray = chaine.toArray(new String[chaine.size()]);     
        return strarray;
    }     

    public static void main(String args[]){
        // HOW TO USE IT : ACCES A UNE COMP
        ListeComp comp = ListeComp.Fire1;
        comp.getAll();
    }
}
