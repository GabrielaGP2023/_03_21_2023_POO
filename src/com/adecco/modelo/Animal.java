package com.adecco.modelo;

public class Animal {
    //1. Atributo
    public int numPatas;
    public String color;
    public String especie;
    public boolean peligroExtincion;
    //2. Métodos
    public String comer(){
        return "El animal está comiendo ...";
    }

    public String correr(double km){
        return "El animal esta corriendo " + km + " kilómetros";
    }

    public String mostrarInfo(){
        return "numero de patas " + numPatas + " color " + color + " especie " + especie
                + " Peligro de extinción ? " + peligroExtincion;
    }
}
