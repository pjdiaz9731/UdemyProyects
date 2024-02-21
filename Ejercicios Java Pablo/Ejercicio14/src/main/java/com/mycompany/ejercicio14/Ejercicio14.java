/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int a []=new int [10];
        int b []=new int[10];
        int c []=new int[20];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introducir los datos para el array 'a': ");
        
        for (i = 0;i<a.length; i++) {
          
            System.out.println("Posicion"+(i+1)+" :");
            a[i]=sc.nextInt();
         }
        System.out.println("Introducir los datos para el array 'b': ");
        
        for (i = 0;i<b.length; i++) {
            System.out.println("Posicion"+(i+1)+" :");
            b[i]=sc.nextInt();
        }
        System.out.println("Pasar numero al array 'c' : ");
        j=0;
        for (i=0; i<10; i++) {
          c[j]=a[i];
            System.out.println(c[j]);
            j++;
            c[j]=b[i];
            System.out.println(c[j]);
            j++;
        }
    }
}
