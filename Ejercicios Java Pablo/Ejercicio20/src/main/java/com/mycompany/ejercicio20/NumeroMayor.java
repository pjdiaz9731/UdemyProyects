/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio20;

/**
 *
 * @author pjdiaz
 */
public class NumeroMayor {

    static int numeroMaximo(int t[]) {
        int max;
        max = t[0];
        for (int i = 0; i < t.length; i++) {

            if (t[i] > max) {
                max = t[i];
            }

        }
        return max;
    }

}
