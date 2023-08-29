//Ejercicio Resuelto número 4
//Alejandra Rojas

package com.mycompany.ejercicio_4;

/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        int edadAlber, edadMama, edadAna, edadJuan = 9;
        
        edadAlber= 2 *(edadJuan/3); // Edad de Alberto
        edadAna = 4*(edadJuan/3); // Edad de Ana
        edadMama = edadJuan + edadAna + edadAlber;
        
        System.out.println("Juan = "+ edadJuan);
        System.out.println("Alberto = "+ edadAlber);
        System.out.println("Ana = "+ edadAna);
        System.out.println("Juan = "+ edadMama);
        
    }
}
