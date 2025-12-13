package basic.c08_oop;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double discount(double descuento){
        price *= 1 - (descuento / 100);
        return price;
    }
}
