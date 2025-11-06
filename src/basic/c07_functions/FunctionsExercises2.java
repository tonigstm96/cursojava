package basic.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises2 {

    public static void main(String[] args) {

        // 🔥 FUNCIONES - NIVEL 2 🔥
        // Reto: completa las 10 funciones y pruébalas aquí dentro.
        System.out.println(mayor(7, 10));
        System.out.println(mayus("antonio"));
        boolean primo = true;
        primo(7);
        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("El número más grande del array es " + array(enteros));

        var users = new ArrayList<String>(Arrays.asList("Toni@gmail.com", "Guti@gmail.com", "Simón@gmail.com"));
        System.out.println("La cadena más larga es: " + list(users));
    }

    // 1. Crea una función que reciba dos números y devuelva el mayor de ambos.
    public static int mayor(int a, int b) {
        return Math.max(a, b); //versión más correcta
        // return (a > b) ? a : b ; - practicando ternarios
    }

    // 2. Escribe una función que reciba un String y retorne ese String en mayúsculas.
    public static String mayus(String palabra) {
        return palabra.toUpperCase();
    }

    // 3. Crea una función que reciba un número y devuelva true si es primo y false si no lo es.
    public static boolean primo(int a) {

        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 4. Haz una función que reciba un array de enteros y devuelva el valor máximo contenido en él.

    public static int array(Integer[] enteros) {

    int mayor = enteros[0];

    for (int i = 0; i < enteros.length; i++) {
         mayor = Math.max(mayor, enteros[i]); // ojo a este
    }

    return mayor;
    }

    // 5. Implementa una función que reciba un ArrayList<String> y devuelva la cadena más larga.

    public static String list(ArrayList<String> users) {
    int largo = 0;
    String mayor = "";

        for (String user: users) {
            if (user.length() > largo) {
               mayor = user;
               largo = user.length();
            }

        }
    return mayor;
    }

    // 6.  Crea una función que reciba un texto y devuelva cuántas vocales contiene.


    // 7. Diseña una función que reciba una lista de enteros y devuelva una nueva lista con solo los números pares.


    // 8. Escribe una función que simule una contraseña segura:
    // recibe un String y devuelve true si tiene al menos 8 caracteres,
    // una mayúscula, una minúscula y un número.


    // 9. Crea una función que reciba una frase y una palabra,
    // y devuelva cuántas veces aparece esa palabra en la frase.


    // 10. Define una función recursiva que calcule el factorial de un número (sin usar bucles).

}

