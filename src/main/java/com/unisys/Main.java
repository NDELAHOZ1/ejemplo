package com.unisys;

import com.unisys.ejercicios.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Ejercicio1 objetoEjercicio1 = new Ejercicio1(10,(short)-1,1234567,true,12.34,56.78f);
        System.out.printf("Suma=%d",objetoEjercicio1.suma());
    }


}