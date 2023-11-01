package model;
import java.util.*;

/**
 * 
 */
public class Mariage {
	public Date dateMariage;
    /**
     * Default constructor
     */
    public Mariage() {
    }

    /**
     * 
     */
  
    public Mairie mairie;
    public void setMairie(Mairie mairie_c) {
    	mairie = mairie_c;
    }
    /**
     * 
     */
    public Divorce divorce;
    public void setDivorce (Divorce divorce_c) {
    	divorce = divorce_c;
    }
    /**
     * 
     */
    public Femme epouse;

    /**
     * 
     */
    
    public Homme epoux;
    
    public void setEpoux(Homme h) {epoux=h;}
    public void setEpouse(Femme f) {epouse=f;}
    
    public Mariage (Date dateM) {
    	dateMariage = dateM;
    }

}