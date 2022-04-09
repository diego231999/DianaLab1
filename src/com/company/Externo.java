package com.company;

import java.time.LocalDate;

public class Externo extends Miembro {
    private String tipo_dedicacion;

    public Externo(String tipo_dedicacion, int codigo
                    ,String nombre
                    ,String fecha
                    ,String direccion
                    ,String email
                    ,String tipo
                    ,String sexo){
        super(codigo
        , nombre
        ,fecha
        , direccion
        , email
        , tipo
        , sexo);
    }

    public String getTipo_dedicacion() {
        return tipo_dedicacion;
    }

    public void setTipo_dedicacion(String tipo_dedicacion) {
        this.tipo_dedicacion = tipo_dedicacion;
    }
    public String consultarDatos(){
        return "Miembro: "+getNombre() ;

    }
}
