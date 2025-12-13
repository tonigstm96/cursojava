package basic.c08_oop;

public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double ingreso) {
        balance += ingreso;
    }
}
