/*
Capturaremos 10 números enteros, y el programa al final nos dirá de esos 10 números, 
cuál es el promedio de los positivos, cuál fue de los negativos, 
y la cantidad de ceros ingresados. */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        int num = 0, cantidadNegativos = 0, cantidadPositivos = 0;
        int sumaNegativos = 0, sumaPositivos = 0, cantidadCeros = 0;
        double promedioPositivos = 0, promedioNegativos = 0;
        int k = 0;
        Scanner teclado = new Scanner(System.in);

        // Bucle while para ingresar 10 números y realizar cálculos.
        while (k < 10) {
            System.out.println("Introduce un número");
            num = teclado.nextInt();

            // Evalúa y acumula según la condición.
            if (num == 0) {
                cantidadCeros++;
            } else if (num > 0) {
                cantidadPositivos++;
                sumaPositivos = sumaPositivos + num;
            } else {
                cantidadNegativos++;
                sumaNegativos = sumaNegativos + num;
            }
            k++;
        }

        // Verifica si hay números positivos para evitar la división por cero.
        if (cantidadPositivos == 0) {
            System.out.println("No se puede realizar el promedio de los números positivos");
        } else {
            // Calcula y muestra el promedio de los números positivos.
            promedioPositivos = sumaPositivos / cantidadPositivos;
            System.out.println("El promedio de los números positivos es: " + promedioPositivos);
        }

        // Verifica si hay números negativos para evitar la división por cero.
        if (cantidadNegativos == 0) {
            System.out.println("No se puede realizar el promedio de los números negativos");
        } else {
            // Calcula y muestra el promedio de los números negativos.
            promedioNegativos = sumaNegativos / cantidadNegativos;
            System.out.println("El promedio de los números negativos es: " + promedioNegativos);
        }

        // Muestra la cantidad de ceros ingresados.
        System.out.println("La cantidad de ceros es: " + cantidadCeros);

    }
}
