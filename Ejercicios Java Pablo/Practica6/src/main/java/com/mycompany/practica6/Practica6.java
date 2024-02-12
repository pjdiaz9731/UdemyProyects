// Crear un programa que nos pida numeros positivos y calcule la media

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Practica6 {

    public static void main(String[] args) {
      int num = 0, suma = 0,cantNUmeros=0;
      double media = 0 ;
        System.out.println("Ingresa un numero positivo");
        Scanner sc= new Scanner(System.in);
        num=sc. nextInt();
        while (num>0) {
      suma=suma+num;
      cantNUmeros++;
            System.out.println("introdusca otro numero:");
            num=sc.nextInt();
            
        }
        if(cantNUmeros==0){
            System.out.println("No se puede calcular la media");
         
        }
        else {
        media = suma/cantNUmeros;
            System.out.println("La media es:"+media);
        
        }
        
        
        
        
    }
}
