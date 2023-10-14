package com.mycompany.inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    
    protected static double valorArea = 2500000;

    protected int valorAdministracion;

    protected boolean tienePiscina=true;

    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(String direccion, int idInmueble, int area, int precioVenta,int numHabitaciones, int numBanos, int numPisos, int valorAdministracion, boolean tienepiscina, boolean tieneCamposDeportivos) {
        super(direccion, idInmueble, area, precioVenta, numHabitaciones, numBanos, numPisos);
        
        this.valorAdministracion =valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    void mostrar(){
        super.mostrar();
        System.out.println("Valor de la administración =  "+ valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos+"\n");
    }
}
