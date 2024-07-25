import java.util.Scanner;

public class FirstArray   {
    // FirstArray() - Find the highest score among a 
    //                group of 10 scores
    public static void main(String[] args)  {
        Scanner keyb = new Scanner(System.in);
        int [] scores = new int[10];
        int i, maxScore;
        for (i = 0;  i < scores.length;  i++)  {
            System.out.println("Enter grade #" + i);
            scores[i] = keyb.nextInt();
        }
        
        // Find the high score
        maxScore = scores[0];
        for (i = 1;  i < scores.length;  i++) 
            if (scores[i] > maxScore)
                maxScore = scores[i];
        System.out.println("maxScore is now " + maxScore);

  }
}
