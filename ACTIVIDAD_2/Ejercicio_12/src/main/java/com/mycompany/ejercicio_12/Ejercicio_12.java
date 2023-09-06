
package com.mycompany.ejercicio_12;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        
        int numHorasTrabajoSemana,numHorasExtras=0, horasExtrasMas8 =0;
        String nombreEmpleado;
        float valorHora=0,salario=0;
        
        Scanner entrada = new Scanner(System.in);
        //Entrada de datos 
        System.out.println("Ingrese los datos solicitados:");
        
        System.out.println("Nombre del empleado");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Número de horas trabajadas durante la semana");
        numHorasTrabajoSemana = entrada.nextInt();
        
        System.out.println("Valor de la hora de trabajo");
        valorHora =entrada.nextFloat();
        //Procesos y casos
        // Cuando son menos de 40 horas de trabajo
        if (numHorasTrabajoSemana<40){
            salario = numHorasTrabajoSemana *valorHora;
      
        }
        //Cuando se exceden las 40 horas de trabajo 
        if (numHorasTrabajoSemana>=40){
            numHorasExtras= numHorasTrabajoSemana - 40;
      
        }else {
            salario = numHorasTrabajoSemana *valorHora;
        }
        //Cuando se exceden las 48 horas de trabajo     
        if(numHorasExtras>8 ){
            horasExtrasMas8 = numHorasExtras -8;
            salario = (40*valorHora) + (16*valorHora)+ (horasExtrasMas8 *valorHora*3);
        }else{
            salario = (40*valorHora) + numHorasExtras*2*valorHora;
        }
        
        System.out.println("El trabajador "+nombreEmpleado+
                "\ndevengo: $ "+ salario);
    }
}
