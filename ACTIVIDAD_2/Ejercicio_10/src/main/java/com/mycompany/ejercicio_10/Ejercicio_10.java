
package com.mycompany.ejercicio_10;
import java.util.Scanner;
/**
 *
 * @author ALEJANDRA ROJAS
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        
       int numInscripcion, estrato;
       String nombres;
       float patrimonio =0,valorMatricula= 50000, incremento=0;
        
        Scanner entrada = new Scanner(System.in);
        //Entrada de datos 
        System.out.println("Ingrese los datos solicitados:");
        System.out.println("Número de inscripción: ");
        numInscripcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre compelto del estudiante ");
        nombres = entrada.nextLine();
        System.out.println("Valor de su patrimonio: ");
        patrimonio = entrada.nextFloat();
        System.out.println("Estrato social al que pertenece: ");
        estrato = entrada.nextInt();
        
        if (patrimonio > 2000000 && estrato>3 ){
            
            incremento = patrimonio *0.03f;
            valorMatricula += incremento ;
            
        }else {
            
            valorMatricula= 50000;
        }
        System.out.println("El estudiante con número de inscripción "+numInscripcion+
                " y nombre "+nombres+" debe pagar $ "+valorMatricula);   
    }
}
