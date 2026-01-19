package basic.c08_oop;

public class Person {

    // Atributos
    private String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años, y mi id es: " + id);
    }

    // Getter
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
