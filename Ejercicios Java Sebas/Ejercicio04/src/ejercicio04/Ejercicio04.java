package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        // Ejercicio 4 Java.- Programa que pida números, y al poner cero, deje de pedir, y que los sume
        
        Scanner sc = new Scanner(System.in);
        int dato = 0, total = 0;

         do {
            System.out.print("Digite numeros: ");        
            dato = sc.nextInt();
            total += dato;
        } while (dato != 0);
         
        System.out.print("La suma total de los numeros digitados es: " + total);       
    }
}
