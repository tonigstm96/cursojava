package basic.c08_oop;

public class Temperature {
    private double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius <= 100 && celsius >= -100) {
            this.celsius = celsius;
        }
        else {
            System.out.println("Los grados no pueden ser mayores que 100 ni menores que -100");
        }
    }
}
