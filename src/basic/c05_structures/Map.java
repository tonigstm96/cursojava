package basic.c05_structures;

import java.util.HashMap;

public class Map {

    public static void main (String[] args) {

        // Declaración y creación

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("Toni", "tonigstm96@gmail.com");
        names.put("Kelian", "kelianiko@gmail.com");
        names.put("Eloy", "returns@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("Toni"));
        System.out.println(names.get("Dev"));

        // Verificar elementos

        System.out.println(names.containsKey("Toni"));
        System.out.println(names.containsKey("Dev"));

        System.out.println(names.containsValue("tonigstm96@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("Toni"));
        System.out.println(names.remove("Kelian"));
        System.out.println(names);

        // Limpiar HashMap

        names.clear();
        System.out.println(names);

        // Otras operaciones

        names.put("Eloy","returns@gmail.com");
        System.out.println(names);

        names.put("Eloy","returns96@gmail.com");
        System.out.println(names); //segundo put modifica el valor

        names.replace("Toni","toniguti96@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Toni", "tonigstm96@gmail.com");
        System.out.println(names);

        System.out.println(names.isEmpty());
        var values= names.values();
        System.out.println(values);
    }
}
