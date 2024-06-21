package Clases;

public class BodegaFisica {
    int id, stock;

    public BodegaFisica() {
    }

    public BodegaFisica(int id, int stock) {
        this.id = id;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
