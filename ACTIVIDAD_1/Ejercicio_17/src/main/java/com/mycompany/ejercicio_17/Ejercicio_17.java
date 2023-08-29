//Ejercicio Resuelto número 17 pag 50
//Alejandra Rojas
package com.mycompany.ejercicio_17;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese un número para el radio del circulo");
        double radio, area=0 , longitudCircunferencia=0;
        
        radio =entrada.nextDouble();
        area = (radio*radio)*Math.PI;
        longitudCircunferencia = (radio*2)*Math.PI;
        System.out.println("El área del círculo es: "+area);
        System.out.println("La longitud de la Circunferencia del círculo es: "+ longitudCircunferencia);
        entrada.close();
    }
}
