package basic.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {

        bienvenida();
        saludo("toni");
        System.out.println(resta(10, 5));
        cuadrado(3);
        parImpar(7);
        boolean edad = edad(18);
        if (!edad) {
            System.out.println("El usuario es menor de edad");
        }
        else {
            System.out.println("El usuario es mayor de edad");
        }
        System.out.println(longitud("Antonio"));
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(array(enteros));
        System.out.println(factorial(3));

        var users = new ArrayList<String>(Arrays.asList("Toni@gmail.com", "Guti@gmail.com", "Simón@gmail.com"));
        recorrer(users);
    }

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");

    }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

    public static void saludo(String name){
        System.out.println("Saludos, " + name);

    }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.

    public static int resta(int a, int b) {
       return a - b;
    }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).

    public static void cuadrado(int a) {
            System.out.println(a * a);
    }

        // 5. Escribe una función que reciba un número y diga si es par o impar.

    public static void parImpar(int a) {
        if (a % 2 == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

    public static boolean edad(int a) {

        if (a >= 18) {
            return true;
        }
        return false;
    }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

    public static int longitud(String cadena) {

        return cadena.length();
    }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

    public static double array(Integer[] enteros) {

        int suma = 0;

        for (int entero : enteros) {
            suma += entero;
        }

        return (double) suma / enteros.length;

    }
        // 9. Escribe un método que reciba un número y retorna su factorial.

    public static int factorial(int factorial) {
        int aux = 1;

        for (int i = 1; i <= factorial; i++) {
            aux = aux * i;
        }
        return aux;
    }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    public static void recorrer(ArrayList<String> users){

        for (String user : users) {
            System.out.println(user);
        }
    }

}
