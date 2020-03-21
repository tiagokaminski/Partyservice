package model;

public class Produkt {
	
	private int id;
	private String name;
	private double preis;
	private int kategorie;
	private int unterkategorie;
	
	public Produkt (int id, String name, double preis, int kategorie, int unterkategorie) {
		this.id = id;
		this.name = name;
		this.preis = preis;
		this.kategorie = kategorie;
		this.unterkategorie = unterkategorie;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		id = this.id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		name = this.name;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		preis = this.preis;
	}
	
	public int getKategorie() {
		return kategorie;
	}
	
	public void setKategorie(int kategorie) {
		kategorie = this.kategorie;
	}
	
	public int getUnterkategorie() {
		return unterkategorie;
	}
	
	public void setUnterkategorie(int unterkategorie) {
		unterkategorie = this.unterkategorie;
	}
}