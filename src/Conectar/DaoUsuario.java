package Conectar;

import Clases.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DaoUsuario {
    
        public void crearUsuario(Usuarios usuario) throws ClassNotFoundException, SQLException  {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO users "
                    + "(id_usuario, nombre_usuario, contraseña, rol, nombre_trabajador, rut, dv, apellido_paterno, apellido_materno, telefono, email)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getNombreusu());
            stmt.setString(3, usuario.getContrausu());
            stmt.setString(4, usuario.getRol());
            stmt.setString(5, usuario.getNombretrab());
            stmt.setInt(6, usuario.getRut());
            stmt.setString(7, usuario.getDv());
            stmt.setString(8, usuario.getApellidop());
            stmt.setString(9, usuario.getApellidom());
            stmt.setInt(10, usuario.getTelefono());
            stmt.setString(11, usuario.getEmail());
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Usuario creada con éxito");
            
        } catch (SQLException e) {
            System.out.println("Error al crear usuario en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }

public Map<String, String> validateUser(String username, String password) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Map<String, String> userData = new HashMap<>();
    boolean valid = false;

    try {
        conn = con.getConnection();
        String sql = "SELECT * FROM users WHERE usuario = ? AND pass = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        rs = stmt.executeQuery();
        if (rs.next()) {
            String category = rs.getString("rol"); // Asegúrate de que el nombre del campo coincida con tu base de datos
            userData.put(username, category);
            valid = true;
        }
    } catch (SQLException e) {
        System.out.println("Error, en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt, rs);
    }

    // Si el usuario es válido, agrega el booleano "valid" al mapa antes de devolverlo
    userData.put("valid", String.valueOf(valid));
    return userData;
}
}
