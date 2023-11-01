package model;
import java.util.*;

/**
 * 
 */
public class Mairie {

    /**
     * Default constructor
     */
    public Mairie() {
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public Vector<Deces> listDeces = new Vector <Deces>();

    /**
     * 
     */
    public Vector<Mariage> listMariage = new Vector <Mariage>();

    /**
     * 
     */
    public Vector<Naissance> listNaissance = new Vector <Naissance>();

    /**
     * 
     */
    public Vector<Citoyen> listCitoyens = new Vector <Citoyen>() ;
   
   public Citoyen chercherCitoyen(int id) {
	int i = 0;
	Citoyen citoyen= null;
   	boolean trouver=false;
   	while( trouver==false) {
   		if ((id != listCitoyens.get(i).identifiant) && (i<listCitoyens.size())) {
   			i++;
   		}else if ((id == listCitoyens.get(i).identifiant) && (i<listCitoyens.size())){
   			citoyen= listCitoyens.get(i);
   			trouver=true;
   		} else {
   			citoyen = null;
   		}
   	 }
   	return citoyen;
   }
    
    
    public void ajouterCitoyen(Citoyen citoyen) {
    	listCitoyens.add(citoyen);    	
    }
    
    public void marierCitoyen(int id1, int id2) {
    	
    	Homme epoux =(Homme)this.chercherCitoyen(id1);
    	Femme epouse =(Femme)this.chercherCitoyen(id2);
    	if(!epoux.estMarie() && !epouse.estMarie())
    	{Mariage mariage=new Mariage();
    	mariage.setEpouse(epouse);
    	mariage.setEpoux(epoux);
    	this.listMariage.add(mariage);
    		
    	}
    }
    
    public void divorcerCitoyen(int id) {
    	Citoyen citoyen = this.chercherCitoyen(id);
    	if(!((Homme)citoyen).estMarie() || !((Femme)citoyen).estMarie()){
    		Divorce divorce = new Divorce();
    		divorce.setMariage(null);
    	}else if (((Homme)citoyen).estMarie()) {
    	        Mariage mariage = ((Homme)citoyen).getMariage();
    	        Divorce divorce = new Divorce();
    	        mariage.setDivorce(divorce);
        } else if(((Femme)citoyen).estMarie()) {
    	        Mariage mariage = ((Femme)citoyen).getMariage();
    	        Divorce divorce = new Divorce();
    	        mariage.setDivorce(divorce);
    	      
    	}	
    }
    
    public void ajoutNaissance(int idp, int idm,String d) {
    	Homme pere = (Homme)this.chercherCitoyen(idp);
    	Femme mere = (Femme)this.chercherCitoyen(idm);
    	Naissance naissance = new Naissance(d);
    	naissance.setPere(pere);
    	naissance.setMere(mere);
    	this.listNaissance.add(naissance);
    	
    	
    }
    
    public Mairie (String nomMairie) {
    	nom = nomMairie;
    }
    public Object[][] toTable(Vector<Citoyen> c){
    	Object[][] l=new Object [c.size()][5] ;
    	for(int i=0;i<c.size();i++) {
    		Citoyen citoyen=c.get(i);
    		l[i][0]=citoyen.identifiant;
    	    l[i][1]=citoyen.nom;
    	    l[i][2]=citoyen.prenom;
    	    l[i][3]=citoyen.dateDeNaissance;
    		
    				
    		
    	}
    	return l;
    }
    
    public Object[][] toTable2(Vector<Naissance> c){
    	Object[][] l=new Object [c.size()][3] ;
    	for(int i=0;i<c.size();i++) {
    		Naissance naissance=c.get(i);
    		l[i][0]=naissance.getpere();
    		l[i][1]=naissance.getmere();
    		l[i][2]=naissance.dateNaissance;
    
    	}
    	return l;
    }
    
    
    
    
}