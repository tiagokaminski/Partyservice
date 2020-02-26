package Panelvorlage;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FilterDao {
	private String datei;
	private String url;
	private Connection conn;
	private Produkt produkt;
	private String produktListeString;
	private ArrayList<Produkt> produktListe = new ArrayList<>();
	
	

	public FilterDao() {
		try {
			Class.forName("org.sqlite.JDBC");
			//datei= "Produkte.db3";
			url= "jdbc:sqlite:" + datei;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Produkt> unterkategorieAusgewaehlt(int kategorie) throws ClassNotFoundException {		
		Class.forName("org.sqlite.JDBC");
		datei= "Produkte.db3";
		url= "jdbc:sqlite:" + datei;
		try {
			conn = DriverManager.getConnection(url);
			String sql = 	"Select ID, Name, Preis, Kategorie_ID, Unterkategorie_ID FROM Produkt where Unterkategorie_ID = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setLong(1, kategorie);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				produkt = new Produkt(resultSet.getInt("ID"), resultSet.getString("Name"), resultSet.getInt("Preis"), resultSet.getInt("Kategorie_ID"), resultSet.getInt("Unterkategorie_ID"));
				produktListe.add(produkt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return produktListe;
	}
	
	public ArrayList<Produkt> oberkategorieAusgewaehlt(int oberKategorie) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		datei= "Produkte.db3";
		url= "jdbc:sqlite:" + datei;
		try {
			conn = DriverManager.getConnection(url);

			String sql = 	"Select ID, Name, Preis, Kategorie_ID, Unterkategorie_ID FROM Produkt\r\n" + 
							"where Kategorie_ID = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setLong(1, oberKategorie);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				produkt = new Produkt(resultSet.getInt("ID"), resultSet.getString("Name"), resultSet.getInt("Preis"), resultSet.getInt("Kategorie_ID"), resultSet.getInt("Unterkategorie_ID"));
				produktListe.add(produkt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return produktListe;
	}
	
	public String getProduktListe() {
		produktListeString = produktListe.toString();
		return produktListeString;
	}
}
