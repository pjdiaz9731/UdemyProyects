/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ekercicio29;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ekercicio29 {

    public static void main(String[] args) {
        Scanner taclado = new Scanner(System.in);
        int num = 0;
        boolean multiplo_3;
        multiplo_3 = false;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero:  ");
            num = taclado.nextInt();
            if (num % 3 == 0) {
                multiplo_3 = true;
            }
            if (multiplo_3 == true) {
                System.out.print("El numero si es multiplo de 3, ");

            } else {
                System.out.print("No es multiplo de 3, ");
            }
            multiplo_3 = false;
        }
    }
}
