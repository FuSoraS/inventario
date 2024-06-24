
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
            String sql = "INSERT INTO producto (nombre, stock_inicial, precio_venta) VALUES (? ,?, ?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, producto.getNombre());
            stmt.setInt(2, producto.getStock_inicial()); //stock
            stmt.setInt(3, producto.getPrecio()); //stock
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Producto Creado con exito");
            
        } catch (SQLException e) {
            System.out.println("Error el producto en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }
        // Cargar las tablas
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

    public void EliminarProducto(int id) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "DELETE FROM producto WHERE id_producto = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Producto eliminada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningun producto con el ID especificado");
        }
    } catch (SQLException e) {
        System.out.println("Error al eliminar produto en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
}
    public void ModificarProducto(Productos productos) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "UPDATE producto SET nombre = ?, stock_inicial = ?, precio_venta = ? WHERE id_producto = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, productos.getNombre());
        stmt.setInt(2, productos.getStock_inicial());
        stmt.setInt(3, productos.getPrecio());
        stmt.setInt(4, productos.getId());
        
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "No se encontró ningun producto con el ID especificado");
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar producto en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }

}
            // Cargar table de venta, tabla perdidos, tabla de venta
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
    public void cargarTabla3(JTable tablaVenta) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio");

        tablaVenta.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_producto, nombre, stock_inicial, precio_venta FROM producto";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_producto = rs.getInt(1);
                String nombre = rs.getString(2);
                int stock_inicial = rs.getInt(3);
                int precio = rs.getInt(4);
                Object[] datos = {id_producto, nombre, stock_inicial, precio};
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
    // carga la tabla de inventario de la codificacion de producto
     public void cTablaInvenProducto(JTable tablaCodifProducto) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Codificacion Producto");
        
        tablaCodifProducto.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_producto, nombre, co_producto FROM codiProducto";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_producto = rs.getInt(1);
                String nombre = rs.getString(2);
                String co_producto = rs.getString(3);
                Object[] datos = {id_producto, nombre, co_producto};
                modelo.addRow(datos);
            }

            tablaCodifProducto.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 } 
    // Cargar tabla de fiarInterfaz Productos
       public void cTablaFiarProducto(JTable tablaVenta) throws ClassNotFoundException {
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
        public void cTablaBodega(JTable tablaBodega) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");

        tablaBodega.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_producto, nombre FROM producto";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                Object[] datos = {id, nombre};
                modelo.addRow(datos);
            }

            tablaBodega.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 } 
}

