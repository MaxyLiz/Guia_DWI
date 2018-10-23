package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class miConexion {
    
    private Connection conn;
    private  PreparedStatement consulta;
    private  ResultSet rs;
    String base, usuario, passw;
    
    public miConexion(){
        this.base="BD_Clientes";
        this.usuario="root";
        this.passw="";
    }
    
    public  void conectar() throws SQLException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+this.base, this.usuario, this.passw);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(miConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar() throws SQLException{
        this.conn.close();
    }
     public ResultSet mostrar_datos(String rucc) throws SQLException{
        this.conectar();
        this.consulta=this.conn.prepareStatement("select * from registro where ruc='"+rucc+"'");
        this.rs=this.consulta.executeQuery();
        return  rs;
    }
     
     public ResultSet mostrar_datos_todos() throws SQLException{
        this.conectar();
        this.consulta=this.conn.prepareStatement("select * from registro");
        this.rs=this.consulta.executeQuery();
        return  rs;
    }
     
     public boolean insertar_BD(String nnom, int rruc, String ccor, String ccon, String ddes) throws SQLException
     {
         this.conectar();
         try {
             this.consulta=this.conn.prepareStatement("insert into registro"
             + "(nombre, ruc, correo, contra ,descripcion)"+
                     "values('"+nnom+"','"+rruc+"','"+ccor+"','"+ccon+"','"+ddes+"')");
             boolean resultado=this.consulta.execute();
             return true;
         } catch (SQLException e) {
           //out.prinln(ex.getMessage);
             return false;
         }
     }
     
     public ResultSet actualizar_obtener_datos (int rucc) throws SQLException{
         this.conectar();
         this.consulta=this.conn.prepareStatement("select * from registro where ruc='"+rucc+"'");
         this.rs=this.consulta.executeQuery();
         return rs;
     }
     public  boolean actualizar_informacion(String nnom, int rruc, String ccor, String ccon, String ddes) throws SQLException{
         this.conectar();
         try {
             this.consulta=this.conn.prepareStatement("update registro set nombre='"+nnom+"',correo='"+ccor+"',contra='"+ccon+"',descripcion='"+ddes+"' where ruc='"+rruc+"'");
             boolean resultado=this.consulta.execute();
             return  true;
         } catch (Exception e) {
             return false;
         }
     }
}
