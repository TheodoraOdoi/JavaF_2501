package sess03_selection_and_iteration;

import java.util.Scanner;

/**
 * Java program that accepts the score of students in four subjects
 * and calculates the average, grade, and comment.
 * 
 * @author Window
 */

public class StudentGrading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Enter the student's scores in their various subjects (Maths,English,Swahili & Chemestry)
        System.out.print("Enter Math score: ");
        int math = input.nextInt();

        System.out.print("Enter English score: ");
        int english = input.nextInt();

        System.out.print("Enter Swahili score: ");
        int swahili = input.nextInt();

        System.out.print("Enter Chemistry score: ");
        int chemistry = input.nextInt();

        /// 2. Calculate the student's average score
        double average = (math + english + swahili + chemistry) / 4.0;

        // 3. Declare grade and comment
        char grade;
        String comment;

        // 4. Determine the student's grade and comment
        if (average >= 70 && average <= 100) {
            grade = 'A';
            comment = "Excellent!";
        } else if (average >= 60) {
            grade = 'B';
            comment = "Very Good!";
        } else if (average >= 50) {
            grade = 'C';
            comment = "Good effort.";
        } else if (average >= 40) {
            grade = 'D';
            comment = "Needs improvement.";
        } else if (average >= 0) {
            grade = 'E';
            comment = "Work harder next time!";
        } else {
            grade = '-';
            comment = "Invalid score.";
        }

        // 5. Display the results
        System.out.println("+".repeat(62));
        System.out.println("         STUDENT SCORE ANALYSIS         ");
        System.out.println("+".repeat(62));
        System.out.printf("Math:       %d%n", math);
        System.out.printf("English:    %d%n", english);
        System.out.printf("Swahili:    %d%n", swahili);
        System.out.printf("Chemistry:  %d%n", chemistry);
        System.out.println("+".repeat(62));
        System.out.printf("Average:    %.2f%n", average);
        System.out.println("Grade:      " + grade);
        System.out.println("Comment:    " + comment);
        System.out.println("+".repeat(62));
        System.exit(0);

        input.close();
    }
}
