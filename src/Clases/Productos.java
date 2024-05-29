package Clases;

public class Productos {

    private String Nombre;
    private int stock_inicial; 
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Productos() {
        // Constructor vacío
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getStock_inicial() {
        return stock_inicial;
    }

    public void setStock_inicial(int stock_inicial) {
        this.stock_inicial = stock_inicial;
    }
}
