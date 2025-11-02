package basic.c01_beginner;

public class VariablesyConstantes {

    public static void main(String[] args) {

        //Variables

        String name = "Antonio";
        System.out.println(name);

        name = "ToniDev";
        System.out.println(name);

        // name= 37; Error (no podemos cambiar el tipo de dato, 37 es un int, si fuera string seria con "")

        int age = 29;
        System.out.println(age);

        var email = "tonigstm96@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        //Si usas var no hace falta tipar la variable (int, double, string...) pero como es momento de aprender, es buena idea usar el correcto.

        //Constantes

        final String EMAIL = "tonigstm96@gmail.com";
        // EMAIL = "gimmemydollas@gmail.com"; Es constante, porque se usó final, por lo tanto no puede variar
        System.out.println(EMAIL);
    }
}