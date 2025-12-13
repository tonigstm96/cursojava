package basic.c08_oop;

public class Rectangle {
   int largo;
   int ancho;

    public Rectangle(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void perimeter(){
        System.out.println("El perímetro del rectángulo es " + 2*(largo + ancho));
    }

    public void area(){
        System.out.println("El área del rectángulo es " + (largo * ancho));
    }
}
