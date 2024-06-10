package Conectar;

import Clases.Cliente;
import Clases.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    public void ModificarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "UPDATE cliente SET nombre_completo = ?, direccion = ?, telefono = ? WHERE cliente_id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, cliente.getNombre_completo());
        stmt.setString(2, cliente.getDireccion());
        stmt.setString(3, cliente.getTelefono());
        stmt.setInt(4, cliente.getId());
        
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
    public void cargarTablaCrear(JTable TablaCliente) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        
        TablaCliente.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT nombre_completo FROM cliente";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(1);

                Object[] datos = {nombre};
                modelo.addRow(datos);
            }

            TablaCliente.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
    public void cargarTablaModificar(JTable TablaCliente2) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        
        TablaCliente2.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT cliente_id, nombre_completo, direccion,telefono FROM cliente";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                String telefono = rs.getString(4);

                Object[] datos = {id, nombre, direccion, telefono};
                modelo.addRow(datos);
            }

            TablaCliente2.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
}
