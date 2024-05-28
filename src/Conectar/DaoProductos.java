
package Conectar;

 import Clases.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

public class DaoProductos {
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //                                      PRODUCTOS                                  //
    //////////////////////////////////////////////////////////////////////////////////////////////////
        public void crearProducto(Productos producto) throws ClassNotFoundException, SQLException  {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO producto (nombre, stock_inicial) VALUES (? ,?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, producto.getNombre());
            stmt.setInt(2, producto.getStock_inicial()); //stock
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Producto Creado con exito");
            
        } catch (SQLException e) {
            System.out.println("Error el producto en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }
        public void cargarTabla(JTable TablaMarca) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        
        TablaMarca.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT nombre FROM producto";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(1);

                Object[] datos = {nombre};
                modelo.addRow(datos);
            }

            TablaMarca.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
        public void cargarTabla2(JTable tablaVenta) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");

        tablaVenta.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT nombre, stock_inicial FROM producto";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(1);
                int stock_inicial = rs.getInt(2);
                Object[] datos = {nombre, stock_inicial};
                modelo.addRow(datos);
            }

            tablaVenta.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }        
    
    public void actualizarProducto(Productos producto) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
        conn = con.getConnection();
        String sql = "UPDATE producto SET stock_inicial = ? WHERE nombre = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, producto.getStock_inicial());
        stmt.setString(2, producto.getNombre());
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error actualizando el producto en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
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
public void cargarHistorial(JTable tablaHistorial) throws ClassNotFoundException {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre del Producto");
    modelo.addColumn("Stock");
    modelo.addColumn("Vendido");
    modelo.addColumn("Perdido");
    modelo.addColumn("Descripcion de lo Perdido");
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
public void actualizarStockProducto(String nombreProducto, int nuevoStock) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = con.getConnection();
        String sql = "UPDATE producto SET stock_inicial = ? WHERE nombre = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, nuevoStock);
        stmt.setString(2, nombreProducto);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error actualizando el stock del producto: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
}

}

