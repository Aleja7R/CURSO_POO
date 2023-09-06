
package com.mycompany.ejercicio_14;
import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        
        float ventDept1, ventDept2,ventDept3, salario = 0, totalVentas, 
                porctVentas,salarioDept1,salarioDept2,salarioDept3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Importe global de las ventas de los departamentos.\n");
        System.out.println("Ventas del departamento 1: ");
        ventDept1 = entrada.nextFloat();
        System.out.println("Ventas del departamento 2: ");
        ventDept2 = entrada.nextFloat();
        System.out.println("Ventas del departamento 3: ");
        ventDept3 = entrada.nextFloat();
        
        System.out.println("Salario de los departamentos: ");
        salario = entrada.nextFloat();
        
        totalVentas = ventDept1 + ventDept2 +ventDept3;
        porctVentas = totalVentas*0.33f;
        
        if (ventDept1>porctVentas){
            salarioDept1 = salario + salario*0.2f;
        }else{
            salarioDept1 = salario;
        }
        if (ventDept2>porctVentas){
            salarioDept2 = salario + salario*0.2f;
        }else{
            salarioDept2 = salario;
        }
        if (ventDept3>porctVentas){
            salarioDept3 = salario + salario*0.2f;
        }else{
            salarioDept3 = salario;
        }
        System.out.println("El salario para el departamento 1 es: $"+salarioDept1+
                "\nEl salario para el departamento 2 es: $"+salarioDept2+
                "\nEl salario para el departamento 3 es: $"+salarioDept3);
    }
}
