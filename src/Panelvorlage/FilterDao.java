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
	private String produktnameSnacks;

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

			String sql = 	"Select Produktname FROM AlkoholSortiment\r\n" + 
							"WHERE Kategorie_ID = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, alkohol);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	public String snacksAusgewaehlt(String snacks) {
		try {
			conn2 = DriverManager.getConnection(url2);

			String sql = 	"Select Produktname FROM SnackSortiment\r\n" + 
							"WHERE Kategorie_ID = ?";
			PreparedStatement statement = conn2.prepareStatement(sql);
			statement.setString(1, snacks);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String snackss = resultSet.getString(produktnameSnacks);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return produktnameSnacks;
	}

	public void softdrinksAusgewaehlt(String softdrinks) {
		try {
			conn3 = DriverManager.getConnection(url3);

			String sql = 	"Select Produktname FROM SoftdrinksSortiment\r\n" + 
							"WHERE Kategorie_ID = ?";
			PreparedStatement statement = conn3.prepareStatement(sql);
			statement.setString(1, softdrinks);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	public void extrasAusgewaehlt(String extras) {
		try {
			conn4 = DriverManager.getConnection(url4);

			String sql = 	"Select Produktname FROM ExtraSortiment";
			PreparedStatement statement = conn4.prepareStatement(sql);
			statement.setString(1, extras);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
