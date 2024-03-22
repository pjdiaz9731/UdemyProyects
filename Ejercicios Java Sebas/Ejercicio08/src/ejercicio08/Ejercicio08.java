package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /**
         * El programa es para gestionar facturas de una empresa azucarera, que se encarga 
         * de la venta por kilos; la factura pedirá el código del producto, la cantidad 
         * de kilos, el precio por cada kilo, y el importe de esa factura. Además, 
         * por cada 5 facturas, nos dirá cuál de ellas sobrepasó la cantidad de $1000, 
         * y nos dará la facturación total de esas 5 facturas
         */
        
        int Codigo = 0, kilos = 0, contador = 0, totalkilos = 0;
        float  importe = 0, precio = 0, facturaTOTAL = 0;
                
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese el codigo del producto ");
        Codigo = entrada.nextInt();        
        System.out.print("Ingrese la cantidad de kilos del producto ");
        kilos = entrada.nextInt();
        System.out.print("Ingrese el precio por cada kilo del producto ");
        precio = entrada.nextFloat();
        
        importe = kilos*precio;
        facturaTOTAL = importe+facturaTOTAL;
        
            if(importe >= 1000){
                contador++;
            }
        totalkilos = kilos+totalkilos;
        }
        System.out.print("Detalles de la venta ");
        System.out.print("Facturación total: " + facturaTOTAL);
        System.out.print("Total de kilos vendidos: " + totalkilos);
        
            
    }
    
}
