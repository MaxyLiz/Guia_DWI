package model;

import entidad.Lugar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import miConexion.MysqlDBConexion;

public class ModelLugar 
{
    public int insertaLugar(Lugar obj)
    {      
        int salida = -1;
        try {
        Connection conn;
        PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "insert into lugar values(?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getCodlugar());
            pstm.setString(2, obj.getNombre());
            pstm.setString(3, obj.getDepartamento());
            pstm.setString(4, obj.getProvincia());
            pstm.setString(5, obj.getDistrito());
            pstm.setString(6, obj.getDescripcion());
            pstm.setString(7, obj.getFoto());
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;    
    }
    
    
    public ArrayList<Lugar> listaLugar()
    {     
        ArrayList<Lugar> data = new ArrayList<>();
        try {     
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;
           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from lugar";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Lugar obj;
            
            while(rs.next())
            {
                obj = new Lugar();
                obj.setCodlugar(rs.getInt("codlugar"));
                obj.setNombre(rs.getString("nombre"));
                obj.setDepartamento(rs.getString("departamento"));
                obj.setProvincia(rs.getString("provincia"));
                obj.setDistrito(rs.getString("distrito"));
                obj.setDescripcion(rs.getString("descripcion"));
                obj.setFoto(rs.getString("foto"));
                
                data.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;      
    }
    
    
    public int actualizaLugar(Lugar obj)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "update lugar set codlugar=?, nombre=?, departamento=?, provincia=?, distrito=?, descripcion=?, foto=? where codlugar=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getCodlugar());
            pstm.setString(2, obj.getNombre()); 
            pstm.setString(3, obj.getDepartamento());
            pstm.setString(4, obj.getProvincia());
            pstm.setString(5, obj.getDistrito());
            pstm.setString(6, obj.getDescripcion());
            pstm.setString(7, obj.getFoto());
            pstm.setInt(8, obj.getCodlugar());
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
    
    
    public Lugar buscaLugar(int codlugar)
    {
        Lugar obj = null;
        try {
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from lugar where codlugar=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, codlugar);            
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                obj = new Lugar();
                obj.setCodlugar(rs.getInt("codlugar"));
                obj.setNombre(rs.getString("nombre"));
                obj.setDepartamento(rs.getString("departammento"));
                obj.setProvincia(rs.getString("provincia"));
                obj.setDistrito(rs.getString("distrito"));
                obj.setDescripcion(rs.getString("descripcion"));
                obj.setFoto(rs.getString("foto"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    
    public int eliminaLugar(int codlugar)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;        
            conn = MysqlDBConexion.getConexion();
            String sql = "delete from lugar where codlugar=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,codlugar);
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
}