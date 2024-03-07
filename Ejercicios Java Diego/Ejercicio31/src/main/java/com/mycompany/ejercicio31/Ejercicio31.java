/*
Eliminar un número de un arreglo, eligiendo su posición */

package com.mycompany.ejercicio31;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio31 {

    public static void main(String[] args) 
    {
        int array[] = new int[10];
        int posicion;
        Scanner sc= new Scanner(System.in);
        
        // Se leen por teclado los 10 números
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Elemento (" + i +"): ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        
        // Leemos la posición que nos interesa
        // Suponemos que la posición  esta en el rango 0 ---> 9 
        System.out.print("posición a eliminar: ");
        posicion = sc.nextInt();
        
        // desde el valor de posición  desplazamos hasta el final todos los elementos
        // con lo que el elemento que está en posición , se pierde (se borra)
        for (int i = posicion; i < 9; i++) 
        {
            array[i] = array[i+1];
        }
        System.out.println("La tabla queda: ");
        for (int i = 0; i < 9; i++) 
        {
            System.out.println(array[i]);
        }
    }         
}
