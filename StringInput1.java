import java.util.Scanner;

public class StringInput1  {
  public static void main(String[] args)  {
      Scanner keyb = new Scanner(System.in);
      String s = new String();
      
      System.out.println("Enter your string");
      s = keyb.next();
      
      System.out.println("Your string is \""  + s + "\".");
  }
}
