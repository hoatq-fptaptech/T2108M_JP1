package library;

import database.Connector;

import java.util.ArrayList;
import java.sql.*;

public class StudentRepository extends Repository{
    @Override
    public ArrayList<Student> list() {
        try {
            // truy van sql
            String txt_sql = "select * from Students";
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(txt_sql);
            ResultSet rs = stt.executeQuery();
            ArrayList<Student> list = new ArrayList<>();
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("studentName"),
                        Date.valueOf(rs.getString("dateOfBirth")),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("phoneNumber")
                );
                list.add(s);
            }
            return list;
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public void create(Student student) {
        String sql_txt = "insert into Students (studentName,dateOfBirth,address,email,phoneNumber) values(?,?,?,?,?)";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setString(1,student.getStudentName());
            stt.setString(2,student.getDateOfBirth().toString());
            stt.setString(3,student.getAddress());
            stt.setString(4,student.getEmail());
            stt.setString(5,student.getPhoneNumber());
            stt.execute();
        }catch (Exception e){

        }
    }

    @Override
    public void update(Student student) {
        String sql_txt = "update Students set studentName= ?,dateOfBirth = ?,address=?,email=?,phoneNumber= ? where id=?";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setString(1,student.getStudentName());
            stt.setString(2,student.getDateOfBirth().toString());
            stt.setString(3,student.getAddress());
            stt.setString(4,student.getEmail());
            stt.setString(5,student.getPhoneNumber());
            stt.setInt(6,student.getId());
            stt.execute();
        }catch (Exception e){

        }
    }

    @Override
    public void delete(Student student) {
        String sql_txt = "delete from Students where id=?";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setInt(1,student.getId());
            stt.execute();
        }catch (Exception e){

        }
    }

    public Student findById(int id) {
        try {
            // truy van sql
            String txt_sql = "select * from Students where id = ?";
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(txt_sql);
            stt.setInt(1,id);
            ResultSet rs = stt.executeQuery();
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("studentName"),
                        Date.valueOf(rs.getString("dateOfBirth")),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("phoneNumber")
                );
                return s;
            }
        }catch (Exception e){

        }
        return null;
    }

}
