package com.company;

import java.util.ArrayList;

public class Equipo {
    String nombre;
    String interes;
    ArrayList<Miembro> array_miembros;

    public Equipo(String nombre, String interes, ArrayList<Miembro> array_miembros) {
        this.nombre = nombre;
        this.interes = interes;
        this.array_miembros = array_miembros;
    }
    public Equipo(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public ArrayList<Miembro> getArray_miembros() {
        return array_miembros;
    }

    public void setArray_miembros(ArrayList<Miembro> array_miembros) {
        this.array_miembros = array_miembros;
    }



    //-----------------------------------METODOS---------------------------------------//

    public void consultarDatosPucp(){
        for(Miembro m:array_miembros){
            if(m.getTipo().equalsIgnoreCase("Alumno")){
                System.out.println(m.consultarDatos());
                //System.out.println("Alumno---> Nombre: "+((Alumno)m).getNombre()+ ", CodigoPucp: "+((Alumno)m).getCraest()+"\n");
            }else if (m.getTipo().equalsIgnoreCase("Profesor")){
                System.out.println(m.consultarDatos());
                //System.out.println("Profesor---> Nombre: "+((Profesor)m).getNombre()+ ", CodigoProfesor: "+((Profesor)m).getCodigo_profesor()+"\n");
            }
        }
    }


}
