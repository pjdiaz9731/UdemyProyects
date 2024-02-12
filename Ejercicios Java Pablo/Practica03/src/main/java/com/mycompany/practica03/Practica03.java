package com.mycompany.practica03;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {

        int array[] = new int[5];
        int mayor = array[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 5 numero");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
   
        System.out.println("El numero mayor es:"+ mayor);
    }
}

