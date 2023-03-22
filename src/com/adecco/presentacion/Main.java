package com.adecco.presentacion;

import com.adecco.modelo.Animal;
import com.adecco.modelo.Coche;

public class Main {


    public static void main(String[] args) {


        System.out.println("Hello world!");

        variables();
        metodo_poo();
        crearObjetosAnimal();
    }

    private static void crearObjetosAnimal() {
        //crear objeto - instanciar la clase
        Animal a1 = new Animal();
        a1.numPatas = 4;
        a1.color = "negro";
        a1.especie = "mamífero";
        a1.peligroExtincion = false;

        System.out.println(a1.comer());
        System.out.println(a1.correr(2));
        System.out.println(a1.mostrarInfo());

        Animal a2 = new Animal();
        a2.numPatas = 2;
        a2.color ="blanco";
        a2.especie="ave";
        a2.peligroExtincion=false;

        System.out.println(a2.comer());
        System.out.println(a2.correr(5));
        System.out.println(a2.mostrarInfo());
    }

    private static void metodo_poo() {
        Coche c3 = new Coche("Seat",45000);
        System.out.println(c3.mostrarInfo2());
        Coche c4 = new Coche("Dacia",3500,2021,"plata");
        System.out.println(c4.mostrarInfo2());
        //Crear un objeto - instanciar la clase
        Coche c1 = new Coche();
        c1.marca = "Toyota";
        c1.color = "Gris";
        c1.precio=60_000.0;
        c1.anio = 2023;
//        System.out.println("La marca del coche es -> "+ c1.marca);
//        System.out.println("La color del coche es -> "+ c1.color);
//        System.out.println("La precio del coche es -> "+ c1.precio);
//        System.out.println("La año del coche es -> "+ c1.anio);
//        c1.mostrarInfo();
        System.out.println(c1.mostrarInfo2());


        Coche c2 = new Coche();
        c2.marca = "Reanult";
        c2.precio = 67_000;
        c2.anio = 2000;
        c2.color="blanco";
//        c2.mostrarInfo();
        System.out.println(c2.mostrarInfo2());

//        System.out.println("La marca del coche es -> "+ c2.marca);
//        System.out.println("La color del coche es -> "+ c2.color);
//        System.out.println("La precio del coche es -> "+ c2.precio);
        System.out.println("La año del coche es -> "+ c2.anio);
    }

    private static void variables() {
        //Tipos de variables
        //Tipo de variables enteras
        byte vByte = 7;
        short vShort = 123;
        int vInt = 123_123;
        long vLong = 123_123L;
        //Tipo de variables con decimales
        float vFloat = 123.45f;
        double vDouble = 123_123.898;
        char vChar = 'c';
        boolean vBoolean = true;

        System.out.println("Valor de variable byte "+vByte);
        System.out.println("Valor de variable short "+vShort);
        System.out.println("Valor de variable int "+vInt);
        System.out.println("Valor de variable long "+vLong);

        String vString = "Hola mundo";
        System.out.println(vString);

        Integer vInteger = 500;
        System.out.println("Tipo envolvente de int -> Integer "+ vInteger);
        Character vCharacter = 'c';
        System.out.println("Tipo envolvente de char -> Character " + vCharacter);
        Byte vByteE = 5;
        System.out.println("Tipo envolvente de byte -> Byte " + vByteE);

    }


}