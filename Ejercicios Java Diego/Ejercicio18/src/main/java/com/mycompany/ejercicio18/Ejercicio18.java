/*
El programa nos pedirá el número de piezas, y el precio por pieza. 
Si se compraron 100 o más piezas, se aplicará un descuento del 20%. 
Crearemos un método que nos diga cuánto será el total a pagar. */

package com.mycompany.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio18 {

    public static void main(String[] args) 
    {
        int num_piezas = 0; // Variable para almacenar la cantidad de piezas
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada de datos
        System.out.println("Cantidad de piezas: ");
        num_piezas = sc.nextInt(); // Obtener la cantidad de piezas desde la entrada estándar
        System.out.println("Precio por pieza:  ");
        double precio = sc.nextDouble(); // Obtener el precio por pieza desde la entrada estándar
        double pagoTotal = calcularPago(num_piezas, precio); // Calcular el pago total llamando a la función calcularPago
        System.out.println("El pago total es: " + pagoTotal); // Mostrar el resultado del pago total
    } 
 
    // Función para calcular el pago total
    public static double calcularPago(int piezas, double precio)
    {
        double pagoTotal = 0; // Variable para almacenar el pago total
        
        // Verificar si la cantidad de piezas es mayor o igual a 100
        if (piezas >= 100) 
        {
            // Calcular el pago total con descuento del 20%
            pagoTotal = (precio * piezas) - (precio * 0.20 * piezas);
        }
        else
        {
            // Calcular el pago total sin descuento
            pagoTotal = precio * piezas;
        }
        
        return pagoTotal; // Devolver el resultado del pago total     
    }
}    
    















    


