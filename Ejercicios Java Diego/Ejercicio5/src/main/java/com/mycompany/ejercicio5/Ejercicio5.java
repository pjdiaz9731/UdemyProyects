/*
Usando un ciclo while, haremos este programa. Se nos pedirán una indeterminada 
cantidad de números, con la condición que sólo sean positivos. Y el programa 
sumará esos números, y obtendrá su promedio. */

package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int num = 0, suma = 0, cantidadNumeros = 0;
        double media = 0;

        System.out.println("Introduce un número positivo");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        // Bucle while para ingresar números positivos y calcular la suma.
        while (num > 0) {
            suma = suma + num;
            cantidadNumeros++;
            System.out.println("Introduzca otro número");
            num = sc.nextInt();
        }

        // Verifica si se ingresaron números para evitar división por cero.
        if (cantidadNumeros == 0) {
            System.out.println("No se puede calcular la media");
        } 
        else 
        {
            // Calcula y muestra la media.
            media = (double) suma / cantidadNumeros; // Cast a double para obtener resultado decimal.
            System.out.println("La media es: " + media);
        }

    }
}
