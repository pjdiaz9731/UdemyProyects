/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int max;
        int t [] = new int [6];
        System.out.println("Llenar arreglo con numeror alearotios "
                + "entre 1 y 100");
        System.out.println("Los numeros añadidos son : ");
        for (int i = 0; i < t.length; i++) {
            t[i]=(int)(Math.random()*100+1);
            System.out.println(t[i]);
        }
    max=NumeroMayor.numeroMaximo(t);
        System.out.println("El numero mayor es:" + max);
    }
    
}
