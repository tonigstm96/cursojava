package basic.c08_oop;

public class Car {
    String model;
    String brand;
    private int speed;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void showData() {
        System.out.println("El coche es de la marca + " + brand + " y es el modelo " + model);
    }

    public void accelerate(int amount) {
        if (amount > 0 && (amount + speed) <= 120) {
            speed += amount;
        }
        else {
            System.out.println("El coche no puede acelerar esta cantidad");
        }
    }

    public void brake(int amount) {
        if (amount >= 0) {
            speed -= amount;
        }
        else {
            System.out.println("El coche no puede frenar una cantidad negativa");
        }
    }

}
