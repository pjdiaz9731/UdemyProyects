//Programa para saber el total a pagar de produtos 
package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        String codigo = "";
        int kilos=0;
        float precio=0;
        float importeFactura=0;
        float facturacionTotal=0;
        int contador=0;
        int totalKilos=0;
        Scanner sc = new Scanner (System.in);
        
        for(int i=1;i<=5;i++){ 
            System.out.println("Factura numero : #"+i);
            System.out.println("Codigo de producto: ");
            codigo=sc.next();
            System.out.println("Cantidad de kilos: ");
            kilos=sc.nextInt();
            System.out.println("Precio: ");
            precio=sc.nextFloat();
           importeFactura=kilos*precio;
           facturacionTotal = importeFactura+facturacionTotal;
        
        if(importeFactura>=1000){
        contador++;
        }
        totalKilos=kilos+totalKilos;
        }
        System.out.println("Detalles de la venta");
        System.out.println("Facturacion total: $" + facturacionTotal);
        System.out.println("Total de kilos vendidos:"+totalKilos);
        
        
        
        
        
        
        
    }
}
