import java.util.Scanner;

public class ChangeLetter  {
  // Change every occurrence of "John" in the
  // text of a form letter to "Robert"
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    

    // There are two strings - the input string
    // inString and the output string outString
    String inString = new String(),
           outString = new String();

    // indexOfJohn is the position within the
    // string where the next occurrence of John
    // begins.
    int  indexOfJohn;
    // Prompt the user and instruct him.her how
    // to indicate the end of the letter
    System.out.println("Please begin typing. "
         + "     End by typing \'The End\'");
    inString = keyb.nextLine();

    // Keep changing as long as (s)he didn't 
    // type "the end"
    while
       (!inString.equalsIgnoreCase("The End"))  {
      // Find the occurrence of John
      indexOfJohn = inString.indexOf("John");
      // As long as there are more occurrences of 
      // John, replace it with Robert
      while (indexOfJohn != -1){
        // create a string with everything up to
        // "John"
        outString 
             = inString.substring(0,indexOfJohn);

        // Add "Robert" at the end of the
        // substring
        outString = outString.concat("Robert");
        // Concatenate everything in the input
        // string after the next occurrence of
        // "John"
        outString = outString.concat(
              inString.substring(indexOfJohn+4));

        // This replaces the input string – get
        // the new value for indexOfJohn
        inString = outString;
        indexOfJohn = inString.indexOf("John");
      }
      // Output the new line of text
      System.out.println(outString);

      // Get the next line
      inString = keyb.nextLine();
    }
  }
}
