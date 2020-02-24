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

	public FilterDao() {
		try {
			Class.forName("org.sqlite.JDBC");

			datei= "AlkoholSortiment.db3";
			url= "jdbc:sqlite:" + datei;
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
}
