/*
Pasarle dos números a un método y que devuelva el mayor */

package com.mycompany.ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio32 {
    
    // Método que devuelve el máximo entre dos números
    static int maximo(int a, int b) // Método con dos parámetros
    {
        int max = 0;
        
        if(a > b)
            max = a;
        else
            max = b;
        
        return (max);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int a = 0, b = 0;
        
        // Solicitar al usuario dos números
        System.out.print("Introduce un número: ");
        a = sc.nextInt();
        System.out.print("Introduce otro número: ");
        b = sc.nextInt();
        
        // Llamar al método maximo() para obtener el máximo entre los dos números
        max = maximo(a, b);
        
        // Mostrar el resultado
        System.out.println("El número mayor es: " + max);
    }
}