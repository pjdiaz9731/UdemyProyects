package ejercico3_descuento;

import java.util.Scanner;

public class Ejercico3_Descuento {

    public static void main(String[] args) {
        
        /* La pieza de pan cuesta a $5.
        Si se compraron más de 50 piezas, cada pieza costará a $4.5
        Si se compraron más de 100, cada pieza costará a $4. */

        int cantPiezas = 0;
        double totalPago = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas de pan a comprar");
        cantPiezas = scanner.nextInt();
        if (cantPiezas > -50 && cantPiezas < 100) {
            totalPago = cantPiezas * 4.5;
        } else if (cantPiezas >= 100) {
            totalPago = cantPiezas * 4;
        } else {
            totalPago = cantPiezas * 5;
        }
        System.out.println("El cliente compro " + cantPiezas + " piezas de pan");
        System.out.println("El total a pagar es: " + totalPago);

    }

}
