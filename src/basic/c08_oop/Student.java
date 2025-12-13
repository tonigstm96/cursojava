package basic.c08_oop;

public class Student {
    double score;

    public Student(double score) {
        this.score = score;
    }

    public void passed(){
        if (score >= 60){
            System.out.println("El alumno ha aprobado");
        }
        else {
            System.out.println("El alumno ha suspendido");
        }
    }
}
