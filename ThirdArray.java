import java.util.Scanner;

public class ThirdArray {
    // FirstArray() - Find the highest score among a 
    //                group of 10 scores
    public static void main(String[] args)  {
        Scanner keyb = new Scanner(System.in);
        int [] scores = new int[10];
        int i, maxScore, minScore;
        
        readScores(scores);
        
        for (i = 0;  i < scores.length;  i++)
            System.out.print("  " + scores[i]);
        System.out.println();
        // Read in the array
        
        // Find the high score
        maxScore = findMax(scores);
        System.out.println(maxScore);
        minScore = findMin(scores);
        System.out.println(minScore);
        // Print the result
        System.out.println("The highest score is " + maxScore);
    }
    
    public static void readScores(int[] scores) {
        Scanner keyb = new Scanner(System.in);
        for (int i = 0;  i < scores.length;  i++)  {
            System.out.println("Enter grade #" + i);
            scores[i] = keyb.nextInt();
        }
    }
    
    public static int findMax(int[] scores) {  
        int maxScore = scores[0];
        for (int i = 1;  i < scores.length;  i++) {
            if (scores[i] > maxScore)
                maxScore = scores[i];
        }
      return maxScore;
    } 
    
    public static int findMin(int[] scores) {
        int minScore = scores[0];
        
        for (int i = 0;  i < scores.length; i++) {
            if (scores[i] < minScore)
                minScore = scores[i];
        }
        return minScore;
    }
}
