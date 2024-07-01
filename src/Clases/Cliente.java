package Clases;

import java.sql.Date;

public class Cliente {
    // Variables
    int id, credito_limite, credito_usado;
    String nombre_completo, direccion, telefono;
    Double interes;
    Date fecha;
    // Constructor vacio
    public Cliente() {
    }

    public int getCredito_usado() {
        return credito_usado;
    }

    public void setCredito_usado(int credito_usado) {
        this.credito_usado = credito_usado;
    }

    public Cliente(int id, int credito_limite, int credito_usado, String nombre_completo, String direccion, String telefono, Double interes, Date fecha) {
        this.id = id;
        this.credito_limite = credito_limite;
        this.credito_usado = credito_usado;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.interes = interes;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCredito_limite() {
        return credito_limite;
    }

    public void setCredito_limite(int credito_limite) {
        this.credito_limite = credito_limite;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
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
