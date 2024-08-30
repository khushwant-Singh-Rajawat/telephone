/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kush.models;
import java.sql.*;
/**
 *
 * @author acer
 */
public class Mylib 
{
    public Connection createconnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //create database connection
            String dbpath = "jdbc:mysql://localhost:3306/telephone";
            String dbuser = "root";
            String dbpass = "";
            cn = DriverManager.getConnection(dbpath, dbuser, dbpass);
        } catch (Exception e) {
            System.out.println(e);
        }
        return cn;
    }
    
     public String checkLogin(int id, String pass) {
        String ans = null;
        try {
            String s1 = "Select Role from logindata where id=" + id + "and password=" + pass;
            ResultSet r1 = fetchData(s1);
            if (r1.next()) {
                ans = r1.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error: Check Login" + e);
        }
        return ans;
    }
     
     public ResultSet fetchData(String query) {
        ResultSet rs = null;
        try {
            Mylib obj = new Mylib();
            Connection cn = obj.createconnection();
            PreparedStatement p1 = cn.prepareStatement(query);
            rs = p1.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: Check Fetch Data" + e);
        }
        return rs;
    }
     public void createLogin(int id, String pass, String role, int status) {
        try {
          //load my sql connection
            //connect sql
            Mylib obj = new Mylib();
            Connection cn = obj.createconnection();

            String s1 = "insert into logindata values(?,?,?,?)";
            PreparedStatement p1 = cn.prepareStatement(s1);
            p1.setInt(1, id);
            p1.setString(2, pass);
            p1.setString(3, role);
            p1.setInt(4, status);
            p1.executeQuery();
        } catch (Exception e) {
            System.out.println("ERROR: Check Create login" + e);
        }
    }

    public int generateId(String tablename, int startvalue) {
        int id = startvalue;
        try {
            String s1 = "select * from tablename=" + tablename;
            ResultSet r1 = fetchData(s1);
            if (r1.next()) {
                while (r1.next()) {
                    id = r1.getInt(1);
                }
                id = id + 1;
            }
        } catch (Exception e) {
            System.out.println("ERROR: Check Generate Id" + e);
        }
        return id;
    }
}
