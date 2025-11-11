package sess05_arrays_and_strings;

import java.util.Scanner;

/**
 * Java program to analyse the score details of a class in various
 * subjects/modules.
 * 
 * @author Window
 */
public class TwoDimArrayScoreAnalysis
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // variables to be used in the program
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0; // looping variables
        int numofStudents, numOfModules; //variables for the no. of students & modules/subjects
        String [] studentNames, moduleNames; // string array for the names of the students and modules/subjects
        int [] totalScore, studScore[]; // integer arrays for the total score and individual scores.
        float meanScore[]; // Float array to hold each student's mean/av. score.
        char grade[]; // char array to hold each student's grade.
        String [] comment; //string array to hold each student's performance comment.
        
        //prompt the user for the number of student's in the class and read in their names
        System.out.println("How many student's are there in the class?");
        numofStudents = sc.nextInt();
        studentNames = new String[numofStudents]; // instantiate the student names array
        for(; n < studentNames.length; n++)
        {
            System.out.println("Please enter the name of student " + n + 1);
            studentNames[n] = sc.next();
        }
        
        //prompt the user for the number of modules and read in their names
        System.out.println("How many modules/subjects are the students taking?");
        numOfModules = sc.nextInt();
        moduleNames = new String[numOfModules]; // instantiate the module names array
        for(n = 0; n < moduleNames.length; n++)
        {
            System.out.println("Please enter the name of module " + n + 1);
            moduleNames[n] = sc.next();
        }
        
        // Instantiate all the remaining arrays
        studScore = new int[numofStudents][numOfModules];
        totalScore = new int[numofStudents];
        meanScore = new float[numOfModules];
        grade = new char[numofStudents];
        comment = new String[numofStudents];
    }
}
