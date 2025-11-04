package basic.c05_structures;

import java.util.HashSet;

public class Set {

    public static void main (String[] args) {

        // Declaración y creación

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Toni");
        names.add("Guti");
        names.add("Simón");
        names.add("tonigstm96@gmail.com");
        System.out.println(names.size());
        System.out.println(names);  /* No puedo ni acceder ni modificar porque al guardar los datos de forma
         desordenada no hay forma de saber donde están */

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        //Eliminar elementos

        names.remove("Toni");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Toni"));
        System.out.println(names.contains("Guti"));

        System.out.println(names);
        names.add("Guti");
        names.add("Guti");
        names.add("Guti");
        System.out.println(names); // Los Sets no permiten elementos repetidos

        // Trabajo con conjuntos

        // names.addAll(numbers); Error por incompatibilidad de datos

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Alemania");
        countries.add("Francia");
        countries.add("Guti");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries); // Eliminará posibles elementos en común, en este caso "Guti"
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
