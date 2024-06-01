package Conectar;

import Clases.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoMarca {    
    public void AgregarMarca(Marca marca) throws ClassNotFoundException, SQLException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
                try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO marca "
                    + "(nombre, descripcion)"
                    + " VALUES (?, ?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, marca.getNombre());
            stmt.setString(2, marca.getDescripcion());
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Marca creada con éxito");
            
        } catch (SQLException e) {
            System.out.println("Error al crear marca en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
    }
 public void EliminarMarca(int id) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "DELETE FROM marca WHERE id_marca = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Marca eliminada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna marca con el ID especificado");
        }
    } catch (SQLException e) {
        System.out.println("Error al eliminar marca en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
}
public void ModificarMarca(Marca marca) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "UPDATE marca SET nombre = ?, descripcion = ? WHERE id_marca = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, marca.getNombre());
        stmt.setString(2, marca.getDescripcion());
        stmt.setInt(3, marca.getId());
        
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna marca con el ID especificado");
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar marca en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }

}
    // Cargar tabla de crear marca
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
            String sql = "SELECT nombre FROM marca";
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

    public void cargarTabla3(JTable TablaMarca3) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        
        TablaMarca3.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_marca, nombre, descripcion FROM marca";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);

                Object[] datos = {id, nombre, descripcion};
                modelo.addRow(datos);
            }

            TablaMarca3.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
        public void cargarTabla4(JTable TablaMarca4) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        
        TablaMarca4.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT nombre, descripcion FROM marca";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(1);
                String descripcion = rs.getString(2);

                Object[] datos = {nombre, descripcion};
                modelo.addRow(datos);
            }

            TablaMarca4.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
public void buscaMarca(String nombre, JTextField txtNombre, JTextField txtDescripcion, JTable tabla) throws ClassNotFoundException {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conecta con = new Conecta();
    
    try { 
        conn = con.getConnection();
        String sql = "SELECT nombre, descripcion FROM marca WHERE nombre LIKE ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%");
        rs = ps.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
        
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("nombre"), rs.getString("descripcion")});
        }
        
        if (model.getRowCount() == 0) {
            txtNombre.setText("");
            txtDescripcion.setText("");
        } else {
            // Si hay resultados, muestra el primer resultado en los campos de texto
            int filaSeleccionada = tabla.getSelectedRow();
            if (filaSeleccionada != -1) {
                txtNombre.setText((String) tabla.getValueAt(0, 0));
                txtDescripcion.setText((String) tabla.getValueAt(0, 1));
            }
        }
    } catch (SQLException ex) {
        System.out.println("ERROR: " + ex);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            System.out.println("ERROR al cerrar recursos: " + ex);
        }
    }
}
}