package com.mycompany.carreraciclista;

import java.util.Scanner;
import java.util.Vector;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    
    Vector listaCiclistas;
    
    Equipo(String nombre,String pais ){
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector();// creacion del vector
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }
    
    void agregarCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }
    
    void listarEquipo(){
        for (int i =0;i<listaCiclistas.size();i++){
            
            Ciclista c = (Ciclista)listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    
    void buscarCiclista(){
        Scanner input = new Scanner(System.in);
        String nombreCiclista = input.next();
        
        for (int i =0; i<listaCiclistas.size();i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) { 
                System.out.println(c.getNombre());
            }
        }
    }
    
    void calcularTotalTiempo(){
        for ( int i =0;i<listaCiclistas.size();i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            
            totalTiempo = totalTiempo + c.getTiempoAcum();
        
        }
    }
    
    void mostrar(){
        System.out.println();
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País al que pertenece = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
