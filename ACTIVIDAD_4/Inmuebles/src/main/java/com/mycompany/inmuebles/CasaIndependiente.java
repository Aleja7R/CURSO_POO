package com.mycompany.inmuebles;

public class CasaIndependiente extends CasaUrbana {
    
    protected static double valorArea = 3000000;
    
    public CasaIndependiente(String direccion, int idInmueble, int area, int precioVenta,int numHabitaciones, int numBanos, int numPisos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos, numPisos);
    }
    void mostrar(){
        super.mostrar();
    }
}
