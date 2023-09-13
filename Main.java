// Below is a sample run of the program. Values entered by the user are shown in bold face.
//
//Please enter your grade: 87.5
//Your grade is B+.
//
//[92, ∞): A
//        [89, 92): A-
//        [87, 89): B+
//        [82, 87): B
//        [79, 82): B-
//        [77, 79): C+
//        [72, 77): C
//        [69, 72): C-
//        [67, 69): D+
//        [60, 67): D
//        [0, 60): F

import java.util.Scanner; //import Scanner class
public class Main {
    static Scanner sc = new Scanner(System.in); // assign Scanner

    //Conditionals
    //Outputs Letter Grade
    static String gradeCalc(double x) {
        if (x >= 92.0) {
            return ("A");
        } else if (x < 92.0 && x >= 89.0) {
            return ("A-");
        } else if (x < 89.0 && x >= 87.0) {
            return ("B+");
        } else if (x < 87.0 && x >= 82.0) {
            return ("B");
        } else if (x < 82.0 && x >= 79.0) {
            return ("B-+");
        } else if (x < 79.0 && x >= 77.0) {
            return ("C+");
        } else if (x < 77.0 && x >= 72.0) {
            return ("C");
        } else if (x < 72.0 && x >= 69.0) {
            return ("C-");
        } else if (x < 69.0 && x >= 67.0) {
            return ("D+");
        } else if (x < 67.0 && x >= 60.0) {
            return ("D");
        } else if (x < 60 && x > 0) {
            return ("F");
        } else
            return ("Error: Invalid Input");
    }

    //User Input
    static double inputGrade() {
        System.out.println("Please enter your grade: ");
        double x = sc.nextDouble();
        return x;

    }

// Main Method
//Do While loop to keep prompting user for grade.
    public static void main(String[] args) {

        do {
            double x = inputGrade();
            String grade = gradeCalc(x);
            System.out.println("Your letter grade is: " + grade);
            sc.nextLine();
        } while (true);
    }
}