
package com.mycompany.inmuebles;

/**
 *
 * @author ALEJANDRA ROJAS
 */
public class AptoFamiliar extends Apartamento{
    
    protected static double valorArea = 2000000;

    protected int valorAdministracion;
    
    public AptoFamiliar(String direccion, int idInmueble, int area, double precioVenta, int numHabitaciones, int numBanos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos);
        
        this.valorAdministracion = valorAdministracion;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Valor de la administración = $ " + valorArea+"\n");
    }
}
