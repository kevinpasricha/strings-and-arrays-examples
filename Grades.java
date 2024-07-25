import java.util.Scanner;

public class Grades {
  final static int numStudents = 30, 
                   numExams = 4;
  
  static int[][] grades 
               = new int [numStudents][numExams];
  static int[] averages = new int[numStudents];
  // CalcAverages() - Calculate the term 
  //     averages for a class
  //     The average is based on
  //     four exams
  public static void main(String[] args)  {
    //Get the grades, find the averages and 
    //print them
    readGrades();
    findAverages();
    writeGrades();
  }
  // readGrades() - Read the complete set of
  //                grades 
  public static void readGrades()  {
    Scanner keyb = new Scanner(System.in);
    String  inString = new String();
    int i, j;
    // Get each students grade
    for (i = 0;  i < numStudents;  i++) {
      //Get the next grade for this student
      for (j = 0;  j < numExams;  j++) {
        System.out.println("Grade on test #" + j
                + " for student # " + i + "\t?");
        grades[i][j] = keyb.nextInt();
      }
      //Skip one line for clarity
      System.out.println();
    }
  }
  // findAverages() - Find the average for each
  //                  student
  public static void findAverages()  {
    int i, j, sum;
    
    for (i = 0;  i < numStudents;  i++) {
      sum = 0;               
      for (j = 0;  j < numExams;  j++)
        sum += grades[i][j];
      averages[i] = sum/numExams;
    }
  }
  // WriteGrades() - Output the grades and
  //                 average for each student
  public static void writeGrades()  {
    int i, j;
    
    // Print a heading
    System.out.println("Student Exam1\tExam2\t"  
                     + "Exam3\tExam4\tAverage");
    
    for (i = 0;  i < numStudents;  i++) {
      // Number each line, then print the grades
      // and the average for the next student
      System.out.print(i);
      for (j = 0;  j < numExams; j++) {
        System.out.print("\t");
        System.out.print(grades[i][j]);
      }
      System.out.println("\t" + averages[i] );
    }
  }
}

