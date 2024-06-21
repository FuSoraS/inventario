package Conectar;

import Clases.BodegaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoBodegaFisica {
        public void AgregarStockBodega(BodegaFisica bodega) throws ClassNotFoundException, SQLException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO bodegaFisica (bodegaStock) VALUES (?)"; // Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bodega.getStock());
            stmt.executeUpdate(); // Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Stock agregado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al agregar stock en la base de datos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al agregar stock en la base de datos: " + e.getMessage());
        } finally {
            Conecta.closeConnection(conn, stmt);
        }
    }
}
