package basic.c06_loops;

import java.util.*;

public class LoopsExercises2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. Imprime todos los números pares entre 1 y 100 usando for y continue.

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        // 2. Dado un array de 5 números, calcula el producto total de todos ellos.

        Integer [] numbers = {1, 2, 3, 4, 5};
        int resultado = 1;

        for (int i = 0; i < numbers.length; i++) {
            resultado = resultado * numbers[i];
        }
        System.out.println(resultado);

        // 3. Dado un array de Strings, imprime solo los nombres que estén en posiciones impares.

        String [] nombres = {"toni", "guti", "antonio", "tony", "kelian", "eloy"};

        for (int i = 0; i < nombres.length; i++) {
            if (i % 2 != 0) {
                System.out.println(nombres[i]);
            }
        }

        // 4. Dado un ArrayList<Integer> de 10 números, calcula la suma de los números pares.

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        resultado = 0;

        for (Integer num : nums) {
            if (num % 2 == 0) {
                resultado += num;
            }
        }
        System.out.println(resultado);

        // 5. Dado un array de enteros, cuenta cuántos son positivos y cuántos negativos.

        Integer [] nums2 = {1, 2, 3, -4, -5, 6, -7, -8};
        int contadorPos = 0;
        int contadorNeg = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > 0){
                contadorPos++;
            }
            else {
                contadorNeg++;
            }
        }
        System.out.println("Hay " + contadorPos + " números positivos y " + contadorNeg + " números negativos.");


        // 6. Dado un HashSet<String> con palabras, imprime solo las que tengan más de 4 letras.

        HashSet<String> hobbies = new HashSet<>(Arrays.asList("airsoft", "mtg", "gaming", "gym"));

        for (String hobbie:hobbies) {
            if (hobbie.length() > 4) {
                System.out.println(hobbie);
            }
        }


        // 7. Busca un nombre en una lista usando Scanner y for. Si lo encuentras, muestra "Encontrado" y detén el bucle.

        ArrayList<String> users = new ArrayList<>(Arrays.asList("toni", "guti", "antonio", "tony", "kelian", "eloy"));

        System.out.println("Escriba el nombre que quiere buscar:");
        String busqueda = sc.nextLine();
        boolean encontrado = false;

        for (String user:users) {
            if (busqueda.replace(" ","").toLowerCase().equals(user)) {
                System.out.println("Usuario encontrado!");
                encontrado = true;
                break;
            }
            }
        if (!encontrado){
            System.out.println("Usuario no encontrado");
        }
        sc.close();

        // 8. Dado un HashMap<String, Integer> con nombres y edades, muestra solo los mayores de 18 años.

        HashMap<String, Integer> compis = new HashMap<>();
        compis.put("keli", 30);
        compis.put("returns", 28);
        compis.put("titotoni", 29);
        compis.put("carlos", 17);
        compis.put("chavalito", 14);

        for (Map.Entry<String, Integer> compi:compis.entrySet()) {
            if (compi.getValue() > 18) {
                System.out.println(compi.getKey());
            }
        }


        // 9. Dado un ArrayList<Integer> con números positivos y negativos, suma hasta encontrar el primero negativo y detén el bucle.

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -5, 6, -7, -8));
        resultado = 0;

        for (Integer numerito:numeritos) {
            if (numerito > 0) {
               resultado +=numerito;
            }
            else {
                break;
            }
        }
        System.out.println(resultado);

        // 10. Imprime todos los números primos del 1 al 50 usando for anidado.


        for (int i = 2; i <= 50; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                        esPrimo = false;
                        break;
                }
            }
                if (esPrimo) {
                    System.out.println(i);
                }
        }

    }
}

