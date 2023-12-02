package p1;

public class Main {

	public static void main(String[] args) {
		Sport s1=new Sport("S1","Aootballa");
		Sport s2=new Sport("S2","Football");

		ListSport t=new ListSport();
		//Football f=new Football("S2","Football",11,90);
		//Football f1=new Football("S3","Ba",5,40);
		t.AlimenterList();
		t.Parcourir();
	}

}
