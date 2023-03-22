package com.adecco.modelo;

public class Campo {
    public int numero;

    public void incrementar(){
        numero++;
    }

    public String mostrarInfo(){
        return "El valor de numero es " + numero;
    }
    public Campo(){}
    public Campo(int numero){
        this.numero = numero;
    }
}
