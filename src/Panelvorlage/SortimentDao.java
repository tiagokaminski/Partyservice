package Panelvorlage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Adresse;
import model.Produkt;

public class SortimentDao {
	private String datei;
	private String url;
	private Connection conn;


	public SortimentDao() {

		try {
			Class.forName("org.sqlite.JDBC");

			// datei= "emailverwaltung_db.db3";
			url= "jdbc:sqlite:" + datei;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void aenderungDerCombobox() {



	}

	public ArrayList<Produkt> Produktnamen() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String datei = "Produkte.db3";	
		String 	url	= "jdbc:sqlite:" + 	datei;	
		ArrayList<Produkt> produkt = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(url);
			String 	sql	= "SELECT * from Produkt";
			PreparedStatement statement = conn.prepareStatement	(sql);
			ResultSet resultSet = statement.executeQuery();	
			while (resultSet.next()) {
				produkt.add(new Produkt(resultSet.getString("Name"), resultSet.getDouble("Preis")));
				
				//adressen.add(new Adresse(resultSet.getString("Strassenname"), resultSet.getInt("Postleitzahl"), resultSet.getString("ort")));
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return produkt;
	}
}


