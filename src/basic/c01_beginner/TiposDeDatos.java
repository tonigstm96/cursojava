package basic.c01_beginner;

public class TiposDeDatos {
    public static void main(String[] args) {

        //Tipos de datos primitivos

        int myInt = 37;
        System.out.println(myInt);

        //Tipo de datos concreto

        double myDouble = 37.69;
        System.out.println(myDouble);

        //Tipo de datos con decimales
        //También existen otras longitudes: float, long, byte

        char myChar = 'x';
        System.out.println(myChar);

        //Tipo de datos para un caracter. Tiene que ir declarado con unas comillas simples.

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        /* String no es realmente un tipo de datos primitivo, pero su funcionamiento es parecido. Se usa para cadenas de texto. */
        //Boolean con mayúscula es una clase

        System.out.println(myString.getClass().getSimpleName());
    }
}
