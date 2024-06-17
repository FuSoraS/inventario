package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conecta {
        
    //Constantes 
    
    // Local
    /*
    public static final String url = "jdbc:mysql://localhost/inventario2"; // Nombre dominio, puerto del servidor y nombre bd                          
    public static final String user = "root"; // Usuario y contraseña -> NO ROOT EN PRODUCCIÓN
    public static final String password = "1234";
   */
    // Ipchile
    public static final String url = "jdbc:mysql://localhost/inventario2"; // Nombre dominio, puerto del servidor y nombre bd                          
    public static final String user = "root"; // Usuario y contraseña -> NO ROOT EN PRODUCCIÓN
    public static final String password = "ipchile";
    
    //Instancia de la clase conexión
    Connection conn = null;
    
    public Conecta() throws ClassNotFoundException{
        try { 
            conn = DriverManager.getConnection(url,user,password);
            //System.out.println("CONEXIÓN ESTABLECIDA");
        } catch (SQLException e) {
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null, "Error en la conexión");
        }      
    }
    
    public Connection getConnection(){ 
        return this.conn;   
    }
    
     public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
        }
    }

    //Sobrecarga del método para cerrar la conexión sin ResultSet
    public static void closeConnection(Connection conn, PreparedStatement stmt) {
        closeConnection(conn, stmt, null);
    }
}
