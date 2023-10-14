package com.mycompany.inmuebles;

public class CasaUrbana extends Casa{
    
    public CasaUrbana(String direccion, int idInmueble, int area, double precioVenta, int numHabitaciones, int numBanos, int numPisos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos, numPisos);
    }
    
    void mostrar(){
        super.mostrar();
    }   
}
