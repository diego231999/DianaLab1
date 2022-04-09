package com.company;

import java.util.ArrayList;

public class Equipu {
    ArrayList<Equipo> array_equipos;


    public Equipu(ArrayList<Equipo> array_equipos) {
        this.array_equipos = array_equipos;
    }
    public Equipu(){

    }

    public ArrayList<Equipo> getArray_equipos() {
        return array_equipos;
    }

    public void setArray_equipos(ArrayList<Equipo> array_equipos) {
        this.array_equipos = array_equipos;
    }

   public void consultarMiembroxequipo(int indice){
        array_equipos.get(indice).consultarDatosPucp();
   }
}
