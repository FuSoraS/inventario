package Clases;

public class Usuarios {
    private int id;
    private String nombreusu;
    private String contrausu;
    private String rol;
    private String nombretrab;
    private int rut;
    private String dv;
    private String apellidop;
    private String apellidom;
    private int telefono;
    private String email;
    
    // Constructor
    public Usuarios() {
    }

    // Constructor con parámetros

    public Usuarios(int id, String nombreusu, String contrausu, String rol, String nombretrab, int rut, String dv, String apellidop, String apellidom, int telefono, String email) {
        this.id = id;
        this.nombreusu = nombreusu;
        this.contrausu = contrausu;
        this.rol = rol;
        this.nombretrab = nombretrab;
        this.rut = rut;
        this.dv = dv;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreusu() {
        return nombreusu;
    }

    public void setNombreusu(String nombreusu) {
        this.nombreusu = nombreusu;
    }

    public String getContrausu() {
        return contrausu;
    }

    public void setContrausu(String contrausu) {
        this.contrausu = contrausu;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombretrab() {
        return nombretrab;
    }

    public void setNombretrab(String nombretrab) {
        this.nombretrab = nombretrab;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}