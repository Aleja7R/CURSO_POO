
package com.mycompany.ejercicio_22;
import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        
        int numHorasTrabajoMes;
        String nombreEmpleado;
        float valorHora,salario=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del empleado");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Ingrese el salario básico por hora");
        valorHora = entrada.nextFloat();
        System.out.println("Número de horas trabajadas durante el mes");
        numHorasTrabajoMes = entrada.nextInt();
        //procesos
        salario = valorHora*numHorasTrabajoMes;
        if (salario > 450000){
            System.out.println("El empleado/a "+nombreEmpleado+ " le corresponde el salario de $: "+salario);  
        }else{
            System.out.println("Empleado "+nombreEmpleado);
        }
    }
}
