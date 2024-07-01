package Conectar;

import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
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
                    + "(nombre_completo, direccion, telefono, interes, credito_limite, fecha)"
                    + " VALUES (?, ?, ?, ?, ?, ?)"; // Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre_completo());
            stmt.setString(2, cliente.getDireccion());
            stmt.setString(3, cliente.getTelefono());
            stmt.setDouble(4, cliente.getInteres());
            stmt.setInt(5, cliente.getCredito_limite());
            stmt.setDate(6, cliente.getFecha());
            stmt.executeUpdate(); // Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Cliente creado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al crear cliente en la base de datos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al crear cliente en la base de datos: " + e.getMessage());
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
            String sql = "UPDATE cliente SET nombre_completo = ?, direccion = ?, telefono = ?, interes = ?, "
                    + "credito_limite = ?, fecha = ? WHERE cliente_id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre_completo());
            stmt.setString(2, cliente.getDireccion());
            stmt.setString(3, cliente.getTelefono());
            stmt.setDouble(4, cliente.getInteres());
            stmt.setInt(5, cliente.getCredito_limite());
            stmt.setDate(6, cliente.getFecha());
            stmt.setInt(7, cliente.getId());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected <= 0) {
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el ID especificado");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente modificado con éxito");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar cliente en la base de datos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar cliente en la base de datos: " + e.getMessage());
        } finally {
            Conecta.closeConnection(conn, stmt);
        }
    }
    
    public void EliminarCliente(int id) throws ClassNotFoundException, SQLException {
        Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "DELETE FROM cliente WHERE cliente_id  = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningun cliente con el ID especificado");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente en la base de datos: " + e.getMessage());
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
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Interes");
        modelo.addColumn("Credito limite");
        modelo.addColumn("FechaVencimiento");

        TablaCliente2.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();
        TablaCliente2.setModel(modelo);
        // Ajusta el tamaño de la columna de id
        TablaCliente2.getColumnModel().getColumn(0).setPreferredWidth(30);
        TablaCliente2.getColumnModel().getColumn(0).setMinWidth(20);       
        TablaCliente2.getColumnModel().getColumn(0).setMaxWidth(50);

        try {
            conn = con.getConnection();
            String sql = "SELECT cliente_id, nombre_completo, direccion, telefono, interes, credito_limite, fecha FROM cliente";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("cliente_id");
                String nombre = rs.getString("nombre_completo");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                double interes = rs.getDouble("interes");
                int credito_limite = rs.getInt("credito_limite");
                Date fecha = rs.getDate("fecha");

                Object[] datos = {id, nombre, direccion, telefono, interes, credito_limite, fecha};
                modelo.addRow(datos);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
        }
    }

// Metodo para cargar la tabla de clientes de la interfaz de fiar
    public void cTablaFiarCliente(JTable TablaCliente2) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Credito limite");
        modelo.addColumn("Credito usado");

        TablaCliente2.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();
        TablaCliente2.setModel(modelo);

        try {
            conn = con.getConnection();
            String sql = "SELECT nombre_completo, credito_limite, credito_usado FROM cliente";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre_completo");
                int credito_limite = rs.getInt("credito_limite");
                int credito_usado = rs.getInt("Credito_Usado");
                Object[] datos = {nombre, credito_limite, credito_usado};
                modelo.addRow(datos);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
        }
    }
public void actualizarCreditoUsadoCliente(String nombreCliente, int nuevoCreditoUsado) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = con.getConnection();
        String sql = "UPDATE cliente SET credito_usado = ? WHERE nombre_completo = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, nuevoCreditoUsado);
        stmt.setString(2, nombreCliente);

        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el nombre especificado");
        } else {
            JOptionPane.showMessageDialog(null, "Crédito usado actualizado con éxito");
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar crédito usado en la base de datos: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al actualizar crédito usado en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
}
public Cliente obtenerClientePorNombre(String nombreCliente) throws ClassNotFoundException, SQLException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = con.getConnection();
        String sql = "SELECT credito_usado, credito_limite FROM cliente WHERE nombre_completo = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, nombreCliente);
        rs = stmt.executeQuery();

        if (rs.next()) {
            int creditoUsado = rs.getInt("credito_usado");
            int creditoLimite = rs.getInt("credito_limite");
            Cliente cliente = new Cliente();
            cliente.setCredito_usado(creditoUsado);
            cliente.setCredito_limite(creditoLimite);
            return cliente;
        } else {
            throw new SQLException("Cliente no encontrado");
        }
    } finally {
        Conecta.closeConnection(conn, stmt, rs);
    }
}

}
