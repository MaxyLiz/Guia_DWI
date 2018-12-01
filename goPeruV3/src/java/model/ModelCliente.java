package model;

import miConexion.MysqlDBConexion;
import entidad.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelCliente
{
    public int insertaCliente(Cliente obj)
    {      
        int salida = -1;
        try {
        Connection conn;
        PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "insert into cliente values(?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getCodCliente());
            pstm.setString(2, obj.getNombre());
            pstm.setString(3, obj.getServicio());
            pstm.setString(4, obj.getCorreo());
            pstm.setString(5, obj.getContraseña());
            pstm.setInt(6, obj.getNivel());
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;    
    }
    
    
    public ArrayList<Cliente> listaCliente()
    {     
        ArrayList<Cliente> data = new ArrayList<>();
        try {     
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;
           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from cliente";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Cliente obj;
            
            while(rs.next())
            {
                //cualquier cosa lo que esta entre comillas con mayuscula
                obj = new Cliente();
                obj.setCodCliente(rs.getInt("codcliente"));
                obj.setNombre(rs.getString("nombre"));
                obj.setServicio(rs.getString("servicio"));
                obj.setCorreo(rs.getString("correo"));
                obj.setContraseña(rs.getString("contraseña"));
                obj.setNivel(rs.getInt("nivel"));
                data.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;      
    }
    
    
    public int actualizaCliente(Cliente obj)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "update cliente set codcliente=?, nombre=?, servicio=?, correo=?, contraseña=?, nivel=?  where codcliente = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getCodCliente());
            pstm.setString(2, obj.getNombre());
            pstm.setString(3, obj.getServicio());
            pstm.setString(4, obj.getCorreo());
            pstm.setString(5, obj.getContraseña());
            pstm.setInt(6, obj.getNivel());
            pstm.setInt(7, obj.getCodCliente());
            
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
    
    //puede abeer errp con IdCliente
    public Cliente buscaCliente(int CodCliente)
    {
        Cliente obj = null;
        try {
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from cliente where codcliente=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, CodCliente);            
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                obj = new Cliente();
                obj.setCodCliente(rs.getInt("codcliente"));
                obj.setNombre(rs.getString("nombre"));
                obj.setServicio(rs.getString("servicio"));
                obj.setCorreo(rs.getString("correo"));
                obj.setContraseña(rs.getString("contraseña"));
                obj.setNivel(rs.getInt("nivel"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    
    public int eliminaCliente(int CodCliente)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;        
            conn = MysqlDBConexion.getConexion();
            String sql = "delete from cliente where codcliente=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,CodCliente);
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
}