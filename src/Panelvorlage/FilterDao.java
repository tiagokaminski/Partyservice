package Panelvorlage;

import java.sql.Connection;

public class FilterDao {
	private String datei;
	private String url;
	private Connection conn;

	public FilterDao() {
		try {
			Class.forName("org.sqlite.JDBC");

			datei= "emailverwaltung_db.db3";
			url= "jdbc:sqlite:" + datei;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}