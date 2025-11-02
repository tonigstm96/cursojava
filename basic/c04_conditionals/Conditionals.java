package basic.c04_conditionals;

public class Conditionals {
    public static void main (String[] args) {

        // Condicionales

        var age = 30;

        System.out.println(age >= 18);

        if ((age > 18) && (age != 30)) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18 años");
        } else if (age == 30) {
            System.out.println("Viejoven");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // Switch

        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
        // Se debe pensar cual de las dos opciones es mejor dependiendo de cuantas variables y casos se deben analizar.
    }

    }