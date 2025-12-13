package basic.c08_oop;

public class Car {
    String model;
    String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    public void showData() {
        System.out.println("El coche es de la marca + " + brand + " y es el modelo " + model);
    }
}
