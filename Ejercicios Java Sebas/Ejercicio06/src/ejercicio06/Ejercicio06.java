package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        // Ejercicio Java 6.- Programa que multiplique los 10 primeros números impares.
        
        Scanner sc = new Scanner(System.in);
        long impares = 1;
        
        System.out.println("Este programa muestra la multiplicacion de los primeros 10 impares: ");
        for (int i = 1; i< 20; i+=2) {
            impares = impares*i;    
        }
        System.out.print(impares);
    }
    
}
