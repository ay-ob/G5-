package p1;

import java.util.Objects;

public class Sport implements Comparable<Sport>,Cloneable{
	private String Id;
	private String Nom;

	public Sport(String id, String nom) {
		super();
		Id = id;
		Nom = nom;
	}
	
	public String getNom() {
		return Nom;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sport other = (Sport) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(Nom, other.Nom);
	}

	@Override
	public String toString() {
		return "Sport [Id=" + Id + ", Nom=" + Nom + "]";
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();

		} catch (CloneNotSupportedException E) {
			System.out.println(E.getMessage());
		}
		return null;
	}

	@Override
	public int compareTo(Sport o) {
		return Nom.compareTo(o.Nom);
	}
	

}
