//El programa capta 10 numero enteros en un erreglo y los desplaza de posicion 
package com.mycompany.ejercio16;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercio16 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int ultimo;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un Valor: ");
            arr[i] = sc.nextInt();
        }

        ultimo = arr[9];// almaccenar el ultimo valor de array

        for (int i = 8; i >=0; i--) {
            arr[i + 1] = arr[i];

        }
        arr[0] = ultimo;
        System.out.println("Mostrar arreglo desplazado: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
