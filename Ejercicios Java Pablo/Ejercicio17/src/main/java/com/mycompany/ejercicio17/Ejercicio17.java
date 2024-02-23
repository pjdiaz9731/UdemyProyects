//Introducir 5 numero de forma creciente en un arreglo, posterior se ingresa un nuevo numero 
// y este se almacena en el lugar conreespondiente
package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int num, pos_num, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los 5 digitos ordenador de forma creciente: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();// se almacenan los 5 primeros datos
        }
        System.out.println("Ingrese un valor entero: ");
        num = sc.nextInt();
        pos_num = 0;
        j = 0;

        while (arr[j] < num && j <= 4) {
            pos_num++;
            j++;
        }
        for (int i = 4; i >= pos_num; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos_num]=num;
        System.out.println("Nuevo arreglo ordenado: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
