package library;

import java.sql.*;
public class Connector {
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "root";

    Connection conn;
    public Connector() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        // tao connect
        conn = DriverManager.getConnection(connectionString,user,password);
    }

    public PreparedStatement getStatement(String sql) throws Exception{
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement;
    }
}
