package basic.c08_oop;

public class AccessModifiersExercises {
    // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
    public static void main(String[] args) {
        Person toni = new Person("Toni", 29, "123456789A");
        toni.setName("Antonio");
        toni.setAge(30);

        System.out.println("Me llamo " + toni.getName() + " y tengo " + toni.getAge() + " años");

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

        Product fanta = new Product("Fanta", 2.20);
        fanta.setPrice(-10);
        System.out.println(fanta.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

        BankAccount cuenta = new BankAccount(2000);
        cuenta.deposit(-100);
        cuenta.withdraw(3000);
        System.out.println(cuenta.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.

        Book harry = new Book("El cáliz de fuego", "JK Terfa");
        System.out.println(harry.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        Temperature grados = new Temperature(50);
        grados.setCelsius(66);
        System.out.println(grados.getCelsius());
        grados.setCelsius(266);
        System.out.println(grados.getCelsius());


        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        User prueba = new User("toni", "12345");
        prueba.checkPassword("54321");
        prueba.checkPassword("12345");

        prueba.setUsername("toniguti");
        prueba.setPassword("jejeje");
        prueba.checkPassword("12345");
        prueba.checkPassword("jejeje");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        Employee empleado = new Employee(1200);
        empleado.raiseSalary(0);
        empleado.raiseSalary(5);
        System.out.println(empleado.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        Rectangle r = new Rectangle(10, 20);
        r.area();

        r.setAncho(100);
        r.setLargo(200);
        r.area();


        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        Student estudiante = new Student(100);
        System.out.println(estudiante.isPassed());
        estudiante.setScore(59);
        System.out.println(estudiante.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        Car mazda = new Car("RX8", "Mazda");
        mazda.setSpeed(0);
        System.out.println(mazda.getSpeed());
        mazda.accelerate(100);
        System.out.println(mazda.getSpeed());
        mazda.accelerate(120);
        System.out.println(mazda.getSpeed());
        mazda.brake(50);
        System.out.println(mazda.getSpeed());
        mazda.brake(-20);
        System.out.println(mazda.getSpeed());

    }
}
