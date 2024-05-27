
package Conectar;

import Clases.Categoria;
import Conectar.Conecta;
import Interfaz.categoriaInterfaz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DaoCategoria {
    
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //                                 Creacion-CATEGORIA                                  //
    //////////////////////////////////////////////////////////////////////////////////////////////////
        public void crearCategoria(Categoria categoria) throws ClassNotFoundException, SQLException  {
       Conecta con = new Conecta();
        Connection conn = null;
        PreparedStatement stmt = null;
                try {
            conn = con.getConnection(); // Obtener la conexión a la base de datos
            String sql = "INSERT INTO categoria "
                    + "(id_categoria, nombre_categoria, sub_categoria, tipo)"
                    + " VALUES (?, ?, ?, ?)"; //Sentencia SQL
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoria.getId_categoria());
            stmt.setString(2, categoria.getNombre_categoria());
            stmt.setString(3, categoria.getSub_categoria());
            stmt.setString(4, categoria.getTipo());
            stmt.executeUpdate();//Ejecuta la sentencia
            JOptionPane.showMessageDialog(null, "Marca creada con éxito");
            
        } catch (SQLException e) {
            System.out.println("Error al crear marca en la base de datos: " + e.getMessage());
        } finally {
           Conecta.closeConnection(conn, stmt);
        }
}
     //////////////////////////////////////////////////////////////////////////////////////////////////
    //                             SELECTO-CATEGORIA                                  //
    //////////////////////////////////////////////////////////////////////////////////////////////////
        public List<Categoria> obtenerCategorias() throws ClassNotFoundException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List<Categoria> categorias = new ArrayList<>();
    Conecta con = new Conecta();

    try {
        conn = con.getConnection();
        String sql = "SELECT * FROM categoria";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setId_categoria(rs.getInt("id_categoria"));
            categoria.setNombre_categoria(rs.getString("nombre_categoria"));
            categoria.setSub_categoria(rs.getString("sub_categoria"));
            categoria.setTipo(rs.getString("tipo"));
            categorias.add(categoria);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener las categorías: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt, rs);
    }

    return categorias;
}
        //////////////////////////////////////////////////////////////////////////////////////////////////
    //                             EDITAR-CATEGORIA                                  //
    //////////////////////////////////////////////////////////////////////////////////////////////////
      
    public void editarCategoria(Categoria categoria) throws ClassNotFoundException {
    Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "UPDATE categoria SET nombre_categoria = ?, sub_categoria = ?, tipo = ? WHERE id_categoria = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, categoria.getNombre_categoria());
        stmt.setString(2, categoria.getSub_categoria());
        stmt.setString(3, categoria.getTipo());
        stmt.setInt(4, categoria.getId_categoria());
        
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna categoria con el ID especificado");
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar categoria en la base de datos: " + e.getMessage());
    } finally {
        Conecta.closeConnection(conn, stmt);
    }
    
}
        
     //////////////////////////////////////////////////////////////////////////////////////////////////
    //                           Eliminar-CATEGORIA                                  //
    //////////////////////////////////////////////////////////////////////////////////////////////////
       
        public void eliminarCategoria(int id_categoria) throws ClassNotFoundException {
       Conecta con = new Conecta();
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
        conn = con.getConnection(); // Obtener la conexión a la base de datos
        String sql = "DELETE FROM categoria WHERE id_categoria = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id_categoria);
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
        
     //////////////////////////////////////////////////////////////////////////////////////////////////
    //                              TABLAs-CATEGORIAS                                       //
    //////////////////////////////////////////////////////////////////////////////////////////////////
       public void cargarTablaCreate(JTable jtable_create) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Categoria");
        modelo.addColumn("Sub Categoria");
        
        jtable_create.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_categoria, nombre_categoria, sub_categoria FROM categoria";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_categoria = rs.getInt(1);
                String nombre_categoria = rs.getString(2);
                String sub_categoria = rs.getString(3);
                
                Object[] datos = {id_categoria, nombre_categoria, sub_categoria};
                modelo.addRow(datos);
            }

            jtable_create.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
       //-------------------------------------------------------------------------------------------
       
       public void cargarTablaEdit(JTable jtable_edit) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Categoria");
        modelo.addColumn("Sub Categoria");
        modelo.addColumn("Tipo");
        
        jtable_edit.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_categoria, nombre_categoria, sub_categoria, tipo FROM categoria";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_categoria = rs.getInt(1);
                String nombre_categoria = rs.getString(2);
                String sub_categoria = rs.getString(3);
                String tipo = rs.getString(4);
                
                Object[] datos = {id_categoria, nombre_categoria, sub_categoria,tipo};
                modelo.addRow(datos);
            }

            jtable_edit.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
       //--------------------------------------------------------------------------------------------
       
       public void cargarTablaView(JTable jtable_view) throws ClassNotFoundException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Categoria");
        modelo.addColumn("Sub Categoria");
        
        jtable_view.setModel(modelo);
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conecta con = new Conecta();

        try {
            conn = con.getConnection();
            String sql = "SELECT id_categoria, nombre_categoria, sub_categoria, tipo FROM categoria";
            // Se ejecuta la orden descrita en la variable sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_categoria = rs.getInt(1);
                String nombre_categoria = rs.getString(2);
                String sub_categoria = rs.getString(3);
                String tipo = rs.getString(4);
                
                Object[] datos = {id_categoria, nombre_categoria, sub_categoria,tipo};
                modelo.addRow(datos);
            }

            jtable_view.setModel(modelo);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        } finally {
            Conecta.closeConnection(conn, ps);
    }
 }
   
//////////////////////////////////////////////////////////////////////////////////////////////////
    //                              BUSQUEDA-EN-LA-TABLAS                              //
    //////////////////////////////////////////////////////////////////////////////////////////////////
    
     public void BuscarCategoria(String Nombre,JTextField txt_busqueda, JTextField txt_nombre_ID_edit, JTextField txt_nombre_cat_edit, JTextField txt_subcate_edit, JTextField txt_tipo_edit, JTable jtable_view) throws ClassNotFoundException, SQLException {
     Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conecta con = new Conecta();
    
    try { 
        conn = con.getConnection();
        String sql = "SELECT nombre, descripcion FROM marcas WHERE nombre LIKE ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + Nombre + "%");
        rs = ps.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) jtable_view.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
        
        while (rs.next()) {
            model.addRow(new Object[]{rs.getInt("id_categoria"), rs.getString("nombre_categoria")
                                         ,rs.getString("sub_categoria"), rs.getString("tipo") });
        }
        
        if (model.getRowCount() == 0) {
            txt_nombre_ID_edit.setText("");
            txt_nombre_cat_edit.setText("");
            txt_subcate_edit.setText("");
            txt_tipo_edit.setText("");
        } else {
            // Si hay resultados, muestra el primer resultado en los campos de texto
            int filaSeleccionada = jtable_view.getSelectedRow();
            if (filaSeleccionada != -1) {
                txt_nombre_ID_edit.setText((String) jtable_view.getValueAt(0, 0));
                txt_nombre_cat_edit.setText((String) jtable_view.getValueAt(0, 1));
                txt_subcate_edit.setText((String) jtable_view.getValueAt(0, 0));
                txt_tipo_edit.setText((String) jtable_view.getValueAt(0, 0));
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

   
     
        
        
} //fin