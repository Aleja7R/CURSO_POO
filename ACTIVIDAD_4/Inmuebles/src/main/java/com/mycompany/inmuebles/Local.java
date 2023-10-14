package com.mycompany.inmuebles;

public class Local extends Inmueble {
    
    enum tipo {INTERNO,CALLE}; /* Tipo de inmueble especificado como un valor enumerado */
    protected String  tipoLocal;
    
    public Local(String direccion, int idInmueble, int area, double precioVenta, String tipoLocal) {
        super(direccion, idInmueble, area, precioVenta);
        
        this.tipoLocal = tipoLocal;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Tipo de local = " + tipoLocal +"\n");
    }
}
