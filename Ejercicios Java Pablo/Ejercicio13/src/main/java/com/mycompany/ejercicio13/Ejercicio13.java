// guardar 10 numeros en un arreglo y al final mostrarlos en pantalla en el orden de primero,ultimo,segundo
// penultimo
package com.mycompany.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio13 {

    public static void main(String[] args) {
           int j;
           int arr[]=new int[10];
           Scanner sc=new Scanner(System.in);
           for (j=0;j<arr.length;j++){
               System.out.println("Introduce el numero: "+(j+1));
               arr[j]=sc.nextInt();
          }
           System.out.println("Mostrar los numeros");
           for (j=0;j<5;j++) {
               System.out.println(arr[j]);
               System.out.println(arr[9-j]);
            
        }
    }
}
