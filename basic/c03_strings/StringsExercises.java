package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Toni";
        String surname = "Gutiérrez";
        String nomCompleto = name + " " + surname;
        System.out.println(nomCompleto);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(nomCompleto.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(nomCompleto.charAt(0));
        System.out.println(nomCompleto.charAt(13));
        //otra posible forma de hacerlo, quizás más correcta, si cambiara la variable seguiría dando ultimo carácter
        System.out.println(nomCompleto.charAt(nomCompleto.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(nomCompleto.toUpperCase());
        System.out.println(nomCompleto.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(nomCompleto.contains("oni"));

        // 6. Formatea un string con un entero.
        int age = 29;
        System.out.println(String.format("Hola, me llamo %s y tengo %d años", nomCompleto, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" A Eloy le gusta perder dinero en counter ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" A Eloy le gusta perder mucho dinero en counter ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(surname));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println((name.length()) == (surname.length()));

        // En este caso no se usa .equals porque .lenght da una variable de tipo int ;)
    }
}
