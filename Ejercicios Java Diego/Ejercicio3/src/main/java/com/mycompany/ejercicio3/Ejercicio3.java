/*
La pieza de pan cuesta a $5.
Si se compraron más de 50 piezas, cada pieza costará a $4.5
Si se compraron más de 100, cada pieza costará a $4. */

package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int cantPiezas = 0;
        double totalpago = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas de pan a comprar");
        cantPiezas = scanner.nextInt();
        if (cantPiezas >= 50 && cantPiezas < 100) {
            totalpago = cantPiezas * 4.5;
        } else if (cantPiezas >= 100) {
            totalpago = cantPiezas * 4;
        } else {
            totalpago = cantPiezas * 5;
        }
        System.out.println("El cliente compró " + cantPiezas + " piezas de pan");
        System.out.println("El total a pagar es: " + totalpago);

    }
}
