/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica2;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Practica2 {

    public static void main(String[] args) {
        double ventas[] = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las 10 ventas del mes ");
        for (int i = 0; i < ventas.length; i++) {

            System.out.println("venta" + (i + 1)+":");
            ventas[i] = sc.nextDouble();
        }

        int k = 0;
        int total = 0;
        while (k < 10) {

            if (ventas[k] >= 500) {

                System.out.println("$"+ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas total que son mayores a 500 es de:"+total);
    }
}
