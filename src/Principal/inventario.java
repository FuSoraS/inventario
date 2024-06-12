package Principal;

import Interfaz.LoginInterfaz;

public class inventario {

    public static void main(String[] args) {
        // Abrir la ventana de Login por defecto
        LoginInterfaz login = new LoginInterfaz();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
