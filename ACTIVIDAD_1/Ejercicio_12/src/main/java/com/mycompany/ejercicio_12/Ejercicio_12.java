
//Ejercicio Resuelto número 12 pag 50
//Alejandra Rojas

package com.mycompany.ejercicio_12;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        double horasTrabajadas =0, retefuente , salarioNeto,salarioBruto, valorHora =5000f;
        System.out.println("Ingrese el numero de horas trabajadas ");
        Scanner entrada= new Scanner(System.in);
        //lectura por teclado de las horas trabajadas
        horasTrabajadas = entrada.nextDouble();
        // Aquí se harán las respectivas operaciones para calcular el salario 
        
        salarioBruto=horasTrabajadas*valorHora;
        retefuente = salarioBruto*0.125;
        salarioNeto =salarioBruto-retefuente;
        
        //Mostrar en consola los el valor de cada caso
        System.out.println("El salario bruto es: $"+salarioBruto);
        System.out.println("La retefuente es: $"+retefuente);
        System.out.println("El salario neto: $"+salarioNeto);
        entrada.close();
    }
}
