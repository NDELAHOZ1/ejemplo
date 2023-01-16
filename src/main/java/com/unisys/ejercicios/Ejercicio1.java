package com.unisys.ejercicios;

public class Ejercicio1 {
    int numero;
    short marianico;
    long gasol;
    boolean independencia;
    double presupuesto;
    float longitud;
    public Ejercicio1(int num, short mari, long gas, boolean indep, double presu, float longit)
    {
        numero=num;
        marianico=mari;
        gasol=gas;
        independencia=indep;
        presupuesto=presu;
        longitud=longit;
    }
    public long suma ()
    {
        return gasol+marianico;
    }

}
