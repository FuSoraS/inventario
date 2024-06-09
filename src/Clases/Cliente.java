package Clases;

public class Cliente {
    int id;
    String nombre_completo, direccion, telefono;

    public Cliente(int id, String nombre_completo, String direccion, String telefono) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
