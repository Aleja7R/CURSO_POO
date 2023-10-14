package com.mycompany.inmuebles;

public class Casa extends InmuebleVivienda {
    
    protected int numPisos;
    
    public Casa(String direccion, int idInmueble, int area, double precioVenta,
            int numHabitaciones, int numBanos, int numPisos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos);
        
        this.numPisos = numPisos;
    }
    
    void mostrar(){
        super.mostrar();
        System.out.println("Número de pisos = " + numPisos+"\n");
    }
}
