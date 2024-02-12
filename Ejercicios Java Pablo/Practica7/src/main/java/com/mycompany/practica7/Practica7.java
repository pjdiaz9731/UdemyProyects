//el programa multiplica los primeros 10 numeros impares entre si 1,3,5,7,9,11,15,17,19

package com.mycompany.practica7;

/**
 *
 * @author pjdiaz
 */
public class Practica7 {

    public static void main(String[] args) {
       long productoImpares= 1;
       for(int i=1;i<20;i+=2){
       productoImpares=productoImpares*i;
       
       }
       
        System.out.println("El resultado de multiplicar los primero 10 numero impares es: " + productoImpares );
       
       
       
    }
}
