package model;
import java.util.*;

/**
 * 
 */
public class Citoyen {

    /**
     * Default constructor
     */
    public Citoyen() {
    }

    /**
     * 
     */
    public int identifiant;
    public int getIdentifiant() {
    	return identifiant;
    }
    /**
     * 
     */
    public String nom;
    public String getNom() {
    	return nom;
    }
    /**
     * 
     */
    public String prenom;
    public String getPrenom() {
    	return prenom;
    }

    /**
     * 
     */
    public String dateDeNaissance;
    public String getDateDeNaissance() {
    	return dateDeNaissance;
    }
    
    /**
     * 
     */
    public Naissance naissance;
    public void setNaissance(Naissance naissance_c) {
    	naissance = naissance_c;
    }
    /**
     * 
     */
    public Mairie mairie;
    public void setMairie(Mairie mairie_c) {
    	mairie_c = mairie;
    }
    /**
     * 
     */
    public Deces deces;
   
    public void setDeces(Deces deces_c) {
    	deces = deces_c;
    }
    
    public Citoyen(int id, String n, String p, String naiss) {
    	identifiant = id;
    	nom = n;
    	prenom = p;
    	dateDeNaissance = naiss ; 
    }
 
      

}