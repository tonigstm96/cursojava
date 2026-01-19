package basic.c08_oop;

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary *= ((percent / 100) + 1);
        }
        else {
            System.out.println("El aumento de salario no puede ser 0 o menor");
        }
    }
}
