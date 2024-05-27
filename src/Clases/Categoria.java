
package Clases;

public class Categoria {
    
    private int id_categoria;
    private String nombre_categoria, sub_categoria, tipo;

    //sin P
    public Categoria() {
    }
    //con P
    public Categoria(int id_categoria, String nombre_categoria, String sub_categoria, String tipo) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.sub_categoria = sub_categoria;
        this.tipo = tipo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getSub_categoria() {
        return sub_categoria;
    }

    public void setSub_categoria(String sub_categoria) {
        this.sub_categoria = sub_categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
}

