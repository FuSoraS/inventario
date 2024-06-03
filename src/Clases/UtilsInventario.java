package Clases;

import Conectar.DaoProductos;
import Conectar.DaoInventario;
import Interfaz.InventarioInterfaz;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class UtilsInventario {
    public static void actualizarFechaModificacion(JLabel FechaUltiMo) {
        DaoInventario inventario = new DaoInventario();
        try {
            Timestamp ultimaFecha = inventario.obtenerUltimaFechaModificacion();
            if (ultimaFecha != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                FechaUltiMo.setText(sdf.format(ultimaFecha));
            } else {
                FechaUltiMo.setText("No hay registros");
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    public static void cargarTablaProductos(JTable tablaPerdida) throws ClassNotFoundException {
    DaoProductos daoProductos = new DaoProductos();
    daoProductos.cargarTabla2(tablaPerdida);
    }
    public static void registrarPerdida(JFrame jframe, JTable tablaPerdida, JLabel LabelNombre, JTextField txtStockPerdido, JTextField txtDescripcionPerdido) {
    DaoProductos daoProductos = new DaoProductos();
    DaoInventario inventario = new DaoInventario();
    int selectedRow = tablaPerdida.getSelectedRow();
    
    if (selectedRow >= 0) {
        try {
            // Obterer datos de los label
            String nombreProducto = LabelNombre.getText();
            int cantidadPerdida = Integer.parseInt(txtStockPerdido.getText());
            String descripcionPerdida = txtDescripcionPerdido.getText();

            // Obtener el stock actual del producto seleccionado
            int stockActual = Integer.parseInt(tablaPerdida.getValueAt(selectedRow, 1).toString());

            // Calcular el nuevo stock
            int nuevoStock = stockActual - cantidadPerdida;
            if (nuevoStock < 0) {
                JOptionPane.showMessageDialog(jframe, "Cantidad perdida no puede ser mayor al stock actual.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Actualizar el stock del producto en la base de datos
            daoProductos.actualizarStockProducto(nombreProducto, nuevoStock);

            // Insertar registro en la tabla de historial
            Productos producto = new Productos();
            producto.setNombre(nombreProducto);
            producto.setStock_inicial(stockActual);
            inventario.insertarHistorial(producto, 0, cantidadPerdida, descripcionPerdida, nuevoStock);

            // Recargar la tabla para mostrar el nuevo stock
            UtilsInventario.cargarTablaProductos(tablaPerdida);
            JOptionPane.showMessageDialog(jframe, "Pérdida registrada con éxito");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(jframe, "Ingrese un número válido para la cantidad perdida.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | SQLException ex) {
        }
    } else {
        JOptionPane.showMessageDialog(jframe, "Seleccione un producto de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}
