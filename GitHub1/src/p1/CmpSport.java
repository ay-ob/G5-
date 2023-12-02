package p1;

import java.util.Comparator;

public class CmpSport implements Comparator<Sport>{

	@Override
	public int compare(Sport o1, Sport o2) {
		
		return o1.getNom().compareTo(o2.getNom());
	}

}
