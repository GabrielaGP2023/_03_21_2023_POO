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

    public String comer(String tipoComida){
        return "El animal está comiendo " + tipoComida;

    }

    public String correr(double km){
        return "El animal esta corriendo " + km + " kilómetros";
    }

    public String mostrarInfo(){
        return "numero de patas " + numPatas + " color " + color + " especie " + especie
                + " Peligro de extinción ? " + peligroExtincion;
    }
    public Animal(){

    }
    public Animal(int numPatas, String color, String especie, boolean peligroExtincion){
        this.numPatas = numPatas;
        this.color = color;
        this.especie = especie;
        this.peligroExtincion = peligroExtincion;
    }
}
