//Ejercicio Resuelto número 5 pag 50
//Alejandra Rojas
package com.mycompany.ejercicio_5;

/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
       double SUMA = 0;
       double X = 20, Y =40;
       
       SUMA +=X;
       X += Math.pow(Y,2);
       SUMA += X/Y;
       System.out.println("El valor de la suma es :" + SUMA);
               
    }
}
