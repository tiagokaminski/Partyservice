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

	public ArrayList<Produkt> lifesuche(String eingabe) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		String datei = "AdressenBremen.db3";	
		String 	url	= "jdbc:sqlite:" + 	datei;
		ArrayList<Produkt> produktSuche = new ArrayList<>();

		
		try {
			Connection conn = DriverManager.getConnection(url);
			// Erzeugen einer SQL-	Anweisung
			String 	sql	= "Select ID, Name, Preis, Kategorie_ID, Unterkategorie_ID FROM Produkt where Name like ?";
			PreparedStatement statement = conn.prepareStatement	(sql);
			statement.setString(1, "%"+eingabe+"%");
			ResultSet resultSet = statement.executeQuery();	
			while (resultSet.next()) {
				produktSuche.add(new Produkt(resultSet.getInt("ID"), resultSet.getString("Name"), resultSet.getInt("Preis"), resultSet.getInt("Kategorie_ID"), resultSet.getInt("Unterkategorie_ID")));

			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
			
		}
		
		ArrayList<Produkt> produkt = null;
		return produkt;
		

		}

		public ArrayList<Produkt> ProduktnamenPreis() {
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
					produkt.add(new Produkt(0, resultSet.getString("Name"), resultSet.getDouble("Preis"), 0, 0));

					//adressen.add(new Adresse(resultSet.getString("Strassenname"), resultSet.getInt("Postleitzahl"), resultSet.getString("ort")));

				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			}
			return produkt;
		}
	}


