/*
Otro ejercicio usando arreglos. Rellenaremos dos arreglos, A y B, con 12 números 
enteros cada uno. Y pondremos en un tercer arreglo C esos números, 
pero de manera especial: 3 números de A, luego 3 números de B. Luego, 
otros 3 números de A, luego otros 3 números de B... etc. */

package com.mycompany.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        int A[] = new int[12]; // Declaración de un arreglo 'A' de enteros con capacidad para 12 elementos.
        int B[] = new int[12]; // Declaración de un arreglo 'B' de enteros con capacidad para 12 elementos.
        int C[] = new int[24]; // Declaración de un arreglo 'C' de enteros con capacidad para 24 elementos.
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario.
        
        System.out.println("Ingresar datos al arreglo A:");

        // Bucle for para solicitar al usuario que ingrese datos en el arreglo 'A'.
        for (int i = 0; i < 12; i++) 
        {
            System.out.println("Ingresar el número: " + (i + 1));
            A[i] = sc.nextInt();
        }

        System.out.println("Ingresar datos al arreglo B:");

        // Bucle for para solicitar al usuario que ingrese datos en el arreglo 'B'.
        for (int i = 0; i < 12; i++) 
        {
            System.out.println("Ingresar el número: " + (i + 1));
            B[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        // Bucle while para combinar los elementos de 'A' y 'B' en 'C'.
        while (i < 12) 
        {            
            // Bucle for para copiar 3 elementos de 'A' a 'C'.
            for (int k = 0; k < 3; k++) 
            {
                C[j] = A[i + k];
                j++;
            }

            // Bucle for para copiar 3 elementos de 'B' a 'C'.
            for (int k = 0; k < 3; k++) 
            {
                C[j] = B[i + k];
                j++;
            }

            i += 3; // Incrementa i para avanzar al siguiente conjunto de 3 elementos en 'A' y 'B'.
        }

        System.out.println("Arreglo C: ");

        // Bucle for para mostrar los elementos del arreglo 'C'.
        for (j = 0;  j < 24; j++) 
        {
            System.out.println(C[j]); 
        }
    }
}