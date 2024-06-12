package Conectar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DaoUsuario {
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
