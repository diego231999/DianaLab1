package com.company;

import java.time.LocalDate;

abstract class Miembro implements Consultable {
    private int codigo;
    private String nombre;
    private String fecha;
    private String direccion;
    private String email;
    private String tipo;
    private String sexo;


    public Miembro(int codigo, String nombre, String fecha, String direccion, String email, String tipo, String sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.email = email;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public abstract String consultarDatos();
}
