package Panelvorlage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilterDao {
	private String datei;
	private String url;
	private Connection conn;
	private String datei2;
	private String url2;
	private Connection conn2;
	private String datei3;
	private String url3;
	private Connection conn3;
	private String datei4;
	private String url4;
	private Connection conn4;

	public FilterDao() {
		try {
			Class.forName("org.sqlite.JDBC");

			datei= "AlkoholSortiment.db3";
			url= "jdbc:sqlite:" + datei;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("org.sqlite.JDBC");

			datei2= "SnacksSortiment.db3";
			url2= "jdbc:sqlite:" + datei2;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("org.sqlite.JDBC");

			datei3= "SoftdrinkSortiment.db3";
			url3= "jdbc:sqlite:" + datei3;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("org.sqlite.JDBC");

			datei4= "ExtraSortiment.db3";
			url4= "jdbc:sqlite:" + datei4;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	public void alkoholAusgewaehlt(String alkohol) {
		try {
			conn = DriverManager.getConnection(url);

			String sql = "INSERT into email(vorname, nachname, email) values(?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	public void snacksAusgewaehlt(String snacks) {

	}

	public void softdrinksAusgewaehlt(String softdrinks) {

	}

	public void extrasAusgewaehlt(String extras) {

	}

}
