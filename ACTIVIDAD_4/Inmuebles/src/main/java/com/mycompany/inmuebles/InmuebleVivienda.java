package com.mycompany.inmuebles;

public class InmuebleVivienda extends Inmueble {
    
    protected int numHabitaciones, numBanos;
    
    public InmuebleVivienda(String direccion, int idInmueble, int area, 
            double precioVenta, int numHabitaciones, int numBanos) {
        super(direccion, idInmueble, area, precioVenta);
        
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }
    
    void mostrar(){
        super.mostrar();// Mostrar info de la clase padre
        System.out.println("Número de habitaciones = " + numHabitaciones);
        System.out.println("Número de baños = " + numBanos);
    }
    
}
