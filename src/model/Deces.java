package model;
import java.util.*;

/**
 * 
 */
public class Deces {

    /**
     * Default constructor
     */
    public Deces() {
    }

    /**
     * 
     */
    public Date dateDeces;
    
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
    public Citoyen citoyen;
    public void setCitoyen (Citoyen citoyen_c) {
    	citoyen = citoyen_c;
    }
    public Deces (Date d_deces) {
    dateDeces = d_deces;
    }
}