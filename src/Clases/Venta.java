package Clases;

public class Venta {
    private int id, precioTotal;
    private String detallesVenta;

    public Venta(int id, int precioTotal, String detallesVenta) {
        this.id = id;
        this.precioTotal = precioTotal;
        this.detallesVenta = detallesVenta;
    }


    public Venta() {
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(String detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
}
