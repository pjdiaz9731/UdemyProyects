//  Programa para el costo de un parking
package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        int numHoras = 0;
        double precioTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de horas: ");
        numHoras = sc.nextInt();
        precioTotal=calcularPrecio(numHoras);
        System.out.println("Total a pagar: "+precioTotal);
    }
    public static double calcularPrecio(int horas) {
        double precio,precioResto;
        int restoHoras;
        int dias;
                if (horas<=24) {
                    
                    if (horas<=3) {
                     precio=horas*15;   
                    }
                    else
                        precio=((3*20)+(horas-3)*15);
                    if (precio >=250) {
                        precio=250;
                    }
                        
                }
                else{
                    dias=horas/24;
                    restoHoras=horas%24;
                    System.out.println("Tu coche estuvo aparcado "+dias+" dias y "+restoHoras+" horas");
                    precioResto=restoHoras*15;
                    if (precioResto>=250) {
                        precioResto=250;
                    }
                    precio=dias*250+precioResto;
                }
 return precio;
    }
}
    

