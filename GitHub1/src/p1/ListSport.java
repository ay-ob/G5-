package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSport {
	private List<Sport> list;

	public ListSport() {
		list = new ArrayList<Sport>();
	}

	public void AlimenterList() {
		list.add(new Sport("S1", "Sport"));
		list.add(new Football("S2", "Football", 11, 90));
		list.add(new Football("S3", "football", 11, 90));
		list.add(new Sport("S4", "sport"));

	}

	public void Afficher() {
		for (Sport sport : list) {
			System.out.println(sport);
		}
	}

	public void Parcourir() {
		Iterator<Sport> it = list.iterator();
		while (it.hasNext()) {
			Sport s = (Sport) it.next();
			System.out.println(s);
		}
	}

	public void Inserer(Sport s) {
		list.add(s);
	}

	public Sport Recuperer(int index) {
		if (index >= 0 && index < list.size()) {
			return list.get(index);
		}
		throw new IllegalArgumentException("la position doit être comprise entre 0 et la taille");
	}

	public void Supprimer(Sport s) {
		list.remove(s);
	}

	public boolean Rechercher(Sport s) {
		return list.contains(s);
	}

	public void Trier() {
		Collections.sort(list,new CmpSport());
		//list.sort(new CmpSport());
	}
	public Sport[] copier() {
		Sport[] s=new Sport[list.size()];
		list.toArray(s);
		return s;
	}
	public void Melanger() {
		Collections.shuffle(list);
	}
	public void Inverser() {
		Collections.reverse(list);
	}
	public List Extraire(int i,int j) {
		return list.subList(i, j);
	}
	public boolean ComparerList(List<Sport> l) {
		return list.equals(l);
	}
	public void Echanger(int i,int j) {
		Collections.swap(list, i, j);
	}
	public void vider() {
		list.clear();
	}
	public boolean vide() {
		return list.isEmpty();
	}
}
