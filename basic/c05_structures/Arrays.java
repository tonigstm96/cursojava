package basic.c05_structures;

public class Arrays {

    public static void main (String[] args) {

        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Toni", "Guti", "Simón"};
        System.out.println(names);

        // Acceso
        System.out.println(names[0]);
        System.out.println(numbers[2]);

        System.out.println((new String [3])[0]);

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // numbers[3] = 2; Error, esta espacio no está reservado, la longitud es 3 (Espacios 0,1,2)

        System.out.println(names[2]);
        names[2] = "tonigstm96@gmail.com";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null; Error, array de ints es primitivo, no se puede añadir una string

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
