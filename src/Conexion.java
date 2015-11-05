
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi Cruz
 * @author Eli Linares
 */
public class Conexion {
   public Connection conn;
   public Statement stmt, stmt2;

   Conexion(){
      try {
        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/ordenes";
        Class.forName ("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection (url, userName, password);
        stmt = (Statement) conn.createStatement();
        stmt2 = (Statement) conn.createStatement();        
      }catch (Exception e) { System.out.println ("Cannot connect to database server"); }
   }   
}
