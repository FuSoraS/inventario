package Conectar;

import Clases.BodegaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class DaoBodegaFisica {

    public void AgregarStockBodega(BodegaFisica bodega, int id_producto) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet generatedKeys = null;

    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos

        // Insertar nuevo stock en la tabla bodegaFisica
        String sqlInsert = "INSERT INTO bodegaFisica (bodegaStock) VALUES (?)"; // Sentencia SQL
        stmt = conn.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
        stmt.setInt(1, bodega.getStock());
        stmt.executeUpdate(); // Ejecuta la sentencia

        // Obtener la ID generada para la bodega
        generatedKeys = stmt.getGeneratedKeys();
        int bodegaFisicaId = -1;
        if (generatedKeys.next()) {
            bodegaFisicaId = generatedKeys.getInt(1);
        } else {
            throw new SQLException("No se pudo obtener la ID de la nueva bodega.");
        }

        // Actualizar la tabla producto con la nueva ID de la bodega
        String sqlUpdate = "UPDATE producto SET bodegaFisicaId = ? WHERE id_producto = ?";
        stmt = conn.prepareStatement(sqlUpdate);
        stmt.setInt(1, bodegaFisicaId);
        stmt.setInt(2, id_producto);
        stmt.executeUpdate(); // Ejecuta la sentencia

        JOptionPane.showMessageDialog(null, "Stock agregado con éxito");

    } catch (SQLException e) {
        System.out.println("Error al agregar stock en la base de datos: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al agregar stock en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt, generatedKeys);
    }
}
    public int obtenerStockProducto(int id_producto) throws SQLException, ClassNotFoundException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int stockProducto = 0;

        try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "SELECT stock_inicial FROM producto WHERE id_producto = ?"; // Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_producto);
            rs = stmt.executeQuery(); // Ejecuta la sentencia

            if (rs.next()) {
                stockProducto = rs.getInt("stock_inicial");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el producto con id " + id_producto);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el stock del producto de la base de datos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al obtener el stock del producto de la base de datos: " + e.getMessage());
        } finally {
            Conecta.closeConnection(conn, stmt, rs);
        }

        return stockProducto;
    }
}



