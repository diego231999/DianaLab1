package com.company;

import java.time.LocalDate;

public class Alumno extends Miembro {
    private String codigo_estudiante;
    private float craest;

    public Alumno(String codigo_estudiante,float craest, int codigo
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
        this.craest=craest;
        this.codigo_estudiante=codigo_estudiante;
    }

    public String getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setCodigo_estudiante(String codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public float getCraest() {
        return craest;
    }

    public void setCraest(float craest) {
        this.craest = craest;
    }
    public String consultarDatos(){
        return "Alumno: Soy "+getNombre()+" con el siguiente código de estudiante: "+getCodigo_estudiante()+" y craest "+getCraest() ;

    }
}
