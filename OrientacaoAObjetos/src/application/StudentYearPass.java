package application;

import entities.Student;
import java.util.Scanner;

public class StudentYearPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter the grade for the first trimester (0-30): ");
        double firstTrimesterGrade = sc.nextDouble();
        while (firstTrimesterGrade < 0 || firstTrimesterGrade > 30){
            System.out.print("Enter a correct grade (0-30): ");
            firstTrimesterGrade = sc.nextDouble();
        }
        System.out.print("Enter the grade for the second trimester (0-35): ");
        double secondTrimesterGrade = sc.nextDouble();
        while (secondTrimesterGrade < 0 || secondTrimesterGrade > 35){
            System.out.print("Enter a correct grade (0-35): ");
            secondTrimesterGrade = sc.nextDouble();
        }
        System.out.print("Enter the grade for the third trimester (0-35): ");
        double thirdTrimesterGrade = sc.nextDouble();
        while (thirdTrimesterGrade < 0 || thirdTrimesterGrade > 35){
            System.out.print("Enter a correct grade (0-35): ");
            thirdTrimesterGrade = sc.nextDouble();
        }

        Student stu1 = new Student(studentName, firstTrimesterGrade, secondTrimesterGrade, thirdTrimesterGrade);
        stu1.result();
    }
}
