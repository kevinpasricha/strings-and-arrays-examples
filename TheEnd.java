// Kevin Pasricha
// July 12, 2024
// TheEnd.java

import java.util.Scanner; //Import scanner to read in user input

public class TheEnd { //Name of the program
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String s;

        // Starting a loop that defines the parameters
        // While the user types "s" (String), keep looping the program. Otherwise,
        // if the user types The end, the program will stop.
        while (true) {
            System.out.println("Please enter a line of text");
            s = keyb.nextLine();
            if (s.equals("The end")) {
                break;
            }
            System.out.println ("You entered: " + s);
        }

        keyb.close();
        
            }
}
    // Program end