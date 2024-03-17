package ejercicio07;
import java.util.Scanner;

public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 7 Java.- Capturar 10 números, y obtener promedio de los positivos y cantidad de ceros.
    
    
     int numero, Ppositivo = 0, Pnegativo = 0, ceros = 0;
        float Spositivo = 0F, Snegativo = 0F;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digita un numero: ");
            numero = entrada.nextInt();
            if (numero >= 1) {
                Spositivo += numero;
                Ppositivo++;
            }else if(numero <= -1){
                Snegativo += numero;
                Pnegativo++;
            }else if(numero == 0){
                ceros++;
            }
        }
        
        if (Ppositivo > 0 && Pnegativo > 0) {
            System.out.println("\nEl promedio de los numeros positivos es: " + (Spositivo/Ppositivo)
                         + "\nEl promedio de los numeros negativos es: " + (Snegativo/Pnegativo)
                         + "\nLa cantidad de ceros digitados fueron: " + ceros + "\n");
        }else if(Ppositivo <= 0){
            System.out.println("\nEl promedio de los numeros positivos no se pueden procesar"
                         + "\nEl promedio de los numeros negativos es: " + (Snegativo/Pnegativo)
                         + "\nLa cantidad de ceros digitados fueron: " + ceros + "\n");
        }else if(Pnegativo <= 0){
            System.out.println("\nEl promedio de los numeros positivos es: " + (Spositivo/Ppositivo)
                         + "\nEl promedio de los numeros negativos no se pueden procesar"
                         + "\nLa cantidad de ceros digitados fueron: " + ceros + "\n");   
            
        }    
       
}
}