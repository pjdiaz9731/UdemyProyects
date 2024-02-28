public class Concatenacion {

    public static void main(String[] args) {
   
        /*Los valores deben incluir tipos String o char
        Nota: Para concatenar es agregar el signo de "+"*/
        var usuario = "Juan";
        var saludar = "Hola";
        
        System.out.println(saludar +" "+ usuario);
    
        /*Ejemplo para cuando es una suma */
    
        var i = 3;
        var j = 5;
        System.out.println(i + j);
    
        //Nota: Se evalua de izquierda a derecha
        System.out.println(saludar + i + j); /*Nota: Si del lado izquierdo hay una cadena el resto lo va a concatenar*/
        System.out.println(i + j + saludar);/*Nota: Si del lado izquierdo hay numeros va a realizar la suma y el resto lo va a concatenar*/
 
    }
}
