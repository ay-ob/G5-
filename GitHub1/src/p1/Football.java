package p1;

public class Football extends Sport {
	private int NombrePlayers;
	private double AvgMinutesPlaying;

	public Football(String id, String nom, int nombrePlayers, double avgMinutesPlaying) {
		super(id, nom);
		NombrePlayers = nombrePlayers;
		AvgMinutesPlaying = avgMinutesPlaying;
	}

	public int getNombrePlayers() {
		return NombrePlayers;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Football other = (Football) obj;
		return Double.doubleToLongBits(AvgMinutesPlaying) == Double.doubleToLongBits(other.AvgMinutesPlaying)
				&& NombrePlayers == other.NombrePlayers;
	}

	@Override
	protected Object clone() {
		return super.clone();
	}
	@Override
	public int compareTo(Sport o) {
		if(o instanceof Football) {
			Football f=(Football)o;
			return (int)(this.NombrePlayers-f.NombrePlayers);
		}
		return super.compareTo(o);
	}

	@Override
	public String toString() {
		return "Football [NombrePlayers=" + NombrePlayers + ", AvgMinutesPlaying=" + AvgMinutesPlaying + "]";
	}
	

}
