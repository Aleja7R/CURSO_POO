package com.mycompany.carreraciclista;

public class Contrarrelojista extends Ciclista{
    
    private double velocidadMax;

    public Contrarrelojista(int id, String nombre, double velocidadMax) {
        super(id, nombre);
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("La aceleración promedio: " + velocidadMax);
        
    }
    
    protected String imprimirTipo(){
       return "Es un ciclista Contrarrelojista";
    }
}
