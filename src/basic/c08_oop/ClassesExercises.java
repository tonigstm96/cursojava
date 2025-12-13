package basic.c08_oop;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        /*Book libro = new Book();
        libro.title = "Harry Potter";
        libro.author = "JK. Rowling";
        System.out.println("El libro es " + libro.title + " y su autor/a es " + libro.author); (en comment porque se
        creó un consructor*/

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        Dog tobby = new Dog();
        tobby.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        Book libro2 = new Book("Inferno", "Barlowe");
        System.out.println("El libro es " + libro2.title + " y su autor/a es " + libro2.author);

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        Car cochazo = new Car("Testarosa", "Ferrari");
        cochazo.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        Student toni = new Student(100);
        Student pepito = new Student(49);

        toni.passed();
        pepito.passed();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        BankAccount cuenta = new BankAccount(2000);
        cuenta.deposit(1500);
        System.out.println(cuenta.balance);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        Rectangle r = new Rectangle(10, 20);

        r.perimeter();
        r.area();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        Worker timmy = new Worker("Timmy", 1200);
        timmy.mostrarSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        Person a = new Person("Pepito",18);
        Person b = new Person("Pepita",19);
        Person c = new Person("Pepin",20);
        Person d = new Person("Pepi",21);

        ArrayList<Person> personas = new ArrayList<>();
        personas.add(a);
        personas.add(b);
        personas.add(c);
        personas.add(d);

        //forma más rápida

        ArrayList<Person> personas2 = new ArrayList<>();
        personas2.add(new Person("Pepito",18));
        personas2.add(new Person("Pepita",19));
        personas2.add(new Person("Pepin",20));

        for (Person p : personas2) {
            System.out.println("Persona: " + p.name + " edad: " + p.age);
        }


        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

        Product pan = new Product("Pan", 3);
        System.out.println("El precio del " + pan.name + " con descuento es: " + pan.discount(10));
    }
}
