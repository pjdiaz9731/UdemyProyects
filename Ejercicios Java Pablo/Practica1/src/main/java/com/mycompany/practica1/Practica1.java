/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

/**
 *
 * @author pjdiaz
 */
public class Practica1 {

    public static void main(String[] args) {
       System.out.println("Cuantos numeros piensas decirme");
       int a = Integer.parseInt(System.console().readLine());
       int i =0,s=0;
       while (i < a){
           System.out.println("Dime un numero");
           int n = Integer.parseInt(System.console().readLine());
           s = s + n;
           i = i + 1;}
float media = s / a;
        System.out.println("La media es " + media);
       }
    }

