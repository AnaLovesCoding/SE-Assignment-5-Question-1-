package model.dataAccess;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnection {
	public Connection getDataBaseConnection(String URL, String USER, String PWD) throws ClassNotFoundException, SQLException;
}
