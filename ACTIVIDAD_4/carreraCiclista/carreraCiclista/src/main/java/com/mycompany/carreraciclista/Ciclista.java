package com.mycompany.carreraciclista;

public abstract class Ciclista {
    
    private int id;
    private String nombre;
    private int tiempoAcum=0;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    abstract String imprimirTipo();

    protected int getId() {
        return id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected int getTiempoAcum() {
        return tiempoAcum;
    }
    
    protected int getPosicionGeneral(int posicionGeneral){
        return posicionGeneral;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setTiempoAcum(int tiempoAcum) {
        this.tiempoAcum = tiempoAcum;
    }
    
    protected void setPosicionGeneral(int posicionGeneral){
        posicionGeneral= posicionGeneral;
    }
    
    protected void imprimir(){
        System.out.println("Identificador = " + id);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcum);
    }
}
