package basic.c08_oop;

public class Classes {

    public static void main (String[] args) {

        var person = new Person("Toni",-29,"12345678A");

        // person.name = "Toni";
        // person.age = 29;

        person.sayHello();

        person.setName("Toni Gutiérrez");
        System.out.println(person.getName());

        // person.id = "12345678A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("Toniguti", 18, "12345678B");
        person2.sayHello();
    }
}

