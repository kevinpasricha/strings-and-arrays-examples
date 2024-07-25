import java.util.Scanner; //Import Scanner for user inputs

public class Assignment15 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        // Declare variables and counter
        String s;
        int totalChanges = 0;

        // Loop that will keep going until user inputs 'The end'
        while (true) {
            System.out.println("Please enter a line of text");
            s = keyb.nextLine();
            if (s.equals("The end")) {
                break;
            }

            // This block replaces 'is' with 'was' and counts how many times it did it
            int changesLine = 0;
            StringBuilder modifiedString = new StringBuilder();
            int currentIndex = 0;

            while (true) {
                int index = s.indexOf("is", currentIndex);
            if (index == -1) {
                    modifiedString.append(s.substring(currentIndex));
                    break;
            }
        

                modifiedString.append(s.substring(currentIndex, index));
                modifiedString.append("was");
                currentIndex = index + 2;
                changesLine++;
        }
                // Prints the updated line for the user to view
                totalChanges +=changesLine;
                System.out.println("Updated Line: " + modifiedString.toString());
    }
                keyb.close();
                System.out.println("Total changes made :" + totalChanges); //Total change is printed


                }
            }
            // Program end