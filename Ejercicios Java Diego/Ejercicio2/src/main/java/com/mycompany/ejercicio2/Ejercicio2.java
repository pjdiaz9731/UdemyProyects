/*
Crearemos un arreglo de 5 posiciones, para almacenar números enteros, y el programa al finalizar 
nos dirá cuál es el mayor de esos 5. */

package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int array[] = new int[5];
        int mayor = array[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 5 números");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] > mayor) {
                mayor = array[i];
            }
            System.out.println("El numero mayor es: " + mayor);
        }

    }
}
