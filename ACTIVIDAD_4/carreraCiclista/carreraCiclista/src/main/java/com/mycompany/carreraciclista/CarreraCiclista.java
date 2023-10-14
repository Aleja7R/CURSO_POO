package com.mycompany.carreraciclista;

public class CarreraCiclista {

    public static void main(String[] args) {
        
        
        Equipo equipo1 = new Equipo("Sky", "USA");
        Velocista velocista1 = new Velocista(123, "Geraint Thomas",350,26);
        Escalador escalador1 = new Escalador(228,"Nairo Quintana",25,15);
        Contrarrelojista relojista1 = new Contrarrelojista(569,"Superman", 150);
        
        equipo1.agregarCiclista(velocista1);
        equipo1.agregarCiclista(escalador1);
        equipo1.agregarCiclista(relojista1);
        
        velocista1.setTiempoAcum(365);
        escalador1.setTiempoAcum(385);
        relojista1.setTiempoAcum(370);
        
        equipo1.calcularTotalTiempo();
        equipo1.mostrar();
        equipo1.listarEquipo();
        
        
        Equipo equipo2 = new Equipo("TEAM Medellin - EPM ", "COLOMBIA");
        Velocista velocista2 = new Velocista(158, "Nicolas Paredes",320,25);
        Escalador escalador2 = new Escalador(274,"Walter Vargas",22,10);
        Contrarrelojista relojista2 = new Contrarrelojista(503,"Miguel Lopez", 120);
        
        equipo2.agregarCiclista(velocista2);
        equipo2.agregarCiclista(escalador2);
        equipo2.agregarCiclista(relojista2);
        
        velocista2.setTiempoAcum(345);
        escalador2.setTiempoAcum(375);
        relojista2.setTiempoAcum(380);
        
        equipo2.calcularTotalTiempo();
        equipo2.mostrar();
        equipo2.listarEquipo();        
    }
}
