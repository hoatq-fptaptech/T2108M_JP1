package session10;

import java.sql.*;
public class DemoSQL {
    // tao cac string ket noi
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "root";

    public static void main(String args[]){
        try {
            // goi driver
            Class.forName("com.mysql.jdbc.Driver");
            // tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            // khai bao Statement de truy van sql
            Statement stt = conn.createStatement();
            // truy van sql
            String txt_sql = "select * from persons";
            ResultSet rs = stt.executeQuery(txt_sql);

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("fullname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getInt("age"));
            }

            String insert_sql = "insert into persons(fullname,email,age) values('Hoa','hoa@gmail.com',20)";
            stt.execute(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
