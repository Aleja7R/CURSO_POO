
package com.mycompany.inmuebles;

/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Apartamento extends InmuebleVivienda {
    
    public Apartamento(String direccion, int idInmueble, int area, double precioVenta, int numHabitaciones, int numBanos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos);
    }
    void mostrar(){
        super.mostrar();
    }
}
