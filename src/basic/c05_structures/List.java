package basic.c05_structures;

import java.util.ArrayList;

public class List {

    public static void main (String[] args) {

        // Declaración y creación

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Toni");
        names.add("Guti");
        names.add("Simón");
        System.out.println(names.size());

        // Acceder a los elementos

        //System.out.println(names.getFirst());
        //System.out.println(names.getLast()); Da error, porque es java 17, se necesita java 21

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        // Modificar los elementos

        names.set(2, "tonigstm96@gmail.com");
        System.out.println(names.get(2));

        // Eliminar elementos

        names.remove(2);
       // System.out.println(names.get(2)); Error, porque se ha eliminado el elemento
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Toni"));
        System.out.println(names.contains("tonigstm96@gmail.com"));

        // Limpiar ArrayList

        names.add("Toni");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}
