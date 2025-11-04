package basic.c03_strings;

public class Strings {
    public static void main (String[] args) {

        // Cadenas de texto

        String name = "Toni";
        var surname = new String("Gutiérrez");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // CharAt (Obtener carácter en posición)
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(name.length() - 1)); //Carácter en última posición de un string

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java" .contains("Toni"));
        System.out.println("Hola, Java" .toUpperCase().contains("AVA")); // Tiene que ser coincidencia total, case sensitive
        System.out.println("Hola, Java" .contains("ava"));

        // Comparación
        System.out.println(name.equals("Toni"));
        System.out.println(name.equals("toni"));
        System.out.println(name.equalsIgnoreCase("toni"));

        // No usamos operador de igualdad (==)  -- == vs. equals

        var a = "Toni";
        var b = "Toni";
        var c = new String("Toni");

        System.out.println (a == b);
        System.out.println (a == c);
        System.out.println (a.equals(c));
        // .equals compara contenido, por eso usamos con strings

        // Trim
        System.out.println(" Hola, me llamo Eloy ".trim()); // (Recorta espacios en blanco a inicio y final

        // Replace
        System.out.println(" Hola, me llamo Eloy ".replace("Eloy", "Toni"));

        // Format
        var age = 29;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));

    }
}
