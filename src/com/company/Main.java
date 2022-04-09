package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Alumno alumno=new Alumno("20172367",52f,1,"Diana","2021-12-03","ewwe","diana@linda.com","Alumno","Femenino");

        ArrayList<Miembro> lista_miembros= new ArrayList<>();
        lista_miembros.add(alumno);
        //ArrayList<Miembro> lista_miembros2= new ArrayList<>();
        //lista_miembros2.add(miembro2);
        Equipo equipo1=new Equipo("equipo1","artes",lista_miembros);
        //Equipo equipo2=new Equipo("equipo2","ciencias",lista_miembros2);
        ArrayList<Equipo> lista_equipos= new ArrayList<>();
        lista_equipos.add(equipo1);
        //lista_equipos.add(equipo2);
        Equipu equipu=new Equipu(lista_equipos);

        equipu.consultarMiembroxequipo(0);




    }
}
