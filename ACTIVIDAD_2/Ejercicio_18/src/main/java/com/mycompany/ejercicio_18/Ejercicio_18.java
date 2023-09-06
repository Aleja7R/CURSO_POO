

package com.mycompany.ejercicio_18;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_18 {

    public static void main(String[] args) {

        int codEmpleado;
        String nombreEmpleado;
        double valorHora, porcentajeRetefuente, retefuente, salarioBruto, salarioNeto, numHorasTrabajoMes;
        
        //Entrada de datos 
        System.out.println("Ingrese los datos solicitados: ");
        System.out.println("Codigo del empleado: ");
        Scanner entrada = new Scanner(System.in);
        codEmpleado= entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre del empleado: ");   
        nombreEmpleado = entrada.nextLine();
        System.out.println("Valor hora trabajada: ");
        valorHora = entrada.nextDouble();
        System.out.println("Numero de horas trabajadas durante el mes: ");
        numHorasTrabajoMes = entrada.nextDouble();
        System.out.println("Porcentaje de retencion en la fuente: ");
        porcentajeRetefuente= entrada.nextDouble();
        //Procesos 
        salarioBruto = numHorasTrabajoMes*valorHora;
        retefuente = (salarioBruto * porcentajeRetefuente)/100;
        salarioNeto = salarioBruto-retefuente;
        //Salida 
        System.out.println("Codigo: "+codEmpleado+"\nNombre: "+nombreEmpleado +
                "\nSalario bruto es de: $"+salarioBruto+"\n y su Salario neto es: $"+salarioNeto);

    }
}
