package com.mycompany.inmuebles;


public class Inmuebles {

    public static void main(String[] args) {
        
        // Creación de los objetos 
        
        AptoFamiliar apto1 = new AptoFamiliar("Avenida Santander 45-45",103067,
                120,200000, 3,2);
        System.out.println("Datos del apartamento familiar");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.mostrar();
        
        Apartaestudio est = new Apartaestudio("Avenida bva 78-45",1234,
                50, 1500000,1,1);
        System.out.println("Datos del apartaestudio");
        est.calcularPrecioVenta(est.valorArea);
        est.mostrar();
        
        CasaRural rural = new CasaRural(" Casa 43 B",809067,
                190,1500000, 5,3,2,1000,25);
        System.out.println("Datos de la casa rural");
        rural.calcularPrecioVenta(rural.valorArea);
        rural.mostrar();
        
        CasaIndependiente independiente = new CasaIndependiente(" cll 52 b Casa 23 ",206069,
                150,3000000, 3,2,2);
        System.out.println("Datos de la casa independiente");
        independiente.calcularPrecioVenta(independiente.valorArea);
        independiente.mostrar();
        
        CasaConjuntoCerrado conjunto = new CasaConjuntoCerrado("Cr 120 c apto 501 bloque 23 ",556062,
                100,2500000, 3,2,1,150000,true,true);
        System.out.println("Datos de la casa del conjunto cerrado");
        conjunto.calcularPrecioVenta(conjunto.valorArea);
        conjunto.mostrar();
        
        Oficina oficina = new Oficina("Torre working A", 001234,60,3500000, "Privado",false);
        System.out.println("Datos de la oficina");
        oficina.calcularPrecioVenta(oficina.valorArea);
        oficina.mostrar();
        
        LocalComercial local = new LocalComercial("Avenida central", 1012377,80,3000000, "Publico","La estación");
        System.out.println("Datos del local comercial");
        local.calcularPrecioVenta(local.valorArea);
        local.mostrar();
    }
}
