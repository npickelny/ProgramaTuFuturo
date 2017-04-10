package com.example.nico.sugarormaplicationexample.Clases;

import com.orm.SugarRecord;

/**
 * Created by Nico on 09/04/2017.
 */

public class Persona extends SugarRecord {

    private int dni;
    private String nombre;
    private int telefono;

//    private Collection<Auto> autos;

    public Persona(String nombre, int telefono, int dni) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }

    public Persona() {

    }

//    public Collection<Auto> getAutos() {
//        return autos;
//    }
//
//    public void setAutos(Collection<Auto> autos) {
//        this.autos = autos;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
