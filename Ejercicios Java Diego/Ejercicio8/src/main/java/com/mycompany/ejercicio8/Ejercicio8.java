/*
El programa es para gestionar facturas de una empresa azucarera, que se encarga 
de la venta por kilos; la factura pedirá el código del producto, la cantidad de kilos, 
el precio por cada kilo, y el importe de esa factura. Además, por cada 5 facturas, 
nos dirá cuál de ellas sobrepasó la cantidad de $1000, y nos dará la facturación 
total de esas 5 facturas. */

package com.mycompany.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        String codigo = " ";
        int kilos = 0;
        float precio = 0;
        float importeFactura = 0;
        float facturacionTotal = 0;
        int contador = 0;
        int totalKilos = 0;
        Scanner sc = new Scanner(System.in);
        
        // Bucle for para ingresar datos de 5 facturas.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura n° " + i);
            System.out.println("Código del producto: " );
            codigo = sc.next();
            System.out.println("Cantidad en kilos: ");
            kilos = sc.nextInt();
            System.out.println("Precio: ");
            precio =sc.nextFloat();
            importeFactura = kilos * precio;
            facturacionTotal = importeFactura + facturacionTotal;
            
            // Verifica si el importe de la factura es mayor o igual a 1000.
            if (importeFactura >= 1000) {
                contador++;
            }
            totalKilos = kilos + totalKilos;
        } 
        
        // Muestra los detalles de la venta.
        System.out.println("Detalles de la venta: ");
        System.out.println("Facturación total: " + facturacionTotal);
        System.out.println("Total de kilos vendidos: " + totalKilos);
    }
}