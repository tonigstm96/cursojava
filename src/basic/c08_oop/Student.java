package basic.c08_oop;

public class Student {
    private double score;

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
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

    public boolean isPassed(){
        if (score >= 60){
            return true;
        }
        else {
            return false;
        }
    }
}
