/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio25 {

    public static void main(String[] args) {
       int matriz [][]= new int[3][3];
       Scanner sc= new Scanner(System.in);
        System.out.println("***Ingresa los numeros de la matri***");
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa numero: ");
                int num=sc.nextInt();
                if (num>=0){
                matriz[i][j]=num;
                j++;
                }
                else {
                        System.out.println("El numero es negativo" + "No se puede ingresar en la matriz");
                        }
                
                }
                
            }
        System.out.println("Mostrar matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            
        }
        System.out.println("\n");
        for (int j = 0; j < matriz.length; j++) {
            
        }
        }
    
    
    }

