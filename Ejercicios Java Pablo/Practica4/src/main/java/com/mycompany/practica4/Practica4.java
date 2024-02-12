
package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Practica4 {

    public static void main(String[] args) {
        int Piezas= 0;
        double totalPago = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas a comprar");
      Piezas=scanner.nextInt();
      if (Piezas>=50 &&Piezas<100){
          
         totalPago=Piezas*4.5; 
         }
     
      else if(Piezas >= 100){
          totalPago=Piezas*4;
     }
      
      else {
      totalPago=Piezas*5;
      }
      
        System.out.println("El cliente compro"+ Piezas+" de pan");
        System.out.println("el total a parar es de :"+ totalPago);
              
    }
        
}
