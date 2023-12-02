package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Table {
	private Sport[] Tab;

	public Table() {
		super();
		Tab=new Sport[4];
		Tab[0] = new Sport("S1","Sport");
		Tab[1] = new Football("S2","Football",11,90);
		Tab[2] = new Sport("S3","Wport");
		Tab[3] = new Football("S4","EootballSalle",5,40);
	}
	public void Trier() {
		Arrays.sort(Tab);
	}
	public void ajouter(Sport sport) {
		List<Sport> l=new ArrayList<Sport>(Arrays.asList(Tab));
		l.add(sport);
		Sport[] tab= new Sport[l.size()];
		l.toArray(tab);
		Tab=tab;
		
	}
	public void supprimer(int index) {
		if(index>=0&&index<Tab.length) {
		List<Sport> l=new ArrayList<Sport>(Arrays.asList(Tab));
		l.remove(index);
		Sport[] tab= new Sport[l.size()];
		l.toArray(tab);
		Tab=tab;
		}
		throw new IllegalArgumentException("la position doit être comprise entre 0 et la taille");

		
	}
	public int numberElement() {
		int i=0;
		for(Sport s:Tab) {
			if(s!=null)
				i++;
		}
		return i;
	}
	public void inverse() {
		Collections.reverse(Arrays.asList(Tab));
	}
	
	public Sport max() {
		int max=0;
		for (int i = 0; i < Tab.length; i++) {
			if(Tab[0].compareTo(Tab[i])<0) {
				max=i;
			}
		}
		return Tab[max];
	}
	
	
	public boolean testEquality(Sport[] other) {
		return Arrays.equals(Tab, other);
	}
	public void afficher() {
		for(Sport s:Tab) {
			if(s!=null)
				System.out.println(s);
		}
	}
}
