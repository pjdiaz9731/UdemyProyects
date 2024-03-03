/*
Crear método reciba un arreglo, y ordene sus números de menor a mayor.
En este programa se utilizará el método de la burbuja */

package com.mycompany.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio26 {

    
    public static void main(String[] args) 
    {
        // Array a ordenar
        int array[] = new int[10]; // Crear un array de tamaño 10
        Scanner sc = new Scanner(System.in); 
        System.out.println("Rellenar arreglo: ");
        int k = 0;
        
        // Llenar el array con números ingresados por el usuario
        while (k < array.length) 
        {            
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            array[k] = num;
            k++; 
        } 
        
        // Llamada a la función para ordenar el arreglo
        ordenarArreglo(array);
        
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");   
        }
    }
    
    // Función para ordenar el arreglo mediante el algoritmo de burbuja
    public static void ordenarArreglo(int a[])
    {
        int contadorIntercambios = 0; // Variable para contar los intercambios realizados
        
        // Bucle para repetir el proceso hasta que el arreglo esté ordenado
        for (boolean ordenado = false; !ordenado;) 
        {
            // Bucle para comparar y realizar intercambios
            for (int i = 0; i < a.length - 1; i++) 
            {
                if (a[i] > a[i + 1]) 
                {
                    // Intercambiar elementos si el actual es mayor que el siguiente
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    contadorIntercambios++;
                } 
            }
            
            // Cuando no existan más intercambios, el arreglo estará ordenado
            if (contadorIntercambios == 0) 
            {
                ordenado = true;
            }
            contadorIntercambios = 0; // Se reinicia la variable para la siguiente iteración
        }
    }
}