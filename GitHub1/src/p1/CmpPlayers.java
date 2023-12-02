package p1;

import java.util.Comparator;

public class CmpPlayers implements Comparator<Football> {

	@Override
	public int compare(Football o1, Football o2) {
		return (int)(o1.getNombrePlayers()-o2.getNombrePlayers());
	}

	

}
