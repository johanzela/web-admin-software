package util;
import java.sql.*;
public class SQLConexion
 { 
public static Connection getConexion(){ 
Connection con = null;
 try { Class.forName("com.mysql.cj.jdbc.Driver"); 
String url ="jdbc:sqlserver://localhost;database=base"; 
String usr = "sa"; 
String psw = "sql"; 
con = DriverManager.getConnection(url,usr,psw); } 
catch (ClassNotFoundException ex) { System.out.println("No hay Driver!!"); } 
catch (SQLException ex) 
{ System.out.println("Error con la BD"+ex.getMessage()); }
 return con; }
 } 