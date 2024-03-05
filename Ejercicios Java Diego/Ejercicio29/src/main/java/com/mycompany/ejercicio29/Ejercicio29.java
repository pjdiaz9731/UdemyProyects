/*
Programa que me diga cuáles números son múltiplos de 3

En el código de declara una variable de tipo boolean, que si se comprueba que 
el número introducido es múltiplo, esa variable se hará "true". 
Sí no lo es, se quedará en "false".*/

package com.mycompany.ejercicio29;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio29 {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in); 
        int num = 0; // Variable para almacenar el número ingresado por el usuario
        boolean multiplo_3; // Variable para verificar si el número es múltiplo de 3
        multiplo_3 = false; // Inicializar la variable como falso
        
        // Bucle para ingresar 5 números y verificar si son múltiplos de 3
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt(); // Obtener un número desde la entrada estándar
            
            if (num % 3 == 0) // Verificar si el número es múltiplo de 3
            {
                multiplo_3 = true; // Cambiar la variable a verdadero si es múltiplo de 3
                System.out.println("Sí es múltiplo de 3\n");
            }
            else
            {
                System.out.println("No es múltiplo de 3\n");
            }
            
            multiplo_3 = false; // Restablecer la variable a falso para la siguiente iteración
        }
    }
}