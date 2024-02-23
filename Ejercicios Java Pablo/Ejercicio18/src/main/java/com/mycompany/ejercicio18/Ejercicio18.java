//Programa nos pide una cantidad e piezas y si se compraron 100 o mas nos da un 20% de descuento
// calcula en total a pagar

package com.mycompany.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio18 {

    public static void main(String[] args) {
  int num_piezas=0;
  Scanner sc=new Scanner(System.in);
        System.out.println("Cantidad de piezas: ");
  num_piezas=sc.nextInt();
        System.out.println("Precio por pieza: ");
        double precio=sc.nextDouble();
        double pagoTotal=calcularPago(num_piezas,precio);
        System.out.println("El pagp total es : "+pagoTotal);
        }
    public static double calcularPago (int piezas,double pre) {
  double pagoTotal=0;
        if(piezas>=100) {
            pagoTotal=(pre*piezas)-(pre*0.20*piezas);
            
        }
        else{
         pagoTotal=pre*piezas;   
        }
        return pagoTotal;
    }
}

    
    
    
    
    

