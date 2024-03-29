/*
Este programa pedirá una indefinida cantidad de números, y en el momento en que 
el usuario teclee un cero, dejará de pedir más números. Al final mostrará la suma 
de todos los números introducidos. */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        int num = 0, suma = 0;
        Scanner sc = new Scanner(System.in);

        // Bucle do-while para ingresar números hasta que se ingrese un 0.
        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            suma = suma + num;
        } while (num != 0);

        // Muestra la suma de todos los números ingresados.
        System.out.println("La suma de todos los números es: " + suma);
    }
}
