
package Clases;

import Interfaz.InventarioInterfaz;
import Interfaz.LoginInterfaz;
import Interfaz.MenuCentral;
import Interfaz.VentaInterfaz;
import Interfaz.categoriaInterfaz;
import Interfaz.marcaInterfaz;
import Interfaz.productoInterfaz;
import javax.swing.JFrame;

public class Utils {
    // Clases para abrir ventanas
    public static void AbrirLogin(JFrame jframe){
        LoginInterfaz Login= new LoginInterfaz();
        jframe.dispose();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    public static void AbrirProducto(JFrame jframe){
        productoInterfaz producto = new productoInterfaz();
        jframe.dispose();
        producto.setLocationRelativeTo(null);
        producto.setVisible(true); 
    }
    public static void AbrirInventario(JFrame jframe){
        InventarioInterfaz inventario= new InventarioInterfaz();
        jframe.dispose();
        inventario.setLocationRelativeTo(null);
        inventario.setVisible(true);
    }
    public static void AbrirMenuCentral(JFrame jframe){
        MenuCentral menu = new MenuCentral();
        jframe.dispose();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
    public static void AbrirVenta(JFrame jframe){
        VentaInterfaz venta = new VentaInterfaz();
        jframe.dispose();
        venta.setLocationRelativeTo(null);
        venta.setVisible(true); 
    }
    public static void AbrirMarca(JFrame jframe){
        marcaInterfaz marca = new marcaInterfaz();
        jframe.dispose();
        marca.setLocationRelativeTo(null);
        marca.setVisible(true);  
    }
    public static void AbrirCategoria(JFrame jframe){
        categoriaInterfaz categoria = new categoriaInterfaz();
        jframe.dispose();
        categoria.setLocationRelativeTo(null);
        categoria.setVisible(true);  
    }
    // Otras

}
