package model;
import java.util.*;

/**
 * 
 */
public class Naissance {
	
	
	public String dateNaissance;

    /**
     * Default constructor
     */
    public Naissance() {
    }

    /**
     * 
     */
    public Mairie mairie;
    public void setMairie (Mairie mairie_c) {
    	mairie = mairie_c ;
    }
    /**
     * 
     */
    public Femme mere;
    public void setMere(Femme m) {
    	mere = m;
    }
    public int getmere() {
    	return mere.identifiant;
    }
    /**
     * 
     */
    public Homme pere;
    public void setPere(Homme p) {
    	pere = p;
    }
    
    public int getpere() {
    	return pere.identifiant;
    }
    /**
     * 
     */
    public Citoyen citoyen;
    public void setCitoyen (Citoyen c ) {
    	citoyen =c ;
    }
    

    public Naissance(String datenaiss) {
    	dateNaissance = datenaiss;
    }
}