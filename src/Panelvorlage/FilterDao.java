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
		
	}

	public ArrayList<Produkt> unterkategorieAusgewaehlt(int kategorie) throws ClassNotFoundException {		
		Class.forName("org.sqlite.JDBC");
		datei= "Produkte.db3";
		url= "jdbc:sqlite:" + datei;
		try {
			conn = DriverManager.getConnection(url);
			String sql = 	"Select ID, Name, Preis, Kategorie_ID, Unterkategorie_ID FROM Produkt\r\n" + 
							"where Unterkategorie_ID = 1";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setLong(1, kategorie);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				produkt = new Produkt(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("preis"), resultSet.getInt("kategorie"), resultSet.getInt("unterkategorie"));
				produktListe.add(produkt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return produktListe;
	}
	
	/*public void unterkategorieAusgewaehlt(String alkohol) {
		try {
			conn = DriverManager.getConnection(url);

			String sql = 	"Select Kategorie_ID FROM Produkt\r\n" + 
							"where Kategorie_ID = 1";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, alkohol);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
	}*/
	
	public String getProduktListe() {
		produktListeString = produktListe.toString();
		return produktListeString;
	}
}
