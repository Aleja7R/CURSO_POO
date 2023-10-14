
package com.mycompany.inmuebles;

/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;
    
    public Apartaestudio(String direccion, int idInmueble, int area, double precioVenta,
            int numHabitaciones, int numBanos) {
        super(direccion,idInmueble, area, precioVenta, numHabitaciones, numBanos);
        
    }
    void mostrar(){
        super.mostrar();
        
        
    }
}
