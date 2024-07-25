import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int numJudges = 7;  // Number of judges
        float[] scores = new float[numJudges];  // Array basket to store judge scores
        float difficulty;
        float totalScore;

        // Input and validate the difficulty levels for the divers
        while (true) {
            System.out.println("Enter difficulty level (1.2 to 3.8): ");
            difficulty = keyb.nextFloat();
            if (difficulty >= 1.2 && difficulty <= 3.8) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a value between 1.2 and 3.8.");
            }
        }

        // Input and validate the scores from all 7 judges
        for (int i = 0; i < numJudges; i++) {
            while (true) {
                System.out.printf("Enter score from judge %d: ", i + 1);
                scores[i] = keyb.nextFloat();
                if (scores[i] >= 0.0 && scores[i] <= 10.0) {
                    break;
                } else {
                    System.out.println("Invalid input. Enter a value between 0.0 and 10.0.");
                }
            }
        }

        // Calculate the total score
        totalScore = calculateTotalScore(scores, difficulty);

        // Output the total score
        System.out.printf("The diver's score is: %.2f\n", totalScore);

        keyb.close();
    }

    // Method to calculate the total score
    private static float calculateTotalScore(float[] scores, float difficulty) {
        // Find the highest and lowest scores
        float highest = scores[0];
        float lowest = scores[0];
        float sumOfScores = 0;
        
        for (float score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            sumOfScores += score;
        }
        
        // Subtract the highest and lowest scores from the sum
        sumOfScores = sumOfScores - highest - lowest;

        // Calculate the total score
        return sumOfScores * difficulty * 0.6f;
    }
}
// Program end
