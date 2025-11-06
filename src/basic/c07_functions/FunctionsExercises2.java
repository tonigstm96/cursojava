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

        System.out.println("El texto tiene " + texto("lorem ipsum dolor sic amet") + " vocales");

        var lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Los numeros pares son: " + lista(lista));

        contrasenya("1234567890Jeje");
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

    public static int texto(String texto) {

        String textoLower = texto.toLowerCase().trim();
        int contador = 0;

        for (int i=0; i < textoLower.length(); i++) {
            if ((textoLower.charAt(i) == 'a') || (textoLower.charAt(i) == 'e') || (textoLower.charAt(i) == 'i') || (textoLower.charAt(i) == 'o') || (textoLower.charAt(i) == 'u')) {
                contador++;
            }
        }
        return contador;
    }

    /* solución más limpia con el uso de indexOf:

    public static int texto(String texto) {
        String textoLower = texto.toLowerCase();
        String vocales = "aeiou";
        int contador = 0;

        for (int i = 0; i < textoLower.length(); i++) {
            if (vocales.indexOf(textoLower.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    } */



    // 7. Diseña una función que reciba una lista de enteros y devuelva una nueva lista con solo los números pares.

    public static ArrayList<Integer> lista(ArrayList<Integer> lista) {

    var listaPares = new ArrayList<Integer>();

        for (Integer unidad : lista) {
            if (unidad % 2 == 0) {
                listaPares.add(unidad);
            }
        }
        return listaPares;
    }

    // 8. Escribe una función que simule una contraseña segura:
    // recibe un String y devuelve true si tiene al menos 8 caracteres,
    // una mayúscula, una minúscula y un número.

    public static boolean contrasenya(String contrasenya) {

        if (contrasenya.length() >= 8) {
            for (int i = 0; i < contrasenya.length(); i++) {
                if() {

                }
            }
        }
    }


    // 9. Crea una función que reciba una frase y una palabra,
    // y devuelva cuántas veces aparece esa palabra en la frase.


    // 10. Define una función recursiva que calcule el factorial de un número (sin usar bucles).

}

