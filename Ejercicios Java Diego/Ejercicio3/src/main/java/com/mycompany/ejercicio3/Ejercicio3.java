/*
La pieza de pan cuesta a $5.
Si se compraron más de 50 piezas, cada pieza costará a $4.5
Si se compraron más de 100, cada pieza costará a $4. */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        int cantPiezas = 0;
        double totalPago = 0; // Mejora el nombre de la variable por convención camelCase.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de piezas de pan a comprar");
        cantPiezas = scanner.nextInt();

        // Condicionales para calcular el total a pagar según la cantidad de piezas.
        if (cantPiezas >= 50 && cantPiezas < 100) {
            totalPago = cantPiezas * 4.5;
        } else if (cantPiezas >= 100) {
            totalPago = cantPiezas * 4;
        } else {
            totalPago = cantPiezas * 5;
        }

        // Muestra la cantidad de piezas compradas y el total a pagar.
        System.out.println("El cliente compró " + cantPiezas + " piezas de pan");
        System.out.println("El total a pagar es: " + totalPago);

    }
}
