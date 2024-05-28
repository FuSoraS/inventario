
package Conectar;

 import Clases.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
}

