/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;
import util.MySQLConexion;
import java.util.*;
import modelo.Total_Mes;

public class Negocio1 {
    public List<Total_Mes> lisMes(int an){
        List<Total_Mes> lis=new ArrayList();
        Connection cn=MySQLConexion.getConexion();
        try{
           String sql="{call spmes(?)}" ;
          CallableStatement st=cn.prepareCall(sql);
          st.setInt(1, an);
          ResultSet rs=st.executeQuery();
          while(rs.next()){
              Total_Mes t=new Total_Mes();
              t.setMes(rs.getInt(1));
              t.setCantidad(rs.getInt(2));
              t.setTotal(rs.getDouble(3));
              lis.add(t);
          }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lis;
    }
}
