
package com.mycompany.ejercicio_24;
import java.util.Scanner;
public class Ejercicio_24 {

    public static void main(String[] args) {
        float esferaA,esferaB,esferaC;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        esferaA = entrada.nextFloat();
        System.out.println("Ingrese el peso de la esfera B: ");
        esferaB = entrada.nextFloat();
        System.out.println("Ingrese el peso de la esfera C: ");
        esferaC = entrada.nextFloat();
        
        if (esferaA>esferaB && esferaA>esferaC){
            System.out.println("La esfera A es la de mayor peso");
        }else if (esferaB>esferaA && esferaB>esferaC){
            System.out.println("La esfera B es la de mayor peso");
        }else if (esferaC>esferaA && esferaC>esferaB){
            System.out.println("La esfera C es la de mayor peso");
        }else if(esferaA==esferaB && esferaA==esferaC){ 
            System.out.println("Todas las esfereas pesan lo mismo");
 
        }else{
            System.out.println("Hay esferas con el mismo peso");
        }
    }
}
