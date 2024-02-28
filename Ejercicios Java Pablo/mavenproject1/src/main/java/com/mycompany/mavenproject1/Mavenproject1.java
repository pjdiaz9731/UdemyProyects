/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author pjdiaz
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        int arr []= new int [10];
        System.out.println("Numeros aleatorios entre 1 y 100");
        for (int i = 0; i < 10; i++) {
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        
    }
    
    
}
