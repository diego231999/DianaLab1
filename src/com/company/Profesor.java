package com.company;

import java.time.LocalDate;

public class Profesor extends Miembro {
    private String codigo_profesor;
    private int estado;

    public Profesor(String codigo_profesor,int estado, int codigo
            , String nombre
            , String fecha
            , String direccion
            , String email
            , String tipo
            , String sexo){
        super(codigo
                , nombre
                ,fecha
                , direccion
                , email
                , tipo
                , sexo);
    }

    public String getCodigo_profesor() {
        return codigo_profesor;
    }

    public void setCodigo_profesor(String codigo_profesor) {
        this.codigo_profesor = codigo_profesor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String consultarDatos(){
        return "Profesor: "+getCodigo_profesor() ;

    }
}
