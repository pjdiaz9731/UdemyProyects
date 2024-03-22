package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        // Ejercicio 9 Java.- Introducir notas de 6 alumnos, y saber cuántos aprobaron y reprobaron.
        // Adaptado a notas reprobadas con -69, aprobadas con +70, excelencia con +95
        
        int notas = 0, aprobados = 0, reprobados = 0, aprobadosex = 0, i = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int j = 0; j < 12; j++) {                    
        System.out.print("Ingrese las notas de los 6 alumnos: ");
        notas = sc.nextInt();
        j++;
        
        if (notas <= 69) {
                reprobados++;
            } else if (notas >= 70 && notas <= 94){
                aprobados++;
            }else if (notas >= 95 && notas <= 100){
                aprobadosex++;
            }
        }
        
        System.out.print("De los 6 alumnos, reprobaron: " + reprobados + " aprobaron: " + aprobados + " aprobaron excelentes: " + aprobadosex );
    }
    
}
