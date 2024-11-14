package controlador;
import modelo.Cliente;
import modelo.lisruta;
import modelo.lisguia;
import modelo.guias;
import modelo.viajes;
import modelo.pasajero;
import modelo.chofer;
import modelo.viajesChofer;
import modelo.asesorVenta;
import java.util.*;
import util.MySQLConexion;
import java.sql.*;//conexion , el acceso a datos
public class Negocio {
  public void adicion(pasajero p){
   Connection cn=MySQLConexion.getConexion();
   try{
     String sql="insert into pasajero (cod_boleto,nombre,asiento,pago) values(null,?,?,?)";  
     //prepara una instruccion sql que sera ejecutada mediante la conexion
     PreparedStatement st=cn.prepareStatement(sql);
     st.setString(1, p.getNombre());
     st.setInt(2, p.getAsiento());
     st.setDouble(3, p.getPago());
     st.executeUpdate();
   }catch(Exception ex){
       System.out.println(ex.getMessage());
       ex.printStackTrace();
   }
   
  }
  //modificar
    public void modifica(Cliente p){
   Connection cn=MySQLConexion.getConexion();
   try{
     String sql="update cliente set cliente=?,Tipo=?,costo=? ,años=? where ID=?";  
     //prepara una instruccion sql que sera ejecutada mediante la conexion
     PreparedStatement st=cn.prepareStatement(sql);
     st.setString(1, p.getCliente());
       st.setInt(2, p.getTipo());
     st.setDouble(3, p.getCosto());
     st.setInt(4, p.getAño());
     st.setInt(5, p.getNro());
     st.executeUpdate();
   }catch(Exception ex){
       ex.printStackTrace();
   }
   }  
 //anulacion
    public void anula(int cod_boleto){
   Connection cn=MySQLConexion.getConexion();
   try{
     String sql="delete from pasajero where cod_boleto=?";  
     //prepara una instruccion sql que sera ejecutada mediante la conexion
     PreparedStatement st=cn.prepareStatement(sql);
     st.setInt(1, cod_boleto);
     st.executeUpdate();
   }catch(Exception ex){
       ex.printStackTrace();
   }
   }
    //anula asesor
        public void anulasesor(String cod_asesor){
   Connection cn=MySQLConexion.getConexion();
   try{
     String sql="delete from asesorventa where cod_asesor=?";  
     //prepara una instruccion sql que sera ejecutada mediante la conexion
     PreparedStatement st=cn.prepareStatement(sql);
     st.setString(1, cod_asesor);
     st.executeUpdate();
   }catch(Exception ex){
       ex.printStackTrace();
   }
   }
    
