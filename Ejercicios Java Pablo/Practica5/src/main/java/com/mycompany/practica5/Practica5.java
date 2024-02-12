// El programa pide una cantidad indefinida de datod pero cuando teclee 0, el programa termina.
package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Practica5 {

    public static void main(String[] args) {
        int num = 0, suma = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Introduce un numero:");
            num=sc.nextInt();
            suma=suma+num;
        } while (num != 0);// si el numero es diferente a cero se repide el do while
    }
}
