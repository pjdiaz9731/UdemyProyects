/*
Programa que calcule el costo del estacionamiento en un parking. 
Las primeras 3 horas se cobrarán a 20 pesos. Las siguientes después de las 3 horas, 
a 15 pesos. Hasta llegar al tope de 250 pesos, para 24 horas.
Si se permanece aparcado por más de un día, se cobrarán 250 pesos por día. 
Y 15 pesos las horas siguientes. Se le pedirá al usuario ingresar la cantidad de horas, 
y debe obtener el precio. Usar métodos. */

package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Diego
 */

public class Ejercicio19 {

    public static void main(String[] args) 
    {
        int numHoras = 0; // Variable para almacenar la cantidad de horas
        double precioTotal = 0; // Variable para almacenar el precio total
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada de datos
        
        System.out.println("Cantidad de horas: ");
        numHoras = sc.nextInt(); // Obtener la cantidad de horas desde la entrada estándar
        
        precioTotal = calcularPrecio(numHoras); // Calcular el precio total llamando a la función calcularPrecio
        System.out.println("Total a pagar: " + precioTotal); // Mostrar el resultado del precio total
    }
    
    // Función para calcular el precio total
    public static double calcularPrecio(int horas)
    {
        double precio, precioResto; // Variables para almacenar el precio total y el precio por horas restantes
        int restoHoras; // Variable para almacenar las horas restantes después de los primeros 24
        int dias; // Variable para almacenar el número de días
        
        if (horas <= 24) // Verificar si las horas son igual o menor a 24
        {
            if (horas <= 3) 
            {
                precio = horas * 20; // Calcular el precio si las horas son 3 o menos
            }
            else
            {
                precio = (3 * 20) + ((horas - 3) * 15); // Calcular el precio si las horas son más de 3
                if (precio >= 250) 
                {
                    precio = 250; // Establecer el precio máximo a 250
                }
            }
        }
        else
        {
            dias = horas / 24; // Calcular el número de días
            restoHoras = horas % 24; // Calcular las horas restantes después de los primeros 24
            System.out.println("Su carro estuvo estacionado " + dias + " días" + " y " + restoHoras + " horas");
            precioResto = restoHoras * 15; // Calcular el precio por las horas restantes
            if (precioResto >= 250) 
            {
                precioResto = 250; // Establecer el precio máximo a 250
            }
            precio = dias * 250 + precioResto; // Calcular el precio total incluyendo los días y las horas restantes
        }
        return precio; // Devolver el resultado del precio total
    }
}