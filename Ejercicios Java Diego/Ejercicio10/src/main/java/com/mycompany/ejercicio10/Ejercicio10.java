/*
El programa pedirá elegir la cantidad de sueldos, y después los introducimos 
con el teclado. Al final mostrará en pantalla cuál sueldo es el mayor. */

package com.mycompany.ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Declaración e inicialización de variables.
        int cantidadSueldos = 0;
        int sueldo = 0, sueldoMaximo = 0;
        boolean primerSueldo = false;

        // Solicita al usuario la cantidad de sueldos que se capturarán.
        cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos sueldos capturará?"));

        // Bucle for para ingresar los sueldos especificados por el usuario.
        for (int i = 1; i <= cantidadSueldos; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo " + (i)));

            // Verifica si es el primer sueldo ingresado.
            if (primerSueldo == false) {
                sueldoMaximo = sueldo;
                primerSueldo = true;
            }

            // Compara el sueldo actual con el sueldo máximo.
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        // Muestra el sueldo máximo mediante una ventana de mensaje.
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + sueldoMaximo);

    }
}
