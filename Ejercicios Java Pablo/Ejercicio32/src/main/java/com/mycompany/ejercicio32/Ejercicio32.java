/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

    static int maximo(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int a = 0, b = 0;
        System.out.println("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = sc.nextInt();
        max = maximo(a, b);
        System.out.println("El numero maximo es: " + maximo(a, b));
    }
}
