/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Rellenar arrlego: ");
        int k = 0;
        while (k < arr.length) {
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            arr[k] = num;
            k++;

        }
        ordenarArreglo(arr);

        System.out.println("Arreglo Ordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void ordenarArreglo(int a[]) {
        int contadorIntercambios = 0;
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    
                    int aux = a [i];
                    a[i]=a[i+1];
                    a[i+1]=aux;
                    contadorIntercambios++;
                }
            }
            if(contadorIntercambios==0){
            ordenado=true;
            
            }
            contadorIntercambios=0;
        }

    }
}
