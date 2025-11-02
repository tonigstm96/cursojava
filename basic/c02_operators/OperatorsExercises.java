package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        double a = 2;
        double b = 3;
        double suma = a + b;
        double resta = a - b;
        double multi = a * b;
        double divi = a / b;
        double resto = a % b;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(divi);
        System.out.println(resto);

        // 2. Crea una variable para cada tipo de operación de asignación.

        double igual = a = b;
        System.out.println(igual);
        double igualMultab = a = b * 2;
        System.out.println(igualMultab);
        double igualMinus = a -=1;
        System.out.println(igualMinus);
        double igualMult = a *=2;
        System.out.println(igualMult);
        double igualDivi = a /=2;
        System.out.println(igualDivi);
        double igualResto = a %=2;
        System.out.println(igualResto);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a == 1);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a == 2);

        // 5. Utiliza el operador lógico and.

        boolean verdad = true;
        boolean mentira = false;

        System.out.println(verdad && verdad);

        // 6. Utiliza el operador lógico or.

        System.out.println(verdad || mentira);

        // 7. Combina ambos operadores lógicos.

        System.out.println((verdad && verdad) || mentira);

        // 8. Añade alguna negación.

        System.out.println((verdad && verdad) || !mentira);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(-a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println(((a * b) >= 20) && verdad);
    }
}
