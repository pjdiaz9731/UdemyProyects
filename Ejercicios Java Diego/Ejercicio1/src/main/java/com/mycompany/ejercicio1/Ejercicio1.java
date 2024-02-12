/*
Crearemos un arreglo de 30 posiciones, para almacenar las 30 ventas del mes. 
Y al final el programa mostrará en pantalla cuáles y en total cuántas superan 
la cantidad de $2000. */

package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        double ventas[] = new double[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las ventas del mes: ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1));
            ventas[i] = sc.nextDouble();
        }
        int k = 0;
        int total = 0;
        while (k < 30) {
            if (ventas[k] >= 2000) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayores a 2000 es: " + total);
    }
}
