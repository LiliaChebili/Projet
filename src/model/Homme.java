package model;
import java.util.*;

/**
 * 
 */
public class Homme extends Citoyen {

    /**
     * Default constructor
     */
    public Homme() {
    }
    
    
    public Homme (int id, String n, String p, String d) {
    	super.identifiant = id;
    	super.nom = n;
    	super.prenom = p;
    	super.dateDeNaissance = d;
    }

    /**
     * 
     */
    public Vector<Naissance> listNaissance = new Vector <Naissance>();
    public void addNaissance(Naissance naissance) {
    	listNaissance.add(naissance);
    }
    /**
     * 
     */
    
    public Vector<Mariage> listMariage = new Vector <Mariage>();
    public void addMariage(Mariage mariage) {
    	listMariage.add(mariage);
    }
    public Mariage getMariage() {
    	if (this.listMariage.size()==0) {
    		return null;
    	} else {
    		return this.listMariage.lastElement();
    	}
    }
    public boolean estMarie()
    {if(listMariage.size()==0) return false;
    if(listMariage.lastElement().divorce==null) return false;
    return true;
    	
    }

}