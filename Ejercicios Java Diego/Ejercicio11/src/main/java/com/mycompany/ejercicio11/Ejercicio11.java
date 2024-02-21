/*
Iremos capturando el número de control y calificación de cada alumno, de un total 
de 5 alumnos. El programa nos irá mostrando en pantalla cuáles han reprobado. */

package com.mycompany.ejercicio11;

import javax.swing.JOptionPane;


public class Ejercicio11 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables.
        int calificacion = 0;
        String numControl = " "; // Almacena el número de control del alumno.
        boolean reprobado = false; // Bandera para determinar si el alumno ha reprobado.

        // Bucle for para procesar 5 alumnos.
        for (int i = 0; i < 5; i++) {
            // Solicita al usuario el número de control del alumno.
            numControl = JOptionPane.showInputDialog("Alumno  " + (i + 1) + "\n" + "Introduce el número de control");
            // Solicita al usuario la calificación del alumno.
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación"));

            // Verifica si la calificación es menor a 6 para marcar como reprobado.
            if (calificacion < 6) reprobado = true;

            // Muestra un mensaje indicando si el alumno ha reprobado o no.
            if (reprobado) {
                JOptionPane.showMessageDialog(null, "El alumno " +  numControl + " ha reprobado");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno " +  numControl + " NO ha reprobado");
            }
            // Restablece la bandera reprobado para el siguiente alumno.
            reprobado = false; // Esta línea es necesaria para restablecer el estado de reprobado para cada nuevo alumno.
        }  
    }
}
