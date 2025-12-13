package basic.c08_oop;

public class Worker {
    String name;
    double salario;

    public Worker(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("El salario del trabajador es " + salario);
    }
}
