import java.util.ArrayList;

public class Student {
    private ArrayList<Double> grades = new ArrayList<>();
    int totalNumberOfStudents;

    public Student(int totalNumberOfStudents) {
        this.totalNumberOfStudents = totalNumberOfStudents;
    }

    public double calculateGrade() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum;
    }

    public double calculateAverageGrade() {
        double sum = calculateGrade();
        double averageGrade = sum / totalNumberOfStudents;
        return averageGrade;
    }

    public static void main(String[] args) {

    }
}