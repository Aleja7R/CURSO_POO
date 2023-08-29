//Ejercicio Resuelto número 14 pag 50
//Alejandra Rojas

package com.mycompany.ejercicio_14;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese un número");
        
        double num, numCuadrado =0 ,numCubo=0;
        
        num =entrada.nextDouble();
        numCuadrado=Math.pow(num,2);
        numCubo=Math.pow(num,3);
        
        System.out.println("El numero al cuadrado es :" +numCuadrado );
        System.out.println("El numero al cubo es :" +numCubo );
        entrada.close();
    }
}