  //listado ruta
     public List<lisruta> lisru(){
    List<lisruta> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select id_ruta, ruta from lisruta";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       lisruta p=new lisruta();
       p.setId_ruta(rs.getString(1));
       p.setRuta(rs.getString(2));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
     //listado guias del personal
     public List<guias> guias(){
    List<guias> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_guia,horas,fecha,cosguia from guias";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       guias p=new guias();
       p.setCod_guia(rs.getString(1));
       p.setHoras(rs.getInt(2));
       p.setFecha(rs.getDate(3));
       p.setCosguia(rs.getDouble(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
       //listado asesores de venta
     public List<asesorVenta> lisasesor(){
    List<asesorVenta> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_asesor,nombre,fecha,area from asesorventa";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       asesorVenta p=new asesorVenta();
       p.setCod_asesor(rs.getString(1));
       p.setNombre(rs.getString(2));
       p.setFecha(rs.getDate(3));
       p.setArea(rs.getString(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
          //listado viajes ofrecidos rutas
     public List<viajes> viajes(){
    List<viajes> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_viaje,fecha,hora,costo from viajes";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       viajes p=new viajes();
       p.setCod_viaje(rs.getString(1));
       p.setFecha(rs.getDate(2));
       p.setHora(rs.getString(3));
       p.setCosto(rs.getDouble(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
      //listado viajes ofrecidos rutas
     public List<pasajero> lispasajero(){
    List<pasajero> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_boleto,nombre,asiento,pago from pasajero";   
   //  String sql="{call cliente()}";  
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       pasajero p=new pasajero();
       p.setCod_boleto(rs.getInt(1));
       p.setNombre(rs.getString(2));
       p.setAsiento(rs.getInt(3));
       p.setPago(rs.getDouble(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
     
         //listado viajes del chofer 
     public List<viajesChofer> lisviajechofer(){
    List<viajesChofer> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_ruta,horas,fecha,cosvia from viajeschofer";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       viajesChofer p=new viajesChofer();
       p.setCod_ruta(rs.getString(1));
       p.setHoras(rs.getInt(2));
       p.setFecha(rs.getDate(3));
       p.setCosvia(rs.getDouble(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   }   
       //listado viajes ofrecidos rutas
     public List<chofer> lischofer() {
    List<chofer> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="Select cod_chofer,nombre,fecha,categoria from chofer";   
     PreparedStatement st=cn.prepareStatement(sql);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       chofer p=new chofer();
       p.setCod_chofer(rs.getString(1));
       p.setNombre(rs.getString(2));
       p.setFecha(rs.getDate(3));
       p.setCategoria(rs.getString(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
     //listado guia
     public List<lisguia> lisguia(String idRuta){
    List<lisguia> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
    try{
     String sql="{call spListaGuia(?)}";   
     PreparedStatement st=cn.prepareStatement(sql);
     st.setString(1, idRuta);
     ResultSet rs=st.executeQuery();
     while(rs.next()){
       lisguia p=new lisguia();
       p.setId_guia(rs.getString(1));
       p.setNombre(rs.getString(2));
       p.setFecha(rs.getDate(3));
       p.setOrigen(rs.getString(4));
       lis.add(p);
     }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    return lis;   
   } 
//consulta login
    public boolean login(String usuario,String contraseña){
    Cliente p=null;
    Connection cn=MySQLConexion.getConexion();
    try{
      String slq="select usuario, contraseña from login  where usuario=? and contraseña=?";  
        PreparedStatement st=cn.prepareStatement(slq);
        st.setString(1, usuario );
        st.setString(2, contraseña);
        ResultSet rs=st.executeQuery();
        if(rs.next())//leer cada fila de la tabla
           return true; 
    }catch(Exception ex){
       // ex.printStackTrace();
          return false;
    }
       return false;
       
   }   
     
     
     
     
   public List<Cliente> listado(){
    List<Cliente> lis=new ArrayList();
    Connection cn=MySQLConexion.getConexion();
     String sql="select ID,cliente,Tipo,costo,años from cliente"; 
    try{ 
        PreparedStatement st=cn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){//leer cada fila de la tabla
           Cliente p=new Cliente();
            p.setNro(rs.getInt(1));
            p.setCliente(rs.getString(2));
            p.setTipo(rs.getInt(3));
            p.setCosto(rs.getDouble(4));
            p.setAño(rs.getInt(5));
            lis.add(p); //el objeto cliente de un cliente pasar a la lista
        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
       return lis;
       
   } 
    //consultar x nro de cliente
   public Cliente consulta(int nro){
    Cliente p=null;
    Connection cn=MySQLConexion.getConexion();
    try{
      String slq="select ID,cliente,costo , años from cliente  where ID=?";  
        PreparedStatement st=cn.prepareStatement(slq);
        st.setInt(1, nro);
        ResultSet rs=st.executeQuery();
        if(rs.next()){//leer cada fila de la tabla
            p= new Cliente();
            p.setNro(rs.getInt(1));
            p.setCliente(rs.getString(2));
            p.setCosto(rs.getDouble(3));
            p.setAño(rs.getInt(4));
                  }
    }catch(Exception ex){
        ex.printStackTrace();
    }
       return p;
       
   } 
   //buscar nombre
   
   public boolean busNombre(String nom){
    Cliente p=null;
    Connection cn=MySQLConexion.getConexion();
    try{
      String slq="select count(cliente) from cliente  where cliente=?";  
        PreparedStatement st=cn.prepareStatement(slq);
        st.setString(1, nom);
        ResultSet rs=st.executeQuery();
        if(rs.next())//leer cada fila de la tabla
           return true; 
    }catch(Exception ex){
        ex.printStackTrace();
    }
       return false;
       
   } 
    
   //Consulta por nro prestamo
    public pasajero obtener(int coboleto){
        pasajero p=null;
        Connection cn = MySQLConexion.getConexion();
        String sql="select cod_boleto,nombre,asiento,pago from pasajero where cod_boleto=?";
        try{
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, coboleto); //pasarelparametroid
            ResultSet rs = st.executeQuery();
            if(rs.next()){//si existe retorna un solo valor
                p=new pasajero();
                p.setCod_boleto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setAsiento(rs.getInt(3));
                p.setPago(rs.getDouble(4));
            }
            st.executeUpdate(); //Ejecuta la acción de grabar
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return p;
    }
   
   //Update
    public void cambia(pasajero p){
        Connection cn = MySQLConexion.getConexion();
        String sql="update pasajero set nombre=?,asiento=?,pago=? where cod_boleto=?";
        try{
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, p.getNombre());
            st.setInt(2, p.getAsiento());
            st.setDouble(3, p.getPago());
            st.setInt(4, p.getCod_boleto());
            st.executeUpdate(); //Ejecuta la acción de grabar
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
    //Listado de Gráfico
    public List<lisruta> grafico(){
        List<lisruta> lis=new ArrayList();
        Connection cn = MySQLConexion.getConexion();        
        try {
            String sql="{call prueba()}";
            CallableStatement st=cn.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                lisruta p=new lisruta();
                p.setRuta(rs.getString(1));
                p.setCantidad(rs.getInt(2)); 
                lis.add(p); 
           }
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lis;
    }
      //Listado de Gráfico
    public List<lisguia> grafico1(){
        List<lisguia> lis=new ArrayList();
        Connection cn = MySQLConexion.getConexion();        
        try {
            String sql="{call prueba1()}";
            CallableStatement st=cn.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                lisguia p=new lisguia();
                p.setNombre(rs.getString(1));
                p.setCantidad(rs.getInt(2)); 
                lis.add(p); 
           }
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lis;
    }  
    
}
