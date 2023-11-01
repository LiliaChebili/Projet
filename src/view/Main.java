package view;
import model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mairie mm = new Mairie();
		Menu m = new Menu(mm);
		
		Homme h = new Homme (132,"Denis","Dupont","19/01/2003");
		Femme f = new Femme (122, "Dupont","Chrlotte", "27/02/2001");
		
		mm.ajouterCitoyen(f);
		mm.ajouterCitoyen(h);
		
	
	}

}
