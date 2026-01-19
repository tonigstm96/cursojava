package basic.c08_test_oop;

import basic.c08_oop.Person;

public class Classes {

    public static void main (String[] args) {

        var person = new Person("Toni",29, "12345678A");

        // person.name = "Toni";
        // person.age = 29;

        person.sayHello();

        //person.name = "Toni Gutiérrez";

        //System.out.println(person.name);

        //var person2 = new Person("Toniguti", 18);
        //person2.sayHello();
    }
}

