package basic.c08_oop;

public class Product {
    String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("El precio no puede ser menor o igual a cero");
        }
    }

    public double getPrice() {
        return price;
    }

    public double discount(double descuento){
        price *= 1 - (descuento / 100);
        return price;
    }
}
