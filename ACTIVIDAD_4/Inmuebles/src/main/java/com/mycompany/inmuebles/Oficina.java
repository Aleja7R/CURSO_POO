package com.mycompany.inmuebles;

public class Oficina extends Local{
    
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    public Oficina(String direccion, int idInmueble, int area, double precioVenta, String tipoLocal, boolean esGobierno) {
        super(direccion, idInmueble, area, precioVenta, tipoLocal);
        
        this.esGobierno = esGobierno;        
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Es oficina gubernamental = " + esGobierno+"\n");
    }  
}
