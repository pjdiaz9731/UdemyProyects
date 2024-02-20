/*
El programa nos pedirá 6 calificaciones a introducir, y al final nos dirá cuántos 
alumnos aprobaron, cuántos tuvieron calificación de "excelencia", y cuántos reprobaron. */

package com.mycompany.ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        
        // Inicialización de variables.
        int aprobados = 0;
        int reprobados = 0;
        int excelentes = 0;
        float calif = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        // Bucle while para ingresar calificaciones de 6 alumnos.
        while (i <= 6) 
        {            
            System.out.println("Introduzca una calificación del 0 al 10: ");
            calif = sc.nextFloat();

            // Evalúa la calificación y actualiza contadores según rangos.
            if (calif >= 9 && calif <= 10) 
            {
                excelentes++;   
            }
            else if (calif >= 6) 
            {
                aprobados++;
            }
            else
                reprobados++;
                i++; // Incrementa el contador de alumnos.
        }
        
        // Muestra la cantidad de alumnos aprobados, reprobados y excelentes.
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);
        System.out.println("Cantidad de alumnos excelentes: " + excelentes);           
    }
}