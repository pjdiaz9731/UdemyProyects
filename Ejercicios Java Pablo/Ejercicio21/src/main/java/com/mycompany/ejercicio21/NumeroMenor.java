/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio21;

/**
 *
 * @author pjdiaz
 */
public class NumeroMenor {
  public static int NumeroMenor (int t []) {  
        int menor;
   menor= t[0];
        for (int i = 0; i < t.length; i++) {
             if (t[i]<menor)menor=t[1];   
            }
            return menor;
        }
    }


