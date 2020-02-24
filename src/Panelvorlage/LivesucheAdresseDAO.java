package Panelvorlage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Adresse;

public class LivesucheAdresseDAO {

	private String url;
	private String datei;
	

	public LivesucheAdresseDAO() throws ClassNotFoundException{
	
		// Verbindung initialisieren.
		
	}

	public ArrayList<Adresse> lifesuche(String eingabe) throws ClassNotFoundException {
			Class.forName("org.sqlite.JDBC");

		String datei = "AdressenBremen.db3";	
		String 	url	= "jdbc:sqlite:" + 	datei;	
		
		ArrayList<Adresse> adressen = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(url);
			// Erzeugen einer SQL-	Anweisung
			String 	sql	= "SELECT * from AdressenBremen where Strassenname like ?";
			PreparedStatement statement = conn.prepareStatement	(sql);
			statement.setString(1, "%"+eingabe+"%");
			ResultSet resultSet = statement.executeQuery();	
			while (resultSet.next()) {
				adressen.add(new Adresse(resultSet.getString("Strassenname"), resultSet.getInt("Postleitzahl"), resultSet.getString("ort")));
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return adressen;
	}
}
