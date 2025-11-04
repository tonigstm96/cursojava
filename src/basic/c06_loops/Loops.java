package basic.c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main (String[] args){

        //Loops

        /* - for (primera parte es una variable que definimos (como un contador), ej i = 0, segunda parte se repetirá mientras se cumpla algo, ej i <5)
        mientras que la tercera es lo que pasará cada bucle*/

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }

        String[] names = {"Toni", "Guti", "Simón"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // for each (ideal para recorrer listas)

        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        for (Integer number: numbers){
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Toni", "tonigstm96@gmail.com");
        emails.put("Kelian", "kelianiko@gmail.com");
        emails.put("Eloy", "returns@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // - while

        int index = 0;
        while (index < 5){
            System.out.println("Hola, Java");
            index++;
        }

        index = 0;
        while (index < names.length){
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index].equals("Guti")) {
                find = true;
            }
            index++;
        }

        // -do-while

        index = 0;
        do {
            System.out.println("Hola, Java");
            index++;
        } while (index < 0);

        // Control de bucles

        // - break (sale del bucle)

        for (String name: names) {
            if (name.equals("Guti")){
                break;
            }
            System.out.println(name);
        }

        // - continue (fuerza siguiente ejecución del bucle)

        for (int i = 0; i <5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
     }
}