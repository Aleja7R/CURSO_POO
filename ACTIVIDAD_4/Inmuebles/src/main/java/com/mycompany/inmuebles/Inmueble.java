package com.mycompany.inmuebles;

public class Inmueble {
    
    protected String direccion;
    protected int idInmueble, area;
    protected double precioVenta;

    public Inmueble(String direccion, int idInmueble, int area, double precioVenta) {
        
        this.idInmueble = idInmueble;
        this.direccion =direccion;
        this.area =  area;
    }
    
    double calcularPrecioVenta(double valorArea){
        precioVenta = area*valorArea;
        return precioVenta;
    }
    
    void mostrar(){
        System.out.println("Información del inmueble");
        System.out.println("Identificador inmobiliario = " +idInmueble);
        System.out.println("Área = " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $ " + precioVenta);
    }
}

