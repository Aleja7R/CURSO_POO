package com.mycompany.inmuebles;

public class LocalComercial extends Local {
    
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    public LocalComercial(String direccion, int idInmueble, int area, double precioVenta, String tipoLocal, String centroComercial) {
        super(direccion, idInmueble, area, precioVenta, tipoLocal);
        this.centroComercial=centroComercial;
        
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Centro comercial = " + centroComercial+"\n");
    }
}
