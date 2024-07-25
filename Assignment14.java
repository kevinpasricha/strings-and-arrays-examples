import java.util.Scanner; //Import Scanner to read in user input

public class Assignment14 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String s;
        int count = 0; //Set up a counter to count the lines containing the String 'is'


        // Start of a loop that prompts the user for input, until they write 'The end'
        // which is when the program will end
        while (true) {
        System.out.println("Enter a line of text");
        s = keyb.nextLine();
        if (s.equals("The end")) {
            break;
        }
        // This looks for 'is' in the input from the user, and it adds 1 to the count
        // for every time 'is' is found
        if (s.indexOf("is") !=-1) {
            count++;
        }
    }
            keyb.close();
            System.out.println("Number of lines with 'is' = "+ count); //Statement with count

}
    }
    //Program end


