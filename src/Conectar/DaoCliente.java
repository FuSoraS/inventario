package Conectar;

import Clases.Cliente;
import Clases.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoCliente {
        public void AgregarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
                try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO cliente "
                    + "(nombre_completo, direccion, telefono)"
                    + " VALUES (?, ?, ?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre_completo());
            stmt.setString(2, cliente.getDireccion());
            stmt.setString(3, cliente.getTelefono());
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Cliente creada con éxito");
            
        } catch (SQLException e) {
            System.out.println("Error al crear cliente en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }
}
