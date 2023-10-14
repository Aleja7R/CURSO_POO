package com.mycompany.inmuebles;

public class CasaRural extends Casa{
    
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    public CasaRural(String direccion, int idInmueble, int area, double precioVenta, 
            int numHabitaciones, int numBanos, int numPisos, int distanciaCabera, int altitud ) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos, numPisos);
        
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Distancia la cabecera municipal = " +numHabitaciones + " km");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros."+"\n"); 
    }
}
