package model;
import java.util.*;

/**
 * 
 */
public class Divorce {

    /**
     * Default constructor
     */
    public Divorce() {
    }
    public Date dateDivorce;
    /**
     * 
     */

    public Mariage mariage;
    public void setMariage(Mariage mariage_c) {
    	mariage= mariage_c;
    }
    
    public Divorce(Date datediv) {
    	dateDivorce = datediv;
    }
   

}