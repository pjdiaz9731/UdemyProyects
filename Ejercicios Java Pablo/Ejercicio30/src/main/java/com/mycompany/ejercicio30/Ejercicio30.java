/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio30;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        boolean creciente, decreciente;
        creciente = false;
        decreciente = false;
        int arr[] = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 9; i++) {
            if (arr[i] > arr[i + 1])// momento es decreciente
            {
                decreciente = true;
            }

            if (arr[i] < arr[i + 1])// momento es creciente
            {
                creciente = true;
            }

            if (creciente == true && decreciente == false) {
                System.out.print(" La serie es Creciente ");
            }
            if (creciente == false && decreciente == true) {
                System.out.print(" La serie es Decreciente ");
            }
            if (creciente == true && decreciente == true) {
                System.out.print(" La serie es esta desosrdenada ");
            }
            if (creciente == false && decreciente == false) {
                System.out.print(" La serie es igual ");
            }

        }

    }

}
