package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        System.out.println("Antonio Gutiérrez Simón");

        //Con println puedo imprimir una variable o en este caso una línea de texto

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("Hola\nmundo");

        //Si uso \n, que significa newline puedo bajar de línea!

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        //Hecho!

        // 4. Crea un comentario en varias líneas.
        /*Para hacer un comentario en varias líneas basta con usar estas slashes con su asterisco,
        * asi como ves el comentario llega a varias líneas y no solo una*/

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("27");
        System.out.println("Rojo");
        System.out.println("Orihuela");

        //Esto puedo hacerlo con un solo println en verdad. Sería así.
        System.out.println("27\nRojo\nOrihuela");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Mensaje de error!");
        //Err da mensaje de error!
        //System.in sería usando el scanner.

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Hola");
        System.out.println("me");
        System.out.println("llamo");
        System.out.println("Toni");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println(":)");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        //Directamente no deja ejecutar!

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        //Creo que el ide me lo renombra todo para que no explote

    }
}