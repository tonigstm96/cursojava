package basic.c06_loops;

import java.util.*;

public class LoopsExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        ArrayList<String> names = new ArrayList<>();
        names.add("toni");
        names.add("kelian");
        names.add("eloy");
        index = 0;

        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        Integer [] numbers = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i= 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        HashMap<String, String> users = new HashMap<>();
        users.put("keli", "kelibeli@beli.com");
        users.put("returns", "returni@ret.com");
        users.put("titotoni", "toniti@ton.com");


        HashSet<String> hobbies = new HashSet<>();
        hobbies.add("airsoft");
        hobbies.add("gaming");
        hobbies.add("mtg");

        for (Map.Entry<String, String> user: users.entrySet()) {
            System.out.println(user.getKey());
            System.out.println(user.getValue());
        }

        for (String hobbie: hobbies){
            System.out.println(hobbie);
        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);

        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        Integer [] numbers2 = {1, 2, -3, 4, -5};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
            if (numbers2[i] < 0){
            break;
            }
        }



        // 10. Crea un programa que calcule el factorial de un número dado.


        System.out.println("Introduce un número para averiguar el factorial");
        int factorial = sc.nextInt();
        int aux = 1;

        for (int i = 1; i <= factorial; i++) {
             aux = aux * i;
        }
        System.out.println("El factorial de " + factorial + " es " + aux);
        sc.close();
    }
}
