
package Conectar;

 import Clases.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            String sql = "INSERT INTO productos (nombre, Marca, Cat, Cantidad_Inicial, Precio_Venta, Precio_Costo, Cantida_Critica, Cantidad_Minima, Cantidad_Maxima) VALUES (? ,? ,? ,? ,? ,? ,? ,? ,?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getMarca());
            stmt.setString(3, producto.getCat());
            stmt.setInt(4, producto.getCantidad_Inicial()); //stock
            //stmt.setString(5, producto.getFecha_in());
            stmt.setInt(6, producto.getPrecio_Venta());
            stmt.setInt(7, producto.getPrecio_Costo());
            stmt.setInt(8, producto.getCantidad_Critico()); //Stock
            stmt.setInt(9, producto.getCantidad_Minima());
            stmt.setInt(10, producto.getCantidad_Maxima());
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Producto Creado con exito");
            
        } catch (SQLException e) {
            System.out.println("Error el producto en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }
        
}

