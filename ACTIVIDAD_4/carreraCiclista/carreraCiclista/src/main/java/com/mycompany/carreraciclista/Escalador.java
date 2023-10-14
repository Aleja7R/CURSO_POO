
package com.mycompany.carreraciclista;

public class Escalador extends Ciclista{
    
    private double aceleracionPromedio;
    private double gradoRampa;

    public Escalador(int id, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio =aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("La aceleración promedio: " + aceleracionPromedio);
        System.out.println("El grado de la rampa : "+ gradoRampa);
    }
    
    protected String imprimirTipo(){
        return "Es un ciclista Escalador";
    }
}
