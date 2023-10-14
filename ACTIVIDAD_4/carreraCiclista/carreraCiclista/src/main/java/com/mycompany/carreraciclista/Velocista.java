
package com.mycompany.carreraciclista;

public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(id, nombre);
        
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("La potencia promedio: " + potenciaPromedio);
        System.out.println("La velocidad promedio: "+ velocidadPromedio);
    }

    protected String imprimirTipo(){
        return "Es un ciclista Velocista";
    }
}
