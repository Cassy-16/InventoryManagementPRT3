package za.ac.cput.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection con;
    public static Connection getConnection() throws SQLException {
//        String url = "jdbc:derby://localhost:1527/IMS_DB";
        String username = "";
        String password = "";

//        con = DriverManager.getConnection(url, username, password);
        return con;
    }

    public static void closeConnection() throws SQLException{
        con.close();
    }
}
