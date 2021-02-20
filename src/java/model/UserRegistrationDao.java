package model;

import bean.UserRegistrationBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegistrationDao {

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Statement stmt = null;

    public UserRegistrationBean authenticate(String email, String pass) {
        UserRegistrationBean obj = new UserRegistrationBean();
        try {
            con = MyConnection.getMyConnection();
            String sql = "SELECT fname, lname, pass, email, mobile, dob, col, gen, pic FROM registration  where email=? AND pass=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, pass);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                obj.setFname(rs.getString("fname"));
                obj.setLname(rs.getString("lname"));
                obj.setPass(rs.getString("pass"));
                obj.setEmail(rs.getString("email"));
                obj.setMobile(rs.getString("mobile"));
                obj.setDob(rs.getString("dob"));
                obj.setCol(rs.getString("col"));
                obj.setGen(rs.getString("gen"));
                obj.setPic(rs.getNString("pic"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return obj;

    }

    public int UserRegistration(UserRegistrationBean urb) {
        int result = 0;
        System.out.println(urb);
        try {
            con = MyConnection.getMyConnection();
            String sql = "INSERT INTO registration(fname,lname,pass,email,mobile,dob,col,gen,pic) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, urb.getFname());
            pstmt.setString(2, urb.getLname());
            pstmt.setString(3, urb.getPass());
            pstmt.setString(4, urb.getEmail());
            pstmt.setString(5, urb.getMobile());
            pstmt.setString(6, urb.getDob());
            pstmt.setString(7, urb.getCol());
            pstmt.setString(8, urb.getGen());
            pstmt.setString(9, urb.getPic());
            System.out.println("..................................................");
            result = pstmt.executeUpdate();
            if(result>0){
                System.out.println("Dao deployed Successfully");
            }
            else{
                System.out.println("Dao Failed");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return result;
    }
    public UserRegistrationBean getUserByEmail(String email) {
        UserRegistrationBean obj = new UserRegistrationBean();
        try {
            con = MyConnection.getMyConnection();
            String sql = "SELECT fname, lname, pass, email, mobile, dob, col, gen, pic FROM registration  where email=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                obj.setFname(rs.getString("fname"));
                obj.setLname(rs.getString("lname"));
                obj.setPass(rs.getString("pass"));
                obj.setEmail(rs.getString("email"));
                obj.setMobile(rs.getString("mobile"));
                obj.setDob(rs.getString("dob"));
                obj.setCol(rs.getString("col"));
                obj.setGen(rs.getString("gen"));
                obj.setPic(rs.getNString("pic"));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return obj;

    }

}
