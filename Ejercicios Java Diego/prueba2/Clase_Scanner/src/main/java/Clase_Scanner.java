
import java.util.Scanner;

public class Clase_Scanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporcione el valor del usuario");
        var usuario = scanner.nextLine();
        System.out.println("Usuario = " + usuario);
                
    }
}
