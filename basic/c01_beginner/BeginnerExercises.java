package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Toni";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 29;

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.70;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustoProgramar = true;

        // 5. Declara una constante con tu email.
        final String email = "tonigstm96@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'T';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Orihuela";
        //String localidad = "Orihuelika";
        System.out.println(localidad);
        //Si la vuelvo a cambiar e imprimir me dice que ya está definida y da error.
        //Sin embargo, se puede hacer esto:
        localidad = "Orihuelika";
        System.out.println(localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 3;
                System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        //System.out.println(a.getClass().getSimpleName());
        //System.out.println(b.getClass().getSimpleName());
        // No funciona porque es solo para tipos no primitivos!

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int x;
        x = 10;
                System.out.println(x);
    }


}
