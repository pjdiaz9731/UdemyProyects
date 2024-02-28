public class Caracteres_Especiales {

    public static void main(String[] args) {
        
        var nombre = "Karla";
        var apellido = "Esparza";
        
        
        System.out.println(nombre + " " + apellido);// El " " es un caracter especial
        System.out.println("Nueva Linea: \n" + nombre);// \n otro caracter especial
        System.out.println("Tabulador: \t" + nombre);// \t otro caracter especial
        System.out.println("Retroceso: \b" + nombre);// \b otro caracter especial
        System.out.println("Retorno de carro: \r" + nombre);// \r otro caracter especial es como el \n, para usar ambos correctamente dependientemente del sistema operativo que se utilize se usa : System.lineSeparator()
        System.out.println("Comilla simple: \'" + nombre + "\'");// \' otro caracter especial
        System.out.println("Comilla doble: \"" + nombre + "\"");// \" otro caracter especial y funciona parecido a las comillas simples
        
        System.out.println("saludos");//El println es para salto de linea
        System.out.print("adios");//No hace el salto de linea
        System.out.println("nos vemos");


    }
}
