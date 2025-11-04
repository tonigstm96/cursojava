package basic.c04_conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 17;

        if (age >= 18) {
            System.out.println("El usuario puede votar");

        }
        else {
            System.out.println("El usuario no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 5;
        int b = 7;

        if (a == b) {
            System.out.println("Los números son iguales");
        }
        else if (a > b){
            System.out.println("A es mayor que b");
        }
        else {
            System.out.println("A es menor que b");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int c = 0;

        if (c > 0) {
            System.out.println("C es positivo");
        }
        else if (c < 0) {
            System.out.println("C es negativo");
        }
        else {
            System.out.println("C es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int d = 21;

        if (d % 2 == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.

        int e = 101;

        if ((e > 0) && (e <= 100)) {
            System.out.println("El número está en el rango");
        }
        else {
            System.out.println("El número no está en el rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var day = 7;

        switch (day) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miércoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sábado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("No has añadido un número válido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        int nota = 50;

        if (nota >= 90) {
            System.out.println("Sobresaliente");
        }
        else if (nota >= 50) {
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Suspenso");
        }


        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var ageC = 14;
        boolean compa = true;

        if ((ageC >= 15) || (ageC < 15 && (compa))) {
            System.out.println("Puedes entrar al cine");
        }
        else {
            System.out.println("No puedes entrar al cine");
        }


        // 9. Crea un programa que diga si una letra es vocal o consonante.

        var letra = "i";

        switch (letra.toLowerCase()) { //Convierte la letra a minúscula, pequeño filtro de errores
            case "a": case "e": case "i": case "o": case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var xa = 200;
        var xb = 87;
        var xc = 12;

        if ((xa > xb) && (xa>xc)){
            System.out.println("A es mayor que b y c");
        }
        else if ((xb > xa) && (xb>xc)) {
            System.out.println("B es mayor que a y c");
        }
        else {
            System.out.println("C es mayor que a y b");
        }

    }
}

