package Conectar;

import Clases.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoInventario {
        public Timestamp obtenerUltimaFechaModificacion() throws ClassNotFoundException, SQLException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Timestamp ultimaFecha = null;

        try {
            conn = con.getConnection();
            String sql = "SELECT MAX(fecha) AS ultima_fecha FROM historial";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs.next()) {
                ultimaFecha = rs.getTimestamp("ultima_fecha");
            }
        } catch (SQLException e) {
            System.out.println("Error obteniendo la última fecha de modificación: " + e.getMessage());
        } finally {
            Conecta.closeConnection(conn, stmt, rs);
        }

        return ultimaFecha;
    }
public void cargarHistorial(JTable tablaHistorial) throws ClassNotFoundException {
    DefaultTableModel modelo = new DefaultTableModel();    
    modelo.addColumn("Nombre");
    modelo.addColumn("Stock");
    modelo.addColumn("Vendido");
    modelo.addColumn("Perdido");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Stock Actual");
    modelo.addColumn("Fecha");

    tablaHistorial.setModel(modelo);
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conecta con = new Conecta();

    try {
        conn = con.getConnection();
        String sql = "SELECT nombre_producto, stock, vendido, perdido, descripcion_perdido, stock_actual, fecha FROM historial";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            String nombreProducto = rs.getString("nombre_producto");
            int stock = rs.getInt("stock");
            int vendido = rs.getInt("vendido");
            int perdido = rs.getInt("perdido");
            String descripcionPerdido = rs.getString("descripcion_perdido");
            int stockActual = rs.getInt("stock_actual");
            Timestamp fecha = rs.getTimestamp("fecha");

            Object[] datos = {nombreProducto, stock, vendido, perdido, descripcionPerdido, stockActual, fecha};
            modelo.addRow(datos);
        }
        tablaHistorial.setModel(modelo);
        rs.close();
        ps.close();
    } catch (SQLException ex) {
        System.out.println("ERROR " + ex);
    } finally {
        Conecta.closeConnection(conn, ps);
    }
}
   public void insertarHistorial(Productos producto, int vendido, int perdido, String descripcionPerdido, int stockActual) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = con.getConnection();
        String sql = "INSERT INTO historial (nombre_producto, stock, vendido, perdido, descripcion_perdido, stock_actual) VALUES (?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, producto.getNombre());
        stmt.setInt(2, producto.getStock_inicial());
        stmt.setInt(3, vendido);
        stmt.setInt(4, perdido);
        stmt.setString(5, descripcionPerdido);
        stmt.setInt(6, stockActual);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error insertando en la tabla de historial: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
}
}
