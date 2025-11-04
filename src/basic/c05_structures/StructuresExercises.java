package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numbers = new int[5];
        System.out.println(numbers.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(numbers[0]);
        numbers[0] = 99;
        System.out.println(numbers[0]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("toni");
        names.add("kelian");
        names.add("eloy");
        names.add("alberto");
        System.out.println(names);
        names.remove("alberto");
        System.out.println(names);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> countries = new HashSet<>();
        countries.add("España");
        countries.add("Francia");
        System.out.println(countries);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        countries.add("España");
        countries.add("Italia");
        System.out.println(countries);

        // 7. Elimina uno de los elementos del HashSet.
        countries.remove("Italia");
        System.out.println(countries);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> tlf = new HashMap<>();
        tlf.put("Toni", 699627671);
        tlf.put("Kelian", 666666666);
        tlf.put("Eloy", 777777777);
        System.out.println(tlf);

        // 9. Modifica uno de los contactos y elimina otro.
        tlf.put("Kelian", 623623623);
        tlf.remove("Eloy");
        System.out.println(tlf);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array = {"uno", "dos", "tres", "cuatro"};

        ArrayList<String> lista = new ArrayList<>(Arrays.asList(array));
        System.out.println("Arraylist:" + lista);

        HashSet<String> conjunto = new HashSet<>(lista);
        System.out.println("HashSet:" + conjunto);

        HashMap<String, String> mapa = new HashMap<>();
        for (String valor: conjunto) {
            mapa.put(valor, valor);
        }
        System.out.println("HashMap:" + mapa);
    }
}
