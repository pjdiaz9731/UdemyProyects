/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3 Java.- Saber total a pagar, en base al descuento que se haga.
        
        /**
        * La pieza de pan cuesta a $5.
        * Si se compraron más de 50 piezas, cada pieza costará a $4.5
        * Si se compraron más de 100, cada pieza costará a $4
        */

        Scanner sc = new Scanner(System.in);
        int piezas = 0; 
        double total = 0;
        
        System.out.print("Ingrese la cantidad de piezas que compro: ");
        piezas = sc.nextInt();
        
        if (piezas >= 100) {
            total = piezas*4;
            System.out.println("Se compraron: " + piezas + " piezas y en total son: $" + total);
        } else if (piezas >= 50 && piezas <= 99) {
            total = piezas*4.5;
            System.out.println("Se compraron: " + piezas + " piezas y en total son: $" + total);
        } else if (piezas <= 49){
            total = piezas*5;
            System.out.println("Se compraron: " + piezas + " piezas y en total son: $" + total);
        }
    }
    
}
