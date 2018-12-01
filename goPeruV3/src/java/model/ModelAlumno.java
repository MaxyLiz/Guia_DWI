package model;

import miConexion.MysqlDBConexion;
import entidad.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelAlumno 
{
    public int insertaAlumno(Alumno obj)
    {      
        int salida = -1;
        try {
        Connection conn;
        PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "insert into tbalumno values(null,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getNombre());
            pstm.setString(2, obj.getApellido());
            pstm.setInt(3, obj.getEdad());
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;    
    }
    
    
    public ArrayList<Alumno> listaAlumno()
    {     
        ArrayList<Alumno> data = new ArrayList<>();
        try {     
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;
           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from tbalumno";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Alumno obj;
            
            while(rs.next())
            {
                obj = new Alumno();
                obj.setIdAlumno(rs.getInt("idtbalumno"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setEdad(rs.getInt("edad"));
                data.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;      
    }
    
    
    public int actualizaAlumno(Alumno obj)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;          
            conn = MysqlDBConexion.getConexion();
            String sql = "update tbalumno set nombre=?, apellido=?, edad=? where idtbalumno=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getNombre());
            pstm.setString(2, obj.getApellido());
            pstm.setInt(3, obj.getEdad());
            pstm.setInt(4, obj.getIdAlumno());
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
    
    
    public Alumno buscaAlumno(int idAdlumno)
    {
        Alumno obj = null;
        try {
            Connection conn;
            PreparedStatement pstm;
            ResultSet rs;           
            conn = MysqlDBConexion.getConexion();
            String sql = "select * from tbalumno where idtbalumno=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idAdlumno);            
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                obj = new Alumno();
                obj.setIdAlumno(rs.getInt("idtbalumno"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setEdad(rs.getInt("edad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    
    public int eliminaAlumno(int idAlumno)
    {
        int salida = -1;
        try { 
            Connection conn;
            PreparedStatement pstm;        
            conn = MysqlDBConexion.getConexion();
            String sql = "delete from tbalumno where idtbalumno=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,idAlumno);
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
            return salida;   
    }
}