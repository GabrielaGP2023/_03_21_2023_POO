package com.adecco.modelo;

public class Coche {

    public String marca; //atributo
    public double precio;
    public int anio;
    public String color;

//    public void mostrarInfo(){
//        System.out.println("Marca : " + marca);
//        System.out.println("Precio : " + precio);
//        System.out.println("Color : " + color);
//        System.out.println("Año : " + anio);
//
//    }

    public String mostrarInfo2(){
        return "Marca " + marca + " precio " + precio + " Color" + color + " Año " + anio;
    }
//Sobrecarga
    public Coche(){
    }

    public Coche(String pMarca, double precio){
        marca = pMarca;
        this.precio = precio;
    }

    public Coche(String marca, double precio, int anio, String color ){
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
        this.color = color;
    }
}
