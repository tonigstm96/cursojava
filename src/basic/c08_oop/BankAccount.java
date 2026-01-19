package basic.c08_oop;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("El depósito no puede ser menor o igual cero");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("No puede retirar cero o menos");
        }
        else if (amount > balance) {
            System.out.println("No puede retirar más de lo que dispone");
        }
        else {
            balance -= amount;
        }
    }
}
