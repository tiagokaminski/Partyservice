package model;

import javax.swing.Icon;

public class Produkt  {

	private String name;
	//private String beschreibung;
	private double preis;

	public Produkt(String name, double preis) {
		this.name  = name;
		//this.beschreibung = beschreibung;
		this.preis = preis;	

	}
	
	public String getName(){
		return this.name;
	}
	public double getPreis(){
		return this.preis;
	}
}
