/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica07;

import java.util.Scanner;


public class Practica07 {

    public static void main (String[]arg){
    
int num = 0, cantidad_negativos=0, cantidad_positivos=0;
int sumaNegativo=0,suma_positivos=0,cantidadCeros = 0; 
double promedioPositivo= 0, promedioNegativos=0;
int k = 0;
Scanner teclado = new Scanner(System.in);
while (k<10){
    System.out.println("Introduce un numero");
    num=teclado.nextInt();
    if (num==0)cantidadCeros++;
    else if (num>0){
    cantidad_positivos++;
    suma_positivos=suma_positivos+num;
    }
    else
    {
    cantidad_negativos++;
    sumaNegativo=sumaNegativo+num;
    
    
    }
    k++;
   }
if (cantidad_positivos==0)System.out.println("No se puede realizar el promedio");

else {
promedioPositivo=suma_positivos/cantidad_positivos;
    System.out.println("El promedio de los positivos es: " + promedioPositivo);
}
if(cantidad_negativos==0)System.out.print("No se puede realizar el promedio");
else {
promedioNegativos=sumaNegativo/cantidad_negativos;
    System.out.println("El promedio negativo es: " + promedioNegativos);

 }

    }

}