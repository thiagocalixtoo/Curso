package entities;

public class Student {
    private String studentName;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        studentName = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void result() {
        double finalGrade = getGrade1()+getGrade2()+getGrade3();
        if (getGrade1()+getGrade2()+getGrade3() >= 60){
            System.out.println("\nName: "+ getStudentName()+"\nFinal grade: " + finalGrade + "\nPASS");
        }else{
            System.out.println("\nName: "+ getStudentName()+"\nFinal grade " + finalGrade + "\nFAILED\nMISSING: " + (60-finalGrade) + " POINTS");
        }
    }
}
