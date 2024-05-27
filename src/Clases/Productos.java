
package Clases;

public class Productos {
    
    
public class Usuarios {
    
}
    private String mNombre, mCat, mMarca ; //Sellos: Alto en azures, Alto en grasas saturadas, Alto en sodio y Alto en calorias
    private int mPrecio_Costo, mPrecio_Venta, mCantidad_Inicial, mCantidad_Critico, mCantidad_Maxima, mCantidad_Minima;
    // FECHA_INGRESO Y FECHA_VENCIMIENTO
    
    // STRINGS
    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getCat() {
        return mCat;
    }

    public void setCat(String mCat) {
        this.mCat = mCat;
    }

    public String getMarca() {
        return mMarca;
    }

    public void setMarca(String mMarca) {
        this.mMarca = mMarca;
    }

    
    // INTS
    public Integer getPrecio_Costo() {
        return mPrecio_Costo;
    }
    public void setPrecio_Costo(Integer mPrecio_Costo) {
        this.mPrecio_Costo = mPrecio_Costo;
    }
    
    public Integer getPrecio_Venta() {
        return mPrecio_Venta;
    }
    public void setPrecio_Venta(Integer mPrecio_Venta) {
        this.mPrecio_Venta = mPrecio_Venta;
    }
    
    public Integer getCantidad_Inicial() {
        return mCantidad_Inicial;
    }
    public void setCantidad_Inicial(Integer mCantidad_Inicial) {
        this.mCantidad_Inicial = mCantidad_Inicial;
    }
    
    public Integer getCantidad_Critico() {
        return mCantidad_Critico;
    }
    public void setCantidad_Critico(Integer mCantidad_Critico) {
        this.mCantidad_Critico = mCantidad_Critico;
    }
    
    public Integer getCantidad_Maxima() {
        return mCantidad_Maxima;
    }
    public void setCantidad_Maxima(Integer mCantidad_Maxima) {
        this.mCantidad_Maxima = mCantidad_Maxima;
    }
        
    public Integer getCantidad_Minima() {
        return mCantidad_Minima;
    }
    public void setCantidad_Minima(Integer mCantidad_Minima) {
        this.mCantidad_Minima = mCantidad_Minima;
    }

}
