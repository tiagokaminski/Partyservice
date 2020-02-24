package model;

public class Adresse {

	String strasse;
	int plz;
	String ort;

	public Adresse(String strasse, int plz, String ort) {
		this.strasse =strasse;
		this.plz=plz;
		this.ort=ort;
	}

	public String getStrasse() {
		return strasse;
	}
	public int getPlz() {
		return plz;
	}
	public String getOrt() {
		return ort;
	}
}